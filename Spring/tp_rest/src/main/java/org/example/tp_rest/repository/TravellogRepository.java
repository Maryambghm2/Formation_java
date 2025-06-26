package org.example.tp_rest.repository;

import org.example.tp_rest.entity.Travellog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellogRepository extends JpaRepository<Travellog,Long> {
}
