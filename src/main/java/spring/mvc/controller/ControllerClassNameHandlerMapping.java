package spring.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by maro on 14/04/16.
 */
public class ControllerClassNameHandlerMapping extends AbstractController {

    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("ControllerClassNameHandlerMapping is called");
        return new ModelAndView("success/success", "message", "handleRequestInternal from ControllerClassNameHandlerMapping is called");
    }
}
