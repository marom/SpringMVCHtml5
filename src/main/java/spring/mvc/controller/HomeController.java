package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maro on 14/04/16.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController: home is called");
        return "home";
    }

}
