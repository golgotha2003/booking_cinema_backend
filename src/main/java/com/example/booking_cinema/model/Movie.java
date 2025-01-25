package com.example.booking_cinema.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_movies")
public class Movie extends AbstractEntity {
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "poster_url")
    private String poster_url;

    @Column(name = "trailer_url")
    private String trailer_url;

    @Column(name = "release_date")
    private Date release_date;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="movie")
    @Builder.Default
    private Set<ShowTime> show_times = new HashSet<>();
}
