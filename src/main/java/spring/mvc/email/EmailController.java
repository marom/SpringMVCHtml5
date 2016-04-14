package spring.mvc.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by maro on 14/04/16.
 */
@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/email", method = RequestMethod.GET)
    public ModelAndView email() {

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("from", "xxx@gmail.com");
        model.put("subject", "hello springmvc-angularjs-html5");
        model.put("to", "xxx@gmail.com"); //Attention
        model.put("ccList", new ArrayList<String>());
        model.put("bccList", new ArrayList<String>());
        model.put("urludemy", "https://www.udemy.com/spring-framework-4-course-and-core-spring-certification/");
        model.put("username", "MaroM");

        boolean result = emailService.sendEmail("registered.vm", model);
        if(result == true) {
            return new ModelAndView("success/success", "message", "Email has been successfully sent");
        }

        return new ModelAndView("error/error", "message", "Error while sending an email");

    }

}
