package com.greenfox.day4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller  {
    @Autowired
    UtilityService utilityService;

    @RequestMapping("/useful")
    public String useful(){
        return "index";
    }

    @RequestMapping("/useful/color")
    public String usefulColor(Model model){
                model.addAttribute("util", utilityService);
        return "index_with_color";
    }
    @GetMapping("/useful/email")
    public String getUsefulEmail(Model model){
        model.addAttribute("util", utilityService);
        return "email_validator";
    }

    @PostMapping("/useful/email")
    public String usefulEmail(Model model, @RequestParam(name = "email") String email){
        model.addAttribute("util", utilityService);
        model.addAttribute("email", email);
        model.addAttribute("validEmail", utilityService.validateEmail(email));
        return "email_validator";
    }

    @GetMapping("useful/encoding")
    public String encoder(){
        return "encoder";
    }
    @PostMapping("useful/encoding")
    public String encoderplus(Model model, @RequestParam(name = "number") int number,
    @RequestParam(name = "text") String text){
        return "encoder";
    }
}
