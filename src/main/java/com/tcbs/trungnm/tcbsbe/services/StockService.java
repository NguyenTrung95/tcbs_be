package com.tcbs.trungnm.tcbsbe.services;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> findStockById(Long id);
    List<Stock> findStockByCompanyName(String name);
    List<Stock> findStockByCategoryId(Long category_id);
    Stock updateStockToCategory(StockRequest request);
    void deleteStockToCategory(StockRequest request);
    Stock saveStockToCategory(StockRequest reques);
}
