package com.architecture.example.providers.repositories;

import com.architecture.example.domain.Meter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Maybe we could add directory jpa in repositories directory to emphasise what is main technology used?
 */
@Repository
public interface MeterRepository extends JpaRepository<Meter, Long> {
}
