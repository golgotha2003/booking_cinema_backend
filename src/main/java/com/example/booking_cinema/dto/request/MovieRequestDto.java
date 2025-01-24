package com.example.booking_cinema.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequestDto {
    // Movie details
    @NotBlank(message = "title is required")
    @Size(max = 255, message = "title cannot exceed 255 characters")
    private String title;

    // Brief description of the movie
    @Size(max = 1000, message = "description cannot exceed 1000 characters")
    private String description;

    // Duration of the movie in minutes
    @NotNull(message = "duration is required")
    @Positive(message = "duration must be a positive number")
    private Integer duration;

    // URL of the movie poster
    @Size(max = 500, message = "poster url cannot exceed 500 characters")
    private String poster_url;

    // URL of the movie trailer
    @Size(max = 500, message = "trailer url cannot exceed 500 characters")
    private String trailer_url;

    // Release date of the movie
    private LocalDate release_date;
}
