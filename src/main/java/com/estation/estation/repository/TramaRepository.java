package com.estation.estation.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estation.estation.models.Mission;
import com.estation.estation.models.Trama;
import com.estation.estation.models.Vehicle;

public interface TramaRepository extends JpaRepository<Trama, Long>{

    List<Trama> findByVehicle(Vehicle vehicle);
    List<Trama> findByMission(Mission mission);
}
