package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by maro on 14/04/16.
 */
@Controller
public class SampleController {

    @RequestMapping(value = "/callMethod", method = RequestMethod.GET)
    public ModelAndView callMethod() {

        System.out.println("SampleController: callMethod is called.");
        return new ModelAndView("success/success", "message", "callMethod is called");
    }
}
