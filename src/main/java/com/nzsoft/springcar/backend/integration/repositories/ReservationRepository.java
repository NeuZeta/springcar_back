package com.nzsoft.springcar.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nzsoft.springcar.backend.integration.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	@Query("SELECT r FROM Reservation r WHERE r.car.office.id = :officeId")
	public List<Reservation> findByOffice (@Param("officeId") long officeId);
	
}
