package spring.mvc.interceptor;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by maro on 10/05/16.
 */
public class SiteInterceptor implements HandlerInterceptor, MessageSourceAware {

    private MessageSource messageSource;


    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("SiteInterceptor - preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("SiteInterceptor - postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("SiteInterceptor - afterCompletion");
        System.out.println("site.maintenance: " + messageSource.getMessage("site.maintenance", null, Locale.ENGLISH));
        System.out.println("site.maintenance: " + messageSource.getMessage("test.param", null, Locale.ENGLISH));
    }
}
