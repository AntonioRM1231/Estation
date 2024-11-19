package com.estation.estation.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long v_id; //Id de vehiculo
    private String v_name;//Nombre del vehiculo
    private String v_type;//Tipo de vehiculo
    private String v_function;//Funcion del vehiculo

    //Realcion uno a muchos (una Mision tiene varias Tramas)
    @OneToMany(mappedBy = "vehicle")
    private List<Trama> tramas; 
  
}
