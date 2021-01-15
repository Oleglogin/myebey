package ua.lv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by User on 15.01.2021.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String toLogin(Model model){
        return "/login";
    }
}
