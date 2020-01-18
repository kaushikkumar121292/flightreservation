package com.bharath.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.flightreservation.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
