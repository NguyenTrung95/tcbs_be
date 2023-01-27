package com.tcbs.trungnm.tcbsbe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "category", schema = "public")
public class Category implements Serializable {

    @Id
    @Basic
    @GeneratedValue
    private Long id;
    private String name;

    public Category(){

    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
