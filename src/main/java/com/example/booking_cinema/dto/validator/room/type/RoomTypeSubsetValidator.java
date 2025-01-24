package com.example.booking_cinema.dto.validator.room.type;

import java.util.Arrays;

import com.example.booking_cinema.util.RoomType;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RoomTypeSubsetValidator implements ConstraintValidator<RoomTypeSubset, RoomType>{
    private RoomType[] roomTypes;

    @Override
    public void initialize(RoomTypeSubset constraint) {
        // TODO Auto-generated method stub
        this.roomTypes = constraint.anyOf();
    }

    @Override
    public boolean isValid(RoomType value, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        return value == null || Arrays.asList(roomTypes).contains(value);
    }
}