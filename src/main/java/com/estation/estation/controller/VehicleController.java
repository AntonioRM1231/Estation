package com.estation.estation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estation.estation.models.Vehicle;
import com.estation.estation.services.VehicleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAll() {
        return vehicleService.getVehicles();
    }

    @GetMapping("/{v_id}")
    public Optional<Vehicle> getById(@PathVariable("v_id") Long v_id){
        return vehicleService.getVehicle(v_id);
    }

    @PostMapping()
    public Vehicle postMethodName(@RequestBody Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        return vehicle;
    }
    
    @DeleteMapping("/{v_id}")
    public void delete(@PathVariable("v_id") Long v_id){
        vehicleService.delete(v_id);
    }
}
