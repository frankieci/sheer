package com.springboot.service;

import com.springboot.mapper.StudentMapper;
import com.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentMapper studentMapper;

  /**
   * 注入springboot自动配置好的RedisTemplate
   */
  @Autowired
  private RedisTemplate<Object, Object> redisTemplate;

  @Override
  public List<Student> getAllStudent() {
    //增强Redis key可读性 String
    RedisSerializer redisSerializer = new StringRedisSerializer();
    redisTemplate.setKeySerializer(redisSerializer);
    //存在高并发缓存穿透问题  同步锁解决
    //查询缓存
    List<Student> studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
    if (null == studentList) {
      synchronized (this) {
        studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
        if (null == studentList) {
          //缓存为空，查询数据库
          studentList = studentMapper.selectAllStudent();
          //把数据库查询的数据放入Redis中
          redisTemplate.opsForValue().set("allStudents", studentList);
        }
      }
    }

    return studentList;
  }

  @Autowired
  private Student student;

  @Transactional
  @Override
  public int updateStudent() {
    student.setId(1);
    student.setName("赵四");
    student.setAge(25);
    int updateResult = studentMapper.updateByPrimaryKeySelective(student);
    //运行时的异常，上一步的更新回滚
//    int a = 10 / 0;
    return updateResult;
  }

}
