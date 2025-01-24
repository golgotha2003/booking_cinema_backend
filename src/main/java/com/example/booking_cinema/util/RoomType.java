package com.example.booking_cinema.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RoomType {
    @JsonProperty("standard")
    STANDARD,
    @JsonProperty("deluxe")
    DELUXE,
    @JsonProperty("vip")
    VIP,
    @JsonProperty("premium")
    PREMIUM
}
