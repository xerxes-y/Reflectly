package org.hatch.challenge.iotcore.dto;

import lombok.Data;
import org.hatch.challenge.iotcore.model.StatusDetailReceiver;

import java.io.Serializable;

@Data
public class

VehicleStatusReceiverDto implements Serializable {
    private String vin;
    private String customerId;
    private String customerName;
    private int driverId;
    private int ping;
    private String connect;
    private String openDoor;
    private int speedKilometers;
    private String carType;
    private StatusDetailReceiver statusDetailDto;

}
