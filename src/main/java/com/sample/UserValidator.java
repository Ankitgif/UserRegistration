package com.sample;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]{3,}([._+-][a-z0-9]*)?[@]{1}[a-z]{2,}[.]{1}[a-z]{2,4}(.[a-z]{2})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{2}[ :space: ][0-9]{10}";
    private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*[@$!%*#?&]).{8,}";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String number) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(number).matches();
    }
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
