package org.hatch.challenge.iotporcessor.web;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.hatch.challenge.iotporcessor.dto.ValueDTO;
import org.hatch.challenge.iotporcessor.dto.VehicleStatusReceiverDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {


    @PostMapping("/data")
    @ApiOperation(
            value = "create/input data for cars",
            notes = "uses name manufacturer and type to check if the car already exists")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 400, message = "", response = VehicleStatusReceiverDto.class),
            @ApiResponse(code = 500, message = "Error", response = VehicleStatusReceiverDto.class)})
    public ResponseEntity<VehicleStatusReceiverDto> inputData(@Validated @RequestBody VehicleStatusReceiverDto request) {

        DeviceDataResponseDTO result = inputDeviceDataService.inputData(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping()
    @ApiOperation(
            value = "list status cars registers",
            notes = " status cars created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = DeviceResponseDTO.class),
            @ApiResponse(code = 500, message = "Error", response = DeviceResponseDTO.class)})
    public ResponseEntity<List<DeviceResponseDTO>> listDevice() {

        List<DeviceResponseDTO> result = inputDeviceDataService.listDevices();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


    @GetMapping("/data/{type}/history")
    @ApiOperation(
            value = "list cars status data history",
            notes = "cars status created")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 400, message = "", response = DeviceDataResponseDTO.class),
            @ApiResponse(code = 500, message = "Error", response = DeviceDataResponseDTO.class)})
    public ResponseEntity<List<DeviceDataResponseDTO>> historyDataType(@PathVariable("type") String type) {

        List<DeviceDataResponseDTO> result = inputDeviceDataService.history(type);
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

        ValueDTO result = inputDeviceDataService.average(type);
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

        ValueDTO result = inputDeviceDataService.maxValue(type);
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

        ValueDTO result = inputDeviceDataService.maxValue(type);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
