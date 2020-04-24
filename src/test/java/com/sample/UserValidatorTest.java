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

}
