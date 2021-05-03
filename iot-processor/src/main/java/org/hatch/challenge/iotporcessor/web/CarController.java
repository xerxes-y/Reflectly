package org.hatch.challenge.iotporcessor.web;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.hatch.challenge.iotporcessor.dto.ValueDTO;
import org.hatch.challenge.iotporcessor.dto.VehicleDto;
import org.hatch.challenge.iotporcessor.dto.VehicleStatusReceiverDto;
import org.hatch.challenge.iotporcessor.service.DataAggregator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
@AllArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final DataAggregator dataAggregator;

    @GetMapping("/data/cars")
    @ApiOperation(
            value = "list status cars registers",
            notes = " status cars created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = VehicleStatusReceiverDto.class),
            @ApiResponse(code = 500, message = "Error", response = VehicleStatusReceiverDto.class)})
    public ResponseEntity<Flux<VehicleStatusReceiverDto>> cars() {
        Flux<VehicleStatusReceiverDto> result = dataAggregator.cars();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


    @GetMapping("/data/{type}/history")
    @ApiOperation(
            value = "list cars status data history",
            notes = "cars status created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = VehicleStatusReceiverDto.class),
            @ApiResponse(code = 500, message = "Error", response = VehicleStatusReceiverDto.class)})
    public ResponseEntity<Flux<VehicleStatusReceiverDto>> historyDataType(@PathVariable("type") String type) {
        Flux<VehicleStatusReceiverDto> result = dataAggregator.history(type);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


    @GetMapping("/data/{type}/average")
    @ApiOperation(
            value = "list cars status registers",
            notes = "cars status  data created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = ValueDTO.class),
            @ApiResponse(code = 500, message = "Error", response = ValueDTO.class)})
    public ResponseEntity<ValueDTO> averageData(@PathVariable("type") String type) {

        ValueDTO result = dataAggregator.average(type);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/data/{type}/median")
    @ApiOperation(
            value = "median value of  cars status  data registered",
            notes = "median data of type created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = ValueDTO.class),
            @ApiResponse(code = 500, message = "Error", response = ValueDTO.class)})
    public ResponseEntity<ValueDTO> medianValue(@PathVariable("type") String type) {

        ValueDTO result = dataAggregator.medianValue(type);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/data/{type}/max")
    @ApiOperation(
            value = "max value of  cars status  data registered",
            notes = "max data of type created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = ValueDTO.class),
            @ApiResponse(code = 500, message = "Error", response = ValueDTO.class)})
    public ResponseEntity<ValueDTO> maxValue(@PathVariable("type") String type) {

        ValueDTO result = dataAggregator.maxValue(type);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/data/{type}/max")
    @ApiOperation(
            value = "max value of  cars status  data registered",
            notes = "max data of type created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = ValueDTO.class),
            @ApiResponse(code = 500, message = "Error", response = ValueDTO.class)})
    public ResponseEntity<ValueDTO> minValue(@PathVariable("type") String type) {
        ValueDTO result = dataAggregator.minValue(type);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
