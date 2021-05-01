package org.hatch.challenge.iotcore.config;

import org.hatch.challenge.iotcore.stream.VehicleConnectedStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(value = VehicleConnectedStream.class)
public class VehicleStreamingConfig {
}
