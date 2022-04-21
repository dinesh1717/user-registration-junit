package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//junit program to validation of user registration program

public class UserRegistration {
    Pattern pattern;
    Matcher matcher;

    //method firstName to validate the first name of the user


    public boolean firstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    //methodlastName to validation of the name value

    public boolean lastName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    // method email validation to validation of the email


    public boolean emailValidation(String name) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    // method to validation of mobile number data

    public boolean numberValidation(String number) {
        String regex = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(number);
        return matcher.matches();
    }

    // methodlogin to validation of login value should have minimum eight value data

    public boolean loginValidation(String name) {
        String regex = "[A-Za-z0-9]{8,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    //create method to validation one or greater digit value data
    public boolean loginValidationOneUpperCase(String name) {
        String regex = "(?=.*[A-Z]){1}(?=.*[0-9])(?=.*[a-z]).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    //create method to validation one or greater digit value data
    public boolean loginRule3Validation(String name) {
        String regex = "(?=.*[A-Z]){1}(?=.*[0-9])(?=.*[a-z]).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    //create methofd to validation one special value data
    public boolean loginValidationOneSpecialCharacter(String name) {
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean checkPassword(String password) {
        return (password.matches("[a-zA-Z]{8,}"));
    }
    //  creating method moodAnalyzer to check the mood happy or sad

    public String moodAnalyzer(String fName, String Lname, String phoneNum, String emailID, String password) {
        if (firstName(fName) == true && lastName(Lname) == true && emailValidation(emailID) == true
                && numberValidation(phoneNum) == true && checkPassword(password) == true) {
            return "HAPPY";
        } else {
            return "SAD";

        }
    }

    public String moodAnalyser(String fName, String Lname, String phoneNum, String emailID, String password) {
        if (firstName(fName) == true && lastName(Lname) == true && emailValidation(emailID) == true
                && numberValidation(phoneNum) == true && checkPassword(password) == true) {
            return "HAPPY";
        } else {
            return "SAD";

        }
    }
}




