package org.hatch.challenge.iotcore.service.imp;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hatch.challenge.iotcore.dto.VehicleStatusReceiverDto;
import org.hatch.challenge.iotcore.model.Status;
import org.hatch.challenge.iotcore.repository.StatusRepository;
import org.hatch.challenge.iotcore.service.VehicleConnector;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("vehicleConnectorImpl")
@RequiredArgsConstructor
@Slf4j
public class VehicleConnectorImpl implements VehicleConnector {
    private final StatusRepository statusRepository;
    @Override
    public void saveDriverStatus(VehicleStatusReceiverDto vehicleStatus) {
    Status status = new Status();
    status.setStatusDetail(vehicleStatus.getStatusDetailDto());
    status.setCustomerId(vehicleStatus.getCustomerId());
    status.setDriverId(vehicleStatus.getDriverId());
    status.setPing(vehicleStatus.getPing());
    status.setVin(vehicleStatus.getVin());
    status.setTime(new Date());
    statusRepository.save(status).subscribe();
    }
}
