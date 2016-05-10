package spring.mvc.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * Created by maro on 10/05/16.
 */
@Component
public class ApplicationEventListener implements ApplicationListener<ServletRequestHandledEvent> {

    @Override
    public void onApplicationEvent(ServletRequestHandledEvent servletRequestHandledEvent) {

        System.out.println("ApplicationEventListener: " + servletRequestHandledEvent);

        System.out.println("Application event ServletRequestHandledEvent: " + servletRequestHandledEvent.getProcessingTimeMillis());
        System.out.println("URL: " + servletRequestHandledEvent.getRequestUrl());
    }
}
