package org.hatch.challenge.iotcore.service;


import org.hatch.challenge.iotcore.dto.VehicleStatusReceiverDto;

public interface VehicleConnector {
    void saveDriverStatus(VehicleStatusReceiverDto vehicleStatus);
}
