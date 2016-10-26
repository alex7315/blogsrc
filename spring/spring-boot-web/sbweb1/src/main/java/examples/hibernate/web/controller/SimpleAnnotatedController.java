package examples.hibernate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // [1]
public class SimpleAnnotatedController {

    @RequestMapping(value = "/helloAgain")
    @ResponseBody // [2]
    public String helloAgain(){
        return "Hey this is sample spring boot web application using @Controller";
    }

}
