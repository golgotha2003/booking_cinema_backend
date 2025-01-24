package com.example.booking_cinema.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PaymentStatus {
    @JsonProperty("pending")
    PENDING, 
    @JsonProperty("success")
    SUCCESS,
    @JsonProperty("failed")
    FAILED,
    @JsonProperty("refunded")
    REFUNDED
}
