package com.estation.estation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estation.estation.models.Mission;
import com.estation.estation.repository.MissionRepository;

@Service

public class MissionService {
    @Autowired
    MissionRepository missionRepository;

    public List<Mission> getMissions(){
        return missionRepository.findAll();
    }

    public Optional<Mission> getMission(Long id){
        return missionRepository.findById(id);
    }

    public void saveMission(Mission mission){
        missionRepository.save(mission);
    }

    public void delete(Long id){
        missionRepository.deleteById(id);
    }



}
