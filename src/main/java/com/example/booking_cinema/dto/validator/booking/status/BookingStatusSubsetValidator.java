package com.example.booking_cinema.dto.validator.booking.status;

import java.util.Arrays;

import com.example.booking_cinema.util.BookingStatus;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BookingStatusSubsetValidator implements ConstraintValidator<BookingStatusSubset, BookingStatus> {

    private BookingStatus[] bookingStatus;

    @Override
    public void initialize(BookingStatusSubset constraint) {
        // TODO Auto-generated method stub
        this.bookingStatus = constraint.anyOf();
    }

    @Override
    public boolean isValid(BookingStatus value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return value == null || Arrays.asList(bookingStatus).contains(value);
    }
    
}
