package com.architecture.example.application.useCases.meter;

import com.architecture.example.domain.Meter;
import com.architecture.example.providers.repositories.MeterRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

public class FindMeterByIdHandler {

    private final MeterRepository meterRepository;

    public FindMeterByIdHandler(MeterRepository meterRepository) {
        this.meterRepository = meterRepository;
    }

    public Meter findById(Long id) {
        Optional<Meter> meter = meterRepository.findById(id);
        if(!meter.isPresent()) {
            throw new EntityNotFoundException("Meter doesn't exist for id: " + id);
        }

        return meter.get();
    }
}
