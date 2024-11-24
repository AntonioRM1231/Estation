package com.estation.estation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
//@RequestMapping(path = "/index")
public class MasterController {

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
}
