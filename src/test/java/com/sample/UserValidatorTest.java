package com.sample;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ankit");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("ank");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Kumar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ku");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@yahoo.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("ankitsinha2303@gmail.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 8877150686");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenMobileNumberMatch1_WhenProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("918877150686");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenMobileNumberMatch2_WhenProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 88770686150123");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("abcdEfJg@h12ij3kl");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("abcdfJgh12ij3kl");
        Assert.assertEquals(false, result);
    }

}
