package com.nzsoft.springcar.backend.integration.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nzsoft.springcar.backend.integration.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
	
	// OrderBy? Por precio? DESC, ASC ?
	// Esto es JPQL
	/*
	@Query("SELECT r.car FROM Reservation r WHERE ((r.pickupDate    >= :f1 AND r.pickupDate  < :f2)  OR " +
			                                     " (r.dropOffDate   >  :f1 AND r.dropOffDate < :f2)  OR " +
			                                     " (r.pickupDate    <  :f1 AND r.dropOffDate > :f2)) AND " +
			                                     "  r.car.office.id = :codigoOficina") 
			
	public List<Car> getNotAvailableCarsBetweenDates(@Param ("codigoOficina") long codigoOficina, 
													 @Param ("f1") Date f1, 
													 @Param ("f2") Date f2);*/
	
	
	@Query("SELECT r.car From Reservation r WHERE r.car NOT IN (SELECT r.car FROM Reservation r WHERE ((r.pickupDate    >= :f1 AND r.pickupDate  < :f2)  OR " +
            " (r.dropOffDate   >  :f1 AND r.dropOffDate < :f2)  OR " +
            " (r.pickupDate    <  :f1 AND r.dropOffDate > :f2)) AND " +
            "  r.car.office.id = :codigoOficina)") 

	public List<Car> getNotAvailableCarsBetweenDates(@Param ("codigoOficina") long codigoOficina, 
				 @Param ("f1") Date f1, 
				 @Param ("f2") Date f2);
}
