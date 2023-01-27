package com.tcbs.trungnm.tcbsbe.dto;

import lombok.Data;

@Data
public class StockRequest {
    public Long id;
    public String name;
    public Long category_id;

    public StockRequest(Long id, String name, Long category_id) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
    }
}
