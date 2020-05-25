package my.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api")
public class helloController {

    @RequestMapping("/sayHello")
    @ResponseBody
    String sayHello(){
        return "Hello World from Spring boot application - Maven build";
    }

}
