package com.bharath.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.flightreservation.entities.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {

}
