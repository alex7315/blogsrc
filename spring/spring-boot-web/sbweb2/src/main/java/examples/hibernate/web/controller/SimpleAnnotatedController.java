package examples.hibernate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller // [1]
public class SimpleAnnotatedController {

    @RequestMapping(value = "/helloAgain")
    @ResponseBody // [2]
    public String helloAgain(){
        return "Hey this is sample spring boot web application using @Controller";
    }


    // [3]
    @RequestMapping(value="/movieList")
    public ModelAndView showMovieListingPage(){
        List<String> list = new ArrayList<String>();
        list.add("Captain America: Civil War (2016)");
        list.add("Her (2013)");
        list.add("I, Robot (2004)");
        list.add("Saving Private Ryan (1998)");

        ModelAndView model = new ModelAndView("movieList");
        model.addObject("lists", list);

        return model;
    }




}
