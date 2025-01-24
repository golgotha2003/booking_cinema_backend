package com.example.booking_cinema.dto.validator.user.phone_number;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String>{

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
        // TODO Auto-generated method stub
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phoneNo, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        if(phoneNo == null){
            return false;
        }

        //Validate phone numbers of format 0987654321
        if(phoneNo.matches("\\d{10}")) return true;
        //Validating phone number with -, . or spaces: 098-765-4321
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
        //Validating phone number with extension length from 3 to 5
        else //return false if nothing matches the input
            if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
        //Validating phone number where area code is in braces()
        else return phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\{4}");
    }
    
    
}
