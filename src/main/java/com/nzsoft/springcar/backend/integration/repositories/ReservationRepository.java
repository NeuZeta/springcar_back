package com.nzsoft.springcar.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nzsoft.springcar.backend.integration.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
