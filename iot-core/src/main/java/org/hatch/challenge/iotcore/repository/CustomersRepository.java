package org.hatch.challenge.iotcore.repository;


import org.hatch.challenge.iotcore.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CustomersRepository extends ReactiveCrudRepository<Customer, String> {
    Mono<Customer> findByFullNameStartingWith(String fullName);
}
