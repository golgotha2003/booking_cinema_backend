package com.example.booking_cinema.dto.request;

import com.example.booking_cinema.dto.validator.booking.status.BookingStatusSubset;
import com.example.booking_cinema.util.BookingStatus;
import static com.example.booking_cinema.util.BookingStatus.CANCELLED;
import static com.example.booking_cinema.util.BookingStatus.CONFIRMED;
import static com.example.booking_cinema.util.BookingStatus.PENDING;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequestDto {
    @NotNull(message = "user id must be required")
    private Long user_id;

    @NotNull(message = "showtime id must be required")
    private Long showtime_id;

    @NotNull(message = "seat number must be required")
    private String seat_number;

    @NotNull(message = "total price must be required")
    private Double total_price;

    @NotNull(message = "booking status must be required")
    @BookingStatusSubset(anyOf={PENDING, CONFIRMED, CANCELLED})
    private BookingStatus booking_status;
}
