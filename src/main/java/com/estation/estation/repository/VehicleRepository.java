package com.estation.estation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estation.estation.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
    
}
