package com.estation.estation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estation.estation.models.Mission;
import com.estation.estation.services.MissionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController 
@RequestMapping(path = "/mission")
public class MissionController {

    @Autowired
    private MissionService missionService;
    

    @GetMapping
    public List<Mission> getAll() {
        return missionService.getMissions();
    }
    
    @GetMapping("/{m_id}")
    public Optional<Mission> getById(@PathVariable("m_id") Long m_id) {
        return missionService.getMission(m_id);
    }
    


    @PostMapping
    public Mission save(@RequestBody Mission mission) {
        missionService.saveMission(mission);
        return mission;
    }

    @DeleteMapping("/{m_id}")
    public void delete(@PathVariable("m_id") Long m_id){
        missionService.delete(m_id);
    }

    
}
