package com.wzj.mhome.controller.home;

import com.wzj.mhome.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Autowired
    CacheService cacheService;

    @RequestMapping(value = "/")
    @ResponseBody
    public String home(HttpSession session){
        session.setAttribute("abc", "aaa");
        System.out.println(cacheService.getName());
        return "Hello, World!";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String testSession(HttpSession session){
        return String.valueOf(session.getAttribute("abc"));
    }
}
