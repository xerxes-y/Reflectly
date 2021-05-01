package org.hatch.challenge.iotcore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "status",type = "status")
@Data
public class Customer {
    @Id
    private String id;
    private String fullName;
    private String address;
}
