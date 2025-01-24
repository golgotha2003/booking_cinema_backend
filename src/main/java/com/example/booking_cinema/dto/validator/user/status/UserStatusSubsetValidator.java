package com.example.booking_cinema.dto.validator.user.status;

import java.util.Arrays;

import com.example.booking_cinema.util.UserStatus;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserStatusSubsetValidator implements ConstraintValidator<UserStatusSubset, UserStatus> {

    private UserStatus[] userStatuses;

    @Override
    public void initialize(UserStatusSubset constraint) {
        // TODO Auto-generated method stub
        this.userStatuses = constraint.anyOf();
    }

    @Override
    public boolean isValid(UserStatus value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return value == null || Arrays.asList(userStatuses).contains(value);
    }
    
}
