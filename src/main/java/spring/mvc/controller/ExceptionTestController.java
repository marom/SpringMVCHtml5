package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maro on 09/05/16.
 */
@Controller
public class ExceptionTestController {

    @RequestMapping(value = "/throwRunTimeException", method = RequestMethod.GET)
    public void throwException() {
        throw new RuntimeException();
    }
}
