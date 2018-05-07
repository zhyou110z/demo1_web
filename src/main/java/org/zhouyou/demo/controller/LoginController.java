package org.zhouyou.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "login")
public class LoginController {

    Logger log = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping(value = "loginView")
    private String loginView(){
        return "/user/login";
    }

    @RequestMapping(value = "login")
    @ResponseBody
    private String login(@RequestParam String username, @RequestParam String psd){
        log.info("username :"+username);
        log.info("psd :"+psd);
        return "index";
    }


}
