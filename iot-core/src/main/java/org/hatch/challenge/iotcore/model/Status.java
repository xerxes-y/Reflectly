package org.hatch.challenge.iotcore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


import java.util.Date;

@Document(indexName = "status",type = "status")
@Data
public class Status {
    @Id
    private String id;
    private String vin;
    private String customerId;
    private int driverId;
    private int ping;
    private Date time;
    private String carType;
    private StatusDetailReceiver statusDetail;

}
