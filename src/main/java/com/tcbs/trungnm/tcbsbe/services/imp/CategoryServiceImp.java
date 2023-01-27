package com.tcbs.trungnm.tcbsbe.services.imp;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import com.tcbs.trungnm.tcbsbe.repository.CategoryRepo;
import com.tcbs.trungnm.tcbsbe.repository.StockRepo;
import com.tcbs.trungnm.tcbsbe.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements CategoryService {
    CategoryRepo categoryRepo;
    StockRepo stockRepo;

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
