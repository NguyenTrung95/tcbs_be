package com.tcbs.trungnm.tcbsbe.repository;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long> {

    List<Stock> findStockById(Long id);

    List<Stock> findStockByCompanyName(String name);

    List<Stock> findStockByCategoryId(Long category_id);



}
