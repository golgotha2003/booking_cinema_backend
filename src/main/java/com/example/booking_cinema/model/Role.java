package com.example.booking_cinema.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_role")
public class Role extends AbstractEntity<Integer> {
    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
}
