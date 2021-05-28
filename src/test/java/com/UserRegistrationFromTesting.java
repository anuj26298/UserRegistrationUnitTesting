package com;

import com.userregistrationform.UserRegistrationForm;
import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationFromTesting {

    @Test
    public void givenFirstName_WhenCorrectName_ReturnTrue() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidFirstName("Anuj"));
    }

    @Test
    public void givenFirstName_WhenNameStartWithSmallLetter_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidFirstName("anuj"));
    }

    @Test
    public void givenFirstName_WhenCapitalLetterInBetween_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidFirstName("aNuj"));

    }

    @Test
    public void givenFirstName_WhenShortName_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidFirstName("An"));
    }

    @Test
    public void givenFirstName_WhenSpecialCharInName_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidFirstName("Anu%"));
    }

    @Test
    public void givenFirstName_WhenNumberInName_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidFirstName("4nuj"));
    }

    @Test
    public void givenFirstName_WhenLongName_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidFirstName("asddfhjjkjgfyttrewruuuyyhhg"));
    }

    @Test

    public void givenLastName_WhenCorrectName_ResultTrue() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidLastName("Kumar"));
    }

    @Test
    public void givenLastName_WhenCapitalLetterInBetween_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidLastName("kUmar"));
    }

    @Test
    public void givenLastName_WhenShortLastName_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidLastName("Ku"));
    }

    @Test
    public void givenLastName_WhenSpecialCharInName_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidLastName("Kum@r"));
    }

    @Test
    public void givenLastName_WhenNameStartsWithSmallLetter_ReturnFalse() {
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidLastName("kumar"));
    }

    @Test
    public  void givenLastName_WhenNumberInName_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidLastName("Kum4r"));

    }
    @Test
    public void givenEmail_WhenCorrectMail_ReturnTrue(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidEmail("kumar.anuj@magicedtech.com"));
    }
    @Test
    public void givenEmail_WhenCorrectMailAddedInLast_ReturnTrue(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidEmail("kumar.anuj@magicedtech.com.in"));
    }
    @Test
    public void givenEmail_WhenCorrectSymbolNotPresent_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidEmail("kumar.anujmagicedtech.com"));
    }
    @Test
    public void givenEmail_WhenCorrectMail_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidEmail("kumar.anuj@magicedtech.com"));
    }
    @Test
    public void givenEmail_WhenShortCharAtLase_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidEmail("kumar.anuj@magicedtech.com.a"));
    }
    @Test
    public void givenEmail_WhenNumberInEnd_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidEmail("kumar.anuj@magicedtech.1om"));
    }
    @Test
    public void givenEmail_WhenExtraCharAtEnd_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidEmail("kumar.anuj@magicedtech.ac.com.in"));
    }
    @Test
    public void givenMobileNumber_WhenCorrectNumber_ReturnTrue(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidMobileNum("91 9876543210"));
    }
    @Test
    public void givenMobileNumber_WhenNoCountryCode_ResultFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidMobileNum("9876543210"));
    }
    @Test
    public void givenMobileNumber_WhenLengthIsLarge_ResultFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidMobileNum("91 98765432100"));
    }

    @Test
    public void givenMobileNumber_WhenCountyCodeisLarge_ResultFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidMobileNum("911 9876543210"));
    }

    @Test
    public void givenMobileNumber_WhenNumbersAreLess_ResultFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidMobileNum("91 98765410"));
    }

    @Test
    public void givenPassword_WhenValidPassword_ReturnTrue(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertTrue(registrationForm.usersValidPassword("gfsA345@"));
    }

    @Test
    public void givenPassWord_WhenNoUpperCase_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidPassword("asfgfrf123@"));
    }
    @Test
    public void givenPassWord_WhenNoLowerCase_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidPassword("ASEEDF123@"));
    }
    @Test
    public void givenPassWord_WhenNoNumber_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidPassword("aASfgfrfsdf@"));
    }
    @Test
    public void givenPassWord_WhenNoSpecialChars_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidPassword("aAfgfrf123"));
    }
    @Test
    public void givenPassWord_WhenNoMinLength_ReturnFalse(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        Assert.assertFalse(registrationForm.usersValidPassword("asA2@"));
    }






}

