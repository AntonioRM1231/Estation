package com.estation.estation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="trama")
public class Trama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long t_id; //Id de la Trama 
    

    //Relación muchos a uno (varias tramas pertenenecen a un cliente)
    @ManyToOne
    @JoinColumn(name = "fk_m_id")
    private Mission mission;

    //Relación muchos a uno con Vehicle
    @ManyToOne
    @JoinColumn(name = "fk_v_id") //Llave foránea v_id
    private Vehicle vehicle;

    private String t_data;//Data de la trama

}
