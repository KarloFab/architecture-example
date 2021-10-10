package com.architecture.example.aggregation.mappers;

public interface EntityMapper <D, E> {

    E toEntity(D dto);

    D toDto(E entity);
}
