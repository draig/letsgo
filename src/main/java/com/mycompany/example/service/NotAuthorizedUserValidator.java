package com.mycompany.example.service;

import com.mycompany.example.models.NotAuthorizedUser;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class NotAuthorizedUserValidator implements Validator{
    
    @Autowired
    private NotAuthorizedUserService notAuthorizedUser;
    
    @Override
    public boolean supports(Class<?> clazz) {
            return NotAuthorizedUser.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
            NotAuthorizedUser nauser = (NotAuthorizedUser) target;
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty", "Username must not be empty.");
            String username = nauser.getUsername();
            if ((username.length()) > 20) {
                    errors.rejectValue("username", "username.tooLong", "Username must not more than 20 characters.");
            }
            if ((username.length()) < 3) {
                    errors.rejectValue("username", "username.tooShort", "Username must not less than 3 characters.");
            }

            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.empty", "Password must not be empty.");
            String password = nauser.getPassword() ;
            if ((password.length()) > 20) {
                    errors.rejectValue("password", "password.tooLong", "Password must not more than 20 characters.");
            }
            if ((password.length()) < 3) {
                    errors.rejectValue("password", "password.tooShort", "Password must not less than 3 characters.");
            }
            String email = nauser.getEmail() ;
            if( !EmailValidator.getInstance().isValid( email ) ){
                    errors.rejectValue("email", "email.notValid", "Email address is not valid.");
            }
            else {
                if ( notAuthorizedUser.getNotAuthorizedUserByEmail(email) != null ) {
                    errors.rejectValue("email", "email.isOccupied", "Email is occupied by other user.");
                }
            }
	}
}
