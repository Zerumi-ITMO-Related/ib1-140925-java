package io.github.zerumi.ib1140925java.service.domain;

import lombok.Data;

@Data
public class AirportModel {
    private String iataCode;
    private String icaoCode;
    private String icaoClassification;
    private String altitude;
    private String latitude;
    private String uprisingMeters;
    private String magneticDeclination;
}
