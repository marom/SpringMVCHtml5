package spring.mvc.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by maro on 10/05/16.
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String getDetail() {
        return "Custom Event detail method is called";
    }
}
