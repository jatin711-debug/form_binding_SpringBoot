package com.sheridan.forrm_binding.beans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController{
    
    @RequestMapping("/")
    public String getForm(Model model){
        model.addAttribute("company",new Company("Johnny"));
        return "greeting.html";
    }

    @RequestMapping("/handelForm")
    public String getInfo(@ModelAttribute Company company,Model model){
        model.addAttribute("company",company);
        return "results.html";
    }

}
