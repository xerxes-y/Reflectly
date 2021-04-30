package org.hatch.challenge.iotcore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {
    @Id
    private String id;
    private String fullName;
    private String address;
}
