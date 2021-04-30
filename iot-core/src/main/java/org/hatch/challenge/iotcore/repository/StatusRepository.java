package org.hatch.challenge.iotcore.repository;


import org.hatch.challenge.iotcore.model.Status;
import org.hatch.challenge.iotcore.model.StatusDetailReceiver;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface StatusRepository extends ReactiveCrudRepository<Status, String> {
    Mono<Status> findTopByCustomerId(String customerId);
    Mono<Status> findTopByVin(String vin);
    Flux<Status> findByStatusDetail(StatusDetailReceiver statusDetail);


}
