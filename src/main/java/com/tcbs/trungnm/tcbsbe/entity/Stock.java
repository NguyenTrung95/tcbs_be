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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private Long categoryId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Stock(){

    }
    public Stock(Long id, String name, Long categoryId) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;

    }


}