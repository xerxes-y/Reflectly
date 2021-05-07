package org.hatch.challenge.iotporcessor.service.impl;

import lombok.AllArgsConstructor;
import org.hatch.challenge.iotporcessor.dto.ValueDTO;
import org.hatch.challenge.iotporcessor.dto.VehicleStatusReceiverDto;
import org.hatch.challenge.iotporcessor.repository.StatusRepository;
import org.hatch.challenge.iotporcessor.repository.VehiclesRepository;
import org.hatch.challenge.iotporcessor.service.DataAggregator;
import reactor.core.publisher.Flux;
@AllArgsConstructor
public class DataAggregatorImpl implements DataAggregator {
    private final VehiclesRepository vehiclesRepository;
    private final StatusRepository statusRepository;

    @Override
    public Flux<VehicleStatusReceiverDto> cars() {
            return null;
    }

    @Override
    public Flux<VehicleStatusReceiverDto> history(String type) {
        return null;
    }

    @Override
    public ValueDTO average(String type) {
        return null;
    }

    @Override
    public ValueDTO medianValue(String type) {
        return null;
    }

    @Override
    public ValueDTO maxValue(String type) {
        return null;
    }

    @Override
    public ValueDTO minValue(String type) {
        return null;
    }
}
