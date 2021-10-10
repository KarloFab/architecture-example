package com.architecture.example.aggregation.mappers;

import com.architecture.example.aggregation.dto.meter.MeterCreateDTO;
import com.architecture.example.aggregation.dto.meter.MeterDTO;
import com.architecture.example.domain.Meter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MeterMapper extends EntityMapper<MeterDTO, Meter>  {

    @Mapping(source = "client.id", target = "clientId")
    MeterDTO toDto(Meter meter);

    Meter createDtoToEntity(MeterCreateDTO meterCreateDTO);
}
