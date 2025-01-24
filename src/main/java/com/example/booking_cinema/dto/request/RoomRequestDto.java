package com.example.booking_cinema.dto.request;

import com.example.booking_cinema.dto.validator.room.type.RoomTypeSubset;
import com.example.booking_cinema.util.RoomType;
import static com.example.booking_cinema.util.RoomType.DELUXE;
import static com.example.booking_cinema.util.RoomType.PREMIUM;
import static com.example.booking_cinema.util.RoomType.STANDARD;
import static com.example.booking_cinema.util.RoomType.VIP;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomRequestDto {
    @NotBlank(message="room name must be not blank")
    private String name;

    @NotBlank(message="seat count must be not blank")
    @Min(value=1, message="seat count must be greater than 0")
    private Integer seat_count;

    @NotBlank(message="room type must be not blank")
    @RoomTypeSubset(anyOf={STANDARD, DELUXE, VIP, PREMIUM})
    private RoomType room_type;
}
