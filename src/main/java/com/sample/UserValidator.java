package com.sample;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]{3,}([._+-][a-z0-9]*)?[@]{1}[a-z]{2,}[.]{1}[a-z]{2,4}(.[a-z]{2})?$";

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
}
