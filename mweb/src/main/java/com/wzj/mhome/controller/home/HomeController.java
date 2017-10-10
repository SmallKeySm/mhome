package com.wzj.mhome.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String home(HttpSession session){
        session.setAttribute("abc", "aaa");
        return "Hello, World!";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String testSession(HttpSession session){
        return String.valueOf(session.getAttribute("abc"));
    }
}
