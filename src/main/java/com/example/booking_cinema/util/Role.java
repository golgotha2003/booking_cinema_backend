package com.example.booking_cinema.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Role {
    @JsonProperty("admin")
    ADMIN,
    @JsonProperty("user")
    USER,
    @JsonProperty("owner")
    OWNER
}