package org.hatch.challenge.iotporcessor.service;

import org.hatch.challenge.iotporcessor.dto.ValueDTO;
import org.hatch.challenge.iotporcessor.dto.VehicleDto;
import org.hatch.challenge.iotporcessor.dto.VehicleStatusReceiverDto;
import reactor.core.publisher.Flux;

public interface DataAggregator {
    Flux<VehicleStatusReceiverDto> cars();
    Flux<VehicleStatusReceiverDto> history(String type);
    ValueDTO average(String type);
    ValueDTO medianValue(String type);
    ValueDTO maxValue(String type);
    ValueDTO minValue(String type);
}
