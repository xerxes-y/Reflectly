package org.hatch.challenge.devicesimulator.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "customer", type = "customer")
@Data
@Builder
@Value
public class Customer {
    @Id
    String id;
    String fullName;
    String address;
}
