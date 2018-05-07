package org.zhouyou.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "index")
    private String index(){
        return "index";
    }

}
