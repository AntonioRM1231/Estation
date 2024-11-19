package com.estation.estation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="mission")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long m_id; //Id de mision

    private String m_name; //Nombre de la mision
    private Date m_date;//Fecha de la mision
    private String m_place; //Lugar de la mision

    //Realcion uno a muchos (una Mision tiene varias Tramas)
    @OneToMany(mappedBy = "mission")
    private List<Trama> tramas;


}
