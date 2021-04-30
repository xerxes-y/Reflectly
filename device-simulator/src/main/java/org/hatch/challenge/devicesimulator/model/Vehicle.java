package org.hatch.challenge.devicesimulator.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "vehicle", type = "vehicle")
@Data
@Builder
public class Vehicle {
    @Id
    private String id;
    private String vin;
    private String regNr;
    private String customerId;
    private boolean availability;
}
