package io.github.zerumi.ib1140925java.controller;

import io.github.zerumi.ib1140925java.controller.domain.AirportDto;
import io.github.zerumi.ib1140925java.service.DataService;
import io.github.zerumi.ib1140925java.service.domain.AirportModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
@RequiredArgsConstructor
public class DataController {
    private final DataService service;

    @GetMapping
    public List<AirportModel> getData() {
        return service.getAllData();
    }

    @PostMapping
    public AirportModel addData(@RequestBody AirportDto dto) {
        return service.saveData(dto);
    }
}
