package com.tcbs.trungnm.tcbsbe.services.imp;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import com.tcbs.trungnm.tcbsbe.repository.StockRepo;
import com.tcbs.trungnm.tcbsbe.services.StockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements StockService {
    StockRepo stockRepo;

    @Override
    public List<Stock> findStockById(Long id) {
        return stockRepo.findStockById(id);

    }

    @Override
    public List<Stock> findStockByCompanyName(String name) {
        return stockRepo.findStockByCompanyName(name);
    }

    @Override
    public List<Stock> findStockByCategoryId(Long category_id) {
        return stockRepo.findStockByCategoryId(category_id);

    }

    @Override
    public Stock updateStockToCategory(StockRequest request) {
        Stock stockFindById = stockRepo.findById(request.id)
                .orElseThrow();
        stockFindById.setCategory_id(request.category_id);
        stockFindById.setId(request.id);
        stockFindById.setName(request.name);

        return stockRepo.save(stockFindById);
    }

    @Override
    public void deleteStockToCategory(StockRequest request) {
        stockRepo.deleteById(request.id);
    }

    @Override
    public Stock saveStockToCategory(StockRequest request) {
        Stock newStock = new Stock(request.id, request.name,request.category_id);
        return stockRepo.save(newStock);
    }
}
