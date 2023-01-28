package com.tcbs.trungnm.tcbsbe.dto;

import lombok.Data;

@Data
public class StockRequest {
    public Long id;
    public String name;
    public Long categoryId;

    public StockRequest(Long id, String name, Long categoryId) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
    }
}
