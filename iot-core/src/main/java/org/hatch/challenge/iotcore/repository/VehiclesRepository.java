package org.hatch.challenge.iotcore.repository;


import org.hatch.challenge.iotcore.model.Vehicle;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface VehiclesRepository extends ReactiveCrudRepository<Vehicle, String> {
    Mono<Vehicle> findByVin(String vin );
    Flux<Vehicle> findByCustomerId(String customerId);
    
    
}
