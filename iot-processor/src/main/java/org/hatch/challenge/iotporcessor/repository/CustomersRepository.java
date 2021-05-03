package org.hatch.challenge.iotporcessor.repository;


import org.hatch.challenge.iotporcessor.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CustomersRepository extends ReactiveCrudRepository<Customer, String> {
    Mono<Customer> findByFullName(String fullName);
}
