package com.example.mockcentral;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {
    static List<PowerStation> powerStations = new ArrayList<>();
    static void populatePowerStations() {
        powerStations.add(new PowerStation(1L, "ipv6", "WORKING", LocalDateTime.now(), 10));
        powerStations.add(new PowerStation(2L, "ipv6", "WORKING", LocalDateTime.now(), 100));
        powerStations.add(new PowerStation(3L, "ipv6", "DAMAGED", LocalDateTime.now(), 30));
        powerStations.add(new PowerStation(4L, "ipv6", "WORKING", LocalDateTime.now(), 235));
        powerStations.add(new PowerStation(5L, "ipv6", "STOPPED", LocalDateTime.now(), 1000));
        powerStations.add(new PowerStation(6L, "ipv6", "WORKING", LocalDateTime.now(), 350));
    }


    @GetMapping(path = "/calculations-db-access/power-station")
    public ResponseEntity<List<PowerStation>> getPowerStations() {
        return ResponseEntity.ok(powerStations);
    }

    @PostMapping(path = "/calculations-db-access/power-station")
    public ResponseEntity<PowerStation> connectPowerStation(@RequestBody PowerStation powerStation) {
        powerStation.setId((long) (powerStations.size() + 1));
        powerStations.add(powerStation);
        return ResponseEntity.ok(powerStation);
    }
}
