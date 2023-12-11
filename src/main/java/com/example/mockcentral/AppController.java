package com.example.mockcentral;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {
    @GetMapping(path = "/calculations-db-access/power-station")
    public ResponseEntity<List<PowerStation>> getPowerStations() {
        List<PowerStation> resultList = new ArrayList<>();
        resultList.add(new PowerStation(1L, "ipv6", "WORKING", LocalDateTime.now(), 10));
        resultList.add(new PowerStation(2L, "ipv6", "WORKING", LocalDateTime.now(), 100));
        resultList.add(new PowerStation(3L, "ipv6", "DAMAGED", LocalDateTime.now(), 30));
        resultList.add(new PowerStation(4L, "ipv6", "WORKING", LocalDateTime.now(), 235));
        resultList.add(new PowerStation(5L, "ipv6", "STOPPED", LocalDateTime.now(), 1000));
        resultList.add(new PowerStation(6L, "ipv6", "WORKING", LocalDateTime.now(), 350));
        return ResponseEntity.ok(resultList);
    }
}
