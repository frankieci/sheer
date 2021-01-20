package com.springboot.thymeleaf.controller;

import com.springboot.thymeleaf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class ThymeleafController {
  @Autowired
  private User user;

  @RequestMapping(value = "/boot/index")
  public String gainIndex(Model model, HttpServletRequest request) {
    model.addAttribute("msg", "springboot 集成 thyme leaf");

    user.setId(1);
    user.setNick("昵称");
    user.setPhone("1234567");
    user.setEmail("xxx@163.com");
    user.setAddress("xxx");
    model.addAttribute("user", user);

    List<User> userList = new ArrayList<User>();
    Map<String, Object> userMap = new HashMap<String, Object>();
    User[] userArray = new User[10];

    for (int i = 0; i < 10; i++) {
      User user1 = new User();
      user1.setId(1 + i);
      user1.setNick("昵称" + i);
      user1.setPhone("1234567" + i);
      user1.setEmail("xxx@163.com" + i);
      user1.setAddress("xxx" + i);

      userList.add(user1);
      userMap.put(String.valueOf(i), user1);
      userArray[i] = user1;
    }

    model.addAttribute("userList", userList);
    model.addAttribute("userMap", userMap);
    model.addAttribute("userArray", userArray);

    model.addAttribute("a", "aaa");
    model.addAttribute("sex", "1");
    model.addAttribute("manage", "reloadLogin");
    model.addAttribute("isFlag", true);
    model.addAttribute("page", 10);

    request.setAttribute("userid ", "00112");
    request.getSession().setAttribute("uuid", "uu00112");

    model.addAttribute("date", new Date());
    return "index";
  }
}
