package com.estation.estation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estation.estation.models.Trama;
import com.estation.estation.services.TramaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;



@RestController
@RequestMapping(path = "/trama")
public class TramaController {
    @Autowired
    private  TramaService tramaService;

    //Obtener todas las tramas
    @GetMapping
    public List<Trama> getAll(){
        return tramaService.getTramas();
    }


    @PostMapping("/mission/{m_id}/vehicle/{v_id}")
    public Trama save(@PathVariable Long v_id, @PathVariable Long m_id, @RequestBody Trama trama){
        return tramaService.saveTrama(v_id,m_id,trama);
    }
    
    //Obtener todas las tramas asociadas a un vehiculo
    @GetMapping("/vehicle/{v_id}")
    public List<Trama> getTramasByVehicle(@PathVariable Long v_id) {
        return tramaService.getTramasByVehicle(v_id);
    }

    //Obtener todas las tramas asociadas a una mision 
    @GetMapping("/mission/{m_id}")
    public List<Trama> getTramasByMission(@PathVariable Long m_id) {
        return tramaService.getTramasByMission(m_id);
    }

    @DeleteMapping("/{t_id}")
    public void deleteTrama(@PathVariable Long t_id) {
        tramaService.deleteTrama(t_id);
    }

}
