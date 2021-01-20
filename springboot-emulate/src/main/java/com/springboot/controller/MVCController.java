package com.springboot.controller;

import com.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MVCController {

  @Autowired
  private User user;

  @RequestMapping(value = "/boot/getUser", method = RequestMethod.GET)
  public Object getUser() {
    user.setId(100);
    user.setName("张无忌");
    List<User> userList = new ArrayList<User>();
    userList.add(user);
    return userList;
  }

  @GetMapping("/boot/getUser1")
  public Object getUser1(@RequestParam("id") int id) {
    user.setId(id);
    user.setName("张无忌");
    return user;
  }

  //采用RestFull风格
  @GetMapping("/boot/getUser2/{id}")
  public Object getUser2(@PathVariable("id") int id) {
    user.setId(id);
    user.setName("张三丰");
    return user;
  }
}
