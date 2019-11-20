package com.example.demodemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexFormController {

    @RequestMapping(value="/")
    public String index1(Model model) {
        model.addAttribute("indexForm", new IndexForm());
        return "register";
    }
    @RequestMapping(value="/index")
    public String index2(Model model) {
        model.addAttribute("indexForm", new IndexForm());
        return "index";
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String indexFormSubmit(@ModelAttribute IndexForm indexForm, Model model) {
        model.addAttribute("indexForm", indexForm);

        model.addAttribute("kiDate",indexForm.getKiDate() );
        model.addAttribute("kiStart",indexForm.getKiStart() );
        model.addAttribute("kiEnd", indexForm.getKiEnd());

//        model.addAttribute("kiDate","test1" );
//        model.addAttribute("kiStart","test2" );
//        model.addAttribute("kiEnd", "test3");



        return "kintai_List";
    }
}