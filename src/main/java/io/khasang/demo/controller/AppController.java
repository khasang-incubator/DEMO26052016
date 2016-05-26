package io.khasang.demo.controller;

import io.khasang.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    Message message;

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", message.getHelloMessage());
        return "hello";
    }

}
