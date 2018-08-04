package com.OurTeam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String startPage(){
        return "redirect:/htmlside/StartPage.html";
        //return "JspPage.jsp";
    }
}
