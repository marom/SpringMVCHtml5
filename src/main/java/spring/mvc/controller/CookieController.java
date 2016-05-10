package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by maro on 10/05/16.
 */
@Controller
public class CookieController {

    @RequestMapping(value = "/readcookie", method = RequestMethod.GET)
    public ModelAndView readCookie(@CookieValue(value = "URL") String URL, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("CookieController - read cookie is called");
        return new ModelAndView("/cookie/cookieView", "cookieValue", URL);
    }

    @RequestMapping(value = "/writecookie", method = RequestMethod.GET)
    public String writeCookie(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("CookieController - write cookie is called");
        Cookie cookie = new Cookie("URL", request.getRequestURL().toString());
        response.addCookie(cookie);
        return "/cookie/cookieView";
    }

    @RequestMapping(value = "/readAllCookies", method = RequestMethod.GET)
    public ModelAndView readAllCookies(HttpServletRequest request) {
        System.out.println("CookieController - read all cookie is called");

        Cookie[] cookies = request.getCookies();
        System.out.println("All cookies in your browses");
        String cookiesStr = "";
        for (Cookie cookie :
                cookies) {
            System.out.println(cookie.getName() + " : " + cookie.getValue());
            cookiesStr += cookie.getName() + " : " + cookie.getValue() + "<br/>";
        }
        return new ModelAndView("/cookie/cookieView", "cookieValue", cookiesStr);
    }
}
