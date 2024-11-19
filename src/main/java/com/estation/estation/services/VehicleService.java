package com.estation.estation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estation.estation.models.Vehicle;
import com.estation.estation.repository.VehicleRepository;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicle(Long id){
        return vehicleRepository.findById(id);
    }

    public void saveVehicle(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public void delete(Long id){
        vehicleRepository.deleteById(id);
    }
}
