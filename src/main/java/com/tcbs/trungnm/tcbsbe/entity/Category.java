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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
    public void setId(Long id){this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Category() {

    }
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
