package com.tcbs.trungnm.tcbsbe.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table(name = "stock", schema = "public")
public class Stock implements Serializable {

    @Id
    @Basic
    @GeneratedValue
    private Long id;
    private String name;

    private Long category_id;

    public Stock(){

    }

    public Stock(Long id, String name, Long category_id) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;

    }


}