package org.hatch.challenge.iotporcessor.model;

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
    private StatusDetailReceiver statusDetail;

}
