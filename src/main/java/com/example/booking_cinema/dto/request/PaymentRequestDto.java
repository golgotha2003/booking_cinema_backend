package com.example.booking_cinema.dto.request;

import com.example.booking_cinema.dto.validator.payment.method.PaymentMethodSubset;
import com.example.booking_cinema.dto.validator.payment.status.PaymentStatusSubset;
import com.example.booking_cinema.util.PaymentMethod;
import static com.example.booking_cinema.util.PaymentMethod.CARD;
import static com.example.booking_cinema.util.PaymentMethod.CASH;
import static com.example.booking_cinema.util.PaymentMethod.ONLINE_PAYMENT;
import com.example.booking_cinema.util.PaymentStatus;
import static com.example.booking_cinema.util.PaymentStatus.FAILED;
import static com.example.booking_cinema.util.PaymentStatus.PENDING;
import static com.example.booking_cinema.util.PaymentStatus.REFUNDED;
import static com.example.booking_cinema.util.PaymentStatus.SUCCESS;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {
    @NotNull(message = "booking id must be not null")
    private Long booking_id;

    @NotNull(message = "payment method must be not null")
    @PaymentMethodSubset(anyOf={CASH, CARD, ONLINE_PAYMENT})
    private PaymentMethod payment_method;

    @NotNull(message = "payment status must be not null")
    @PaymentStatusSubset(anyOf={PENDING, SUCCESS, FAILED, REFUNDED})
    private PaymentStatus payment_status;
    
    @NotNull(message = "amount must be not null")
    private Double amount;
}
