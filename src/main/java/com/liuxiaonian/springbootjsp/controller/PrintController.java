package com.liuxiaonian.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

@Controller
public class PrintController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printHello(){
        return "hello";
    }

    @RequestMapping(value = "/world",method = RequestMethod.GET)
    public String printWorld(){
        return "world";
    }

    @RequestMapping(value = "/print",method = RequestMethod.GET)
    @ResponseBody
    public String printHelloWorld(){
        return "Hello World";
    }
}