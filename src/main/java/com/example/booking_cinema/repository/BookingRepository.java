package com.example.booking_cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booking_cinema.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    
}
