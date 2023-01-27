package com.tcbs.trungnm.tcbsbe.dto;

import lombok.Data;

@Data
public class CategoryRequest {
    public Long id;
    public String name;

    public CategoryRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
