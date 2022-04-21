package com.bridgelabz;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Dinesh");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Nangare");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailValidation("abc..@radif.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.numberValidation("10 1111111111");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenNumberValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.numberValidation("11 121212111");
        Assertions.assertFalse(result);
    }

    @Test
    public void giveLoginRule1Value_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.loginValidation("agnnfwqopn");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidation("aqropnm");
        Assertions.assertFalse(result);
    }




    @Test
    public void givenRule2Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidationOneUpperCase("addqeghopnm");
    }

    @Test
    public void givenRule3Value_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.loginRule3Validation("Laoqo1rpnm");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenRule3Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginRule3Validation("aqLawhrpnm");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenRule4Values_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.loginValidationOneSpecialCharacter("adqe1aaL@fp");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenRule4Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidationOneSpecialCharacter("awwfleropnm");
        Assertions.assertFalse(result);
    }

    @Test

     // created testPassword_MustReturnTrue() for True condition

    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

         // calling checkPassword method to see Password is valid

        boolean isPasswordValid = userRegistration.checkPassword("abcdefghi");
        Assert.assertTrue(isPasswordValid);
    }

    @Test

     //created testPassword_MustReturnFalse() for False condition

    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcd");
        Assert.assertFalse(isPasswordInValid);
    }
}

