package org.hatch.challenge.iotcore.dto;

import lombok.Data;

@Data
public class VehicleDto {
    private String id;
    private String vin;
    private String regNr;
    private String customerId;
    private boolean availability;
}
