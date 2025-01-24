package com.example.booking_cinema.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BookingStatus {
    @JsonProperty("pending")
    PENDING,
    @JsonProperty("confirmed")
    CONFIRMED,
    @JsonProperty("canceled")
    CANCELLED
}
