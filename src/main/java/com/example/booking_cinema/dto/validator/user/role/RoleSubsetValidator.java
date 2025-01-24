package com.example.booking_cinema.dto.validator.user.role;

import java.util.Arrays;

import com.example.booking_cinema.util.Role;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RoleSubsetValidator implements ConstraintValidator<RoleSubset, Role>{

    private Role[] userTypes;

    @Override
    public void initialize(RoleSubset constraint) {
        // TODO Auto-generated method stub
        this.userTypes = constraint.anyOf();
    }

    @Override
    public boolean isValid(Role value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return value == null || Arrays.asList(userTypes).contains(value);
    }
    
}
