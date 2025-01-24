package com.example.booking_cinema.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserStatus {
    @JsonProperty("active")
    ACTIVE,
    @JsonProperty("inactive")
    INACTIVE,
    @JsonProperty("pending")
    PENDING,
    @JsonProperty("banned")
    BANNED
}