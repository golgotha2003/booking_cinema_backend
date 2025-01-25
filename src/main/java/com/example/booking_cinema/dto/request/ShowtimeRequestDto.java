package com.example.booking_cinema.dto.request;

import java.time.LocalTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShowTimeRequestDto {
    @NotNull(message = "movie id must be required")
    private Long movie_id;

    @NotNull(message = "room id must be required")
    private Long room_id;

    @NotNull(message = "show date must be required")
    private LocalTime show_date;

    @NotNull(message = "start time must be required")
    private LocalTime start_time;

    @NotNull(message = "end date must be required")
    private LocalTime end_time;
}
