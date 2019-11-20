package com.example.demodemo;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexFormController {

	@Autowired
	HttpSession session;
	
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
    	ArrayList<IndexForm> indexList = new ArrayList<>();
    	indexList = (ArrayList<IndexForm>)session.getAttribute("indexList");
    	
    	if(indexList == null) {
			indexList = new ArrayList<IndexForm>();
    	}
    	indexList.add(indexForm);
	    
        model.addAttribute("indexList", indexList);
        session.setAttribute("indexList", indexList);
        
        
//        model.addAttribute("kiDate",indexForm.getKiDate() );
//        model.addAttribute("kiStart",indexForm.getKiStart() );
//        model.addAttribute("kiEnd", indexForm.getKiEnd());

//        model.addAttribute("kiDate","test1" );
//        model.addAttribute("kiStart","test2" );
//        model.addAttribute("kiEnd", "test3");

        return "register";
    }
}