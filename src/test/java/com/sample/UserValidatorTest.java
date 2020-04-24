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
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Kumar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@yahoo.com");
        Assert.assertEquals(true,result);
    }

}
