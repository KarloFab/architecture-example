package com.architecture.example.aggregation;

import com.architecture.example.aggregation.dto.meter.MeterDTO;
import com.architecture.example.aggregation.mappers.MeterMapper;
import com.architecture.example.application.useCases.meter.FindMeterByIdHandler;
import com.architecture.example.domain.Meter;
import org.springframework.stereotype.Component;

/**
 * Will this class be too big with multiple handlers import? But so would controller be...
 * Or this could be called MeterTransformer?
 */

@Component
public class MeterAggregator {

    private MeterMapper meterMapper;
    private FindMeterByIdHandler findMeterByIdHandler;

    public MeterAggregator(MeterMapper meterMapper, FindMeterByIdHandler findMeterByIdHandler) {
        this.meterMapper = meterMapper;
        this.findMeterByIdHandler = findMeterByIdHandler;
    }

    public MeterDTO findMeterByIdAndMapToDto(Long id){
        //Could be probably one liner
        Meter meter = findMeterByIdHandler.findById(id);
        return meterMapper.toDto(meter);
    }
}
