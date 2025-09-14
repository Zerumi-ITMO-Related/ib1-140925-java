package io.github.zerumi.ib1140925java.service;

import io.github.zerumi.ib1140925java.controller.domain.AirportDto;
import io.github.zerumi.ib1140925java.repository.DataRepository;
import io.github.zerumi.ib1140925java.repository.domain.AirportEntity;
import io.github.zerumi.ib1140925java.service.domain.AirportModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class DataService {

    private final DataRepository repository;
    private final ModelMapper mapper;

    public List<AirportModel> getAllData() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(entity -> mapper.map(entity, AirportModel.class))
                .collect(Collectors.toList());
    }

    public AirportModel saveData(AirportDto dto) {
        AirportEntity entity = mapper.map(dto, AirportEntity.class);
        AirportEntity saved = repository.save(entity);
        return mapper.map(saved, AirportModel.class);
    }
}
