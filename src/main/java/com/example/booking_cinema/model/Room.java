package com.example.booking_cinema.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_rooms")
public class Room extends AbstractEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "seat_count")
    private Integer seat_count;

    @Enumerated(EnumType.STRING)
    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    @Column(name = "room_type")
    private String room_type;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="room")
    @Builder.Default
    private Set<ShowTime> show_times = new HashSet<>();
}
