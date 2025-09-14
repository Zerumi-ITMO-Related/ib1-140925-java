package io.github.zerumi.ib1140925java.controller.domain;

import lombok.Data;

@Data
public class AirportDto {
    private String iataCode;
    private String icaoCode;
    private String icaoClassification;
    private String altitude;
    private String latitude;
    private String uprisingMeters;
    private String magneticDeclination;
}
