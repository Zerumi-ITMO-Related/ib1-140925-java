package io.github.zerumi.ib1140925java.repository.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("airports")
public class AirportEntity {
    @Id
    private Long id;
    private String iataCode;
    private String icaoCode;
    private String icaoClassification;
    private String altitude;
    private String latitude;
    private String uprisingMeters;
    private String magneticDeclination;
}
