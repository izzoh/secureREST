package com.izzoh.basic.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by isaac waweru on 10/31/2016.
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/index.html")
    public String indexpage(){
        return "index";
    }
}
