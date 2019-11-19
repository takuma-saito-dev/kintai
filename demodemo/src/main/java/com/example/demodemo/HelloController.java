package com.example.demodemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//public class HelloController {
//
//	@RequestMapping(value = "/hello")
//	public String hello() {
//		return "/index.html";
//	}
//	@RequestMapping(value = "/index")
//	public String index() {
//		return "/index.html";
//	}
//}


@Controller
public class HelloController {
    @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model) {
        model.addAttribute("hello", "Hello Thymeleaf!!");
        return "/index.html";
    }

    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView mav) {
        mav.addObject("hello", "Hello Thymeleaf!!");
        mav.setViewName("index");
        return mav;
    }

}