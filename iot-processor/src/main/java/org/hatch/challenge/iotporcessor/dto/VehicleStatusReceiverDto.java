package org.hatch.challenge.iotporcessor.dto;

import lombok.Data;
import org.hatch.challenge.iotporcessor.model.StatusDetailReceiver;

import java.io.Serializable;

@Data
public class VehicleStatusReceiverDto implements Serializable {
    private String vin;
    private String customerId;
    private String customerName;
    private int driverId;
    private int ping;
    private StatusDetailReceiver statusDetailDto;

}
