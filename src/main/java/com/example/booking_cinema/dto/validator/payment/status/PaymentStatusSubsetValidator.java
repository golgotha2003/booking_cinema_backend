package com.example.booking_cinema.dto.validator.payment.status;

import java.util.Arrays;

import com.example.booking_cinema.util.PaymentStatus;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PaymentStatusSubsetValidator implements ConstraintValidator<PaymentStatusSubset, PaymentStatus>{
    private PaymentStatus[] paymentStatus;

    @Override
    public void initialize(PaymentStatusSubset constraint) {
        this.paymentStatus = constraint.anyOf();
    }

    

    @Override
    public boolean isValid(PaymentStatus value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(paymentStatus).contains(value);
    }
    
    
}
