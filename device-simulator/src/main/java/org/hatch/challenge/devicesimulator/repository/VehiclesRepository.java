package org.hatch.challenge.devicesimulator.repository;


import org.hatch.challenge.devicesimulator.model.Vehicle;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface VehiclesRepository extends ReactiveCrudRepository<Vehicle, String> {
    Mono<Vehicle> findByVinAndCustomerId(String vin , String customerId);
}
