package com.rest.repositories;

import com.rest.entities.Reservation;
import com.rest.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}