package org.hatch.challenge.iotporcessor.dto;

import lombok.Data;

@Data
public class VehicleDto {
    private String id;
    private String vin;
    private String regNr;
    private String customerId;
    private boolean availability;
}
