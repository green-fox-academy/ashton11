package com.greenfox.bankofsimba.con_trollers;

import com.greenfox.bankofsimba.noodles.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Con_Thriller {
    BankAccount theLionKingsAccount = new BankAccount("Simba", 2000 , "Lion");
    String killerText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    List<BankAccount> accounts = new ArrayList<>();

    public Con_Thriller(){
        accounts.add(new BankAccount("Nala", 1500, "Lion"));
        accounts.add(new BankAccount("Mufasa", 2300, "Lion"));
        accounts.add(new BankAccount("Sarabi", 1230, "Lion"));
        accounts.add(theLionKingsAccount);
        accounts.add(new BankAccount("Sarafina", 980, "Lion"));
    }
    @RequestMapping("/show")
    public String showTheKingsAccount(Model model){
        model.addAttribute("SimAcc", theLionKingsAccount);

        return "show_accounts_page";
    }
    @RequestMapping("/HTALMA")
    @ResponseBody
    public String htmlception(){
        return killerText;
    }
    @RequestMapping("/htmlception")
    public String htmlceptionception(Model model){
        model.addAttribute("bestText", killerText);
        return "htmlception";
    }
    @RequestMapping("/lotsOfAccs")
    public String showThemAccounts(Model model){
        model.addAttribute("lionList", accounts);
        return
    }
}
