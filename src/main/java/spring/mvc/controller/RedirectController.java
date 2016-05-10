package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maro on 10/05/16.
 */
@Controller
public class RedirectController {

    @RequestMapping(value = "/redirectExample", method = RequestMethod.GET)
    public String redirect() {
        //redirect to external URL
        return "redirect:http://www.wp.pl";
    }
}
