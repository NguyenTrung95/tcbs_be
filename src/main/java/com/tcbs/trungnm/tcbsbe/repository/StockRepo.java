package com.tcbs.trungnm.tcbsbe.repository;

import com.tcbs.trungnm.tcbsbe.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long> {

    Stock findStockById(Long id);

    List<Stock> findStockByName(String name);

    List<Stock> findStockByCategoryId(Long id);

   // List<Stock> findByKey(Long id, String name, String categoryName);


}
