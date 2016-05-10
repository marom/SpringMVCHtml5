package spring.mvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by maro on 10/05/16.
 */
@Component
public class RegisterBeanValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return RegisterBeanValidator.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "password", null, "Password cannot be empty!");
    }
}
