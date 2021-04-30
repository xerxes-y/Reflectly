package org.hatch.challenge.devicesimulator.repository;


import org.hatch.challenge.devicesimulator.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CustomersRepository extends ReactiveCrudRepository<Customer, String> {
    Mono<Customer> findByFullName(String fullName);
}
