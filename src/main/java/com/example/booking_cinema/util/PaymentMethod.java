package com.example.booking_cinema.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PaymentMethod {
    @JsonProperty("cash")
    CASH, 
    @JsonProperty("card")
    CARD, 
    @JsonProperty("online_payment")
    ONLINE_PAYMENT
}
