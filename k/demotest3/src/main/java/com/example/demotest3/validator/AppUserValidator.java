package com.example.demotest3.validator;

import com.example.demotest3.dao.AppUserDao;
import com.example.demotest3.entity.AppUser;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import javax.validation.Valid;

@Component
public class AppUserValidator {


    @Autowired
    private AppUserDao appUserDAO;

    // Các lớp được hỗ trợ bởi Validator này.
    @Valid
    public boolean supports(Class<?> clazz) {
        return clazz == AppUser.class;
    }

    @Valid
    public void validate(Object target, Errors errors) {
        AppUser appUser = (AppUser) target;

        // Kiểm tra các field của AppUserForm.
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty.appUserForm.userName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty.appUserForm.firstName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty.appUserForm.lastName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.appUserForm.email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.appUserForm.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "NotEmpty.appUserForm.confirmPassword");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "NotEmpty.appUserForm.gender");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryCode", "NotEmpty.appUserForm.countryCode");


        if (!errors.hasFieldErrors("userName")) {
            AppUser dbUser = appUserDAO.findAppUserByUserName(appUser.getUserName());
            if (dbUser != null) {
                // Tên tài khoản đã bị sử dụng bởi người khác.
                errors.rejectValue("userName", "Duplicate.appUserForm.userName");
            }
        }

        if (!errors.hasErrors()) {
            if (!appUser.getEncrytedPassword().equals(appUser.getEncrytedPassword())) {
                errors.rejectValue("confirmPassword", "Match.appUserForm.confirmPassword");
            }
        }
    }

}
