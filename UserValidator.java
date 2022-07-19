package com.junituserresistration;

import jdk.nashorn.internal.parser.DateParser;

public class UserValidator {
    private static String EmailId = "^[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-.+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
            + "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}" + "+[a-zA-Z]{2,}){0,1}";

    //Function for Checking the FirstName
    public boolean checkFirstname(String fName) {
        return (fName.matches("^[A-Z][a-z]{2,}"));
    }

    // Function for Checking the LastName
    public boolean checkLastName(String Lname) {
        return (Lname.matches("^[A-Z][a-z]{2,}"));
    }

    // Function for Checking the EmailId
    public boolean checkEmailId(String EmailId) {
        return (EmailId.matches(EmailId));
    }

    // Function for Checking the MobileNo
    public boolean checkMobileNo(String MobileNo) {
        return (MobileNo.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }

    // Function for Checking the PassWord
    public boolean checkPassWord(String Password) {
        return (Password.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@$^+=&%])" + "(?=\\S+$).{8,}$"));

    }
}
