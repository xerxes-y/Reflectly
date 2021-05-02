package org.hatch.challenge.iotporcessor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValueDTO {
    public ValueDTO(Double val){
        this.value = val.toString();
    }
    private String value;
}