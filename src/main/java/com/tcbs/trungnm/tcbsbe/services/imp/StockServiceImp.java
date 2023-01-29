package com.tcbs.trungnm.tcbsbe.services.imp;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Category;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import com.tcbs.trungnm.tcbsbe.repository.CategoryRepo;
import com.tcbs.trungnm.tcbsbe.repository.StockRepo;
import com.tcbs.trungnm.tcbsbe.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockServiceImp implements StockService {

    @Autowired
    StockRepo stockRepo;

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public Stock findStockById(Long id) {
        return stockRepo.findStockById(id);

    }
    @Override
    public List<Stock> findStockByName(String name) {
        return stockRepo.findStockByName(name);
    }

    @Override
    public List<Stock> findStockByCategoryName(String categoryName) {
        List<Stock> stocks = new ArrayList<>();
        Category categoryFinded = categoryRepo.findByName(categoryName);
        if(categoryFinded != null) {
            stocks = stockRepo.findStockByCategoryId(categoryFinded.getId());
            return stocks;
        }
        return stocks;

    }

    @Override
    public Stock updateStockToCategory(StockRequest request) {
        Stock stockFindById = stockRepo.findById(request.id).orElseThrow();
        stockFindById.setCategoryId(request.categoryId);
        stockFindById.setName(request.name);
        return stockRepo.save(stockFindById);
    }

    @Override
    public void deleteStockToCategory(Long id) {
        stockRepo.deleteById(id);
    }

    @Override
    public Stock saveStockToCategory(StockRequest request) {
        if(!stockRepo.existsById(request.getId())) {
            Stock newStock = new Stock(request.id, request.name,request.categoryId);
            return stockRepo.save(newStock);
        }
        return  null;
    }

}
