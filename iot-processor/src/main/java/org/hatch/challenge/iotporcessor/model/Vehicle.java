package org.hatch.challenge.iotporcessor.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "vehicle",type = "vehicle")
@Data
public class Vehicle {
    @Id
    private String id;
    private String vin;
    private String regNr;
    private String customerId;
    private boolean availability;
}
