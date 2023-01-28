package com.tcbs.trungnm.tcbsbe.services;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;

import java.util.List;

public interface StockService {
    Stock findStockById(Long id);
    List<Stock> findStockByName(String name);
    List<Stock> findStockByCategoryName(String categoryName);

    Stock updateStockToCategory(StockRequest request);
    void deleteStockToCategory(Long id);
    Stock saveStockToCategory(StockRequest reques);

}
