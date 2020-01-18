package com.bharath.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
