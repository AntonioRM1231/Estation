package com.estation.estation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estation.estation.repository.MissionRepository;
import com.estation.estation.repository.TramaRepository;
import com.estation.estation.repository.VehicleRepository;
import com.estation.estation.models.Mission;
import com.estation.estation.models.Trama;
import com.estation.estation.models.Vehicle;

@Service

public class TramaService {

    @Autowired
    private TramaRepository tramaRepository;
    
    @Autowired
    private MissionRepository missionRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Trama> getTramas(){
        return tramaRepository.findAll();
    }

    //Crear una nueva trama asociada a una mision y a un vehicle
    public Trama saveTrama(Long v_id,Long m_id, Trama trama){
        Vehicle vehicle = vehicleRepository.findById(v_id).orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
        Mission mission = missionRepository.findById(m_id).orElseThrow(() -> new RuntimeException("Misión no encontrada"));
        
        trama.setVehicle(vehicle);
        trama.setMission(mission);

        tramaRepository.save(trama);
        return trama;
    }

    //Obtener todas las tramas asociadas a un vehículo 
    public List<Trama> getTramasByVehicle(Long v_id){
        Vehicle vehicle = vehicleRepository.findById(v_id).orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
        return tramaRepository.findByVehicle(vehicle);
    } 
    //Obtener todas las tramas asociadas a una mision
    public List<Trama> getTramasByMission(Long m_id){
        Mission mission = missionRepository.findById(m_id).orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
        return tramaRepository.findByMission(mission);
    }


    //Eliminar trama por su Id
    public void deleteTrama(Long t_id){
        tramaRepository.deleteById(t_id);
    }

}
