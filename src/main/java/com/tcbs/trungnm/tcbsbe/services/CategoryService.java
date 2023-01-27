package com.tcbs.trungnm.tcbsbe.services;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
  Stock updateStockToCategory(StockRequest request);
  void deleteStockToCategory(StockRequest request);
  Stock saveStockToCategory(StockRequest reques);

}
