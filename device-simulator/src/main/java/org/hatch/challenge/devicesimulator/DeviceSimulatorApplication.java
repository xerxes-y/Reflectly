package org.hatch.challenge.devicesimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@EnableReactiveElasticsearchRepositories
@SpringBootApplication
public class DeviceSimulatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeviceSimulatorApplication.class, args);
    }
}
