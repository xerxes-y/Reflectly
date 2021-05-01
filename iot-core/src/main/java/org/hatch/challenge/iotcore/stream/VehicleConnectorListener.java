package org.hatch.challenge.iotcore.stream;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hatch.challenge.iotcore.dto.VehicleStatusReceiverDto;
import org.hatch.challenge.iotcore.service.VehicleConnector;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class VehicleConnectorListener {

    private final VehicleConnector vehicleConnector;

    @StreamListener(VehicleConnectedStream.VEHICLE_CONNECTOR)
    public void handleOrderUpdate(@Payload Message<VehicleStatusReceiverDto> message) {
        VehicleStatusReceiverDto vehicleStatus = message.getPayload();
        log.info("received payload from vehicle simulator: {}", vehicleStatus);
        vehicleConnector.saveDriverStatus(vehicleStatus);
    }

}
