package org.hatch.challenge.devicesimulator.utill;

import lombok.RequiredArgsConstructor;
import org.hatch.challenge.devicesimulator.config.PropertiesKey;
import org.hatch.challenge.devicesimulator.model.Customer;
import org.hatch.challenge.devicesimulator.model.Vehicle;
import org.hatch.challenge.devicesimulator.repository.CustomersRepository;
import org.hatch.challenge.devicesimulator.repository.VehiclesRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ApplicationStartup
        implements ApplicationRunner {
    private final CustomersRepository customersRepository;
    private final VehiclesRepository vehiclesRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(customersRepository.findByFullName(PropertiesKey.Customer1).block()==null){
            customersRepository.save(Customer.builder()
                    .fullName(PropertiesKey.Customer1).address(PropertiesKey.Customer1_Address).build()).subscribe(customer -> {
                vehiclesRepository.saveAll(
                        List.of(
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer1_Vin).regNr(PropertiesKey.Customer1_RegNr1).build(),
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer1_Vin2).regNr(PropertiesKey.Customer1_RegNr2).build(),
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer1_Vin3).regNr(PropertiesKey.Customer1_RegNr3).build()
                        )).subscribe();
            });

        }
        if(customersRepository.findByFullName(PropertiesKey.Customer2).block()==null){
            customersRepository.save(Customer.builder().fullName(PropertiesKey.Customer2).address(PropertiesKey.Customer2_Address).build()).subscribe(customer -> {
                vehiclesRepository.saveAll(
                        List.of(
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer2_Vin1).regNr(PropertiesKey.Customer2_RegNr1).build(),
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer2_Vin2).regNr(PropertiesKey.Customer2_RegNr2).build()
                        )).subscribe();
            });
        }
        if(customersRepository.findByFullName(PropertiesKey.Customer3).block()==null){
            customersRepository.save(Customer.builder()
                    .fullName(PropertiesKey.Customer3).address(PropertiesKey.Customer3_Address).build()).subscribe(customer -> {
                vehiclesRepository.saveAll(
                        List.of(
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer3_Vin1).regNr(PropertiesKey.Customer3_RegNr1).build(),
                                Vehicle.builder().customerId(customer.getId()).vin(PropertiesKey.Customer3_Vin2).regNr(PropertiesKey.Customer3_RegNr2).build()
                        )).subscribe();
            });
        }
    }
}