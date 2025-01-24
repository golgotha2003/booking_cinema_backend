package com.example.booking_cinema.dto.validator.payment.method;

import java.util.Arrays;

import com.example.booking_cinema.util.PaymentMethod;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PaymentMethodSubsetValidator implements ConstraintValidator<PaymentMethodSubset, PaymentMethod>{
    private PaymentMethod[] paymentMethods;

    @Override
    public void initialize(PaymentMethodSubset constraint) {
        // TODO Auto-generated method stub
        this.paymentMethods = constraint.anyOf();
    }

    @Override
    public boolean isValid(PaymentMethod value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return value == null || Arrays.asList(paymentMethods).contains(value);
    }
    
}
