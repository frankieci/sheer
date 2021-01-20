package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {

  @GetMapping("/boot/index")
  public String getIndex(Model model) {

    model.addAttribute("msg", "spring boot integrated jsp");
    return "index";
  }

}
