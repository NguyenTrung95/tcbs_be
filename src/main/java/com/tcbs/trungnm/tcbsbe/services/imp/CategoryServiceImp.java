package com.tcbs.trungnm.tcbsbe.services.imp;

import com.tcbs.trungnm.tcbsbe.dto.CategoryRequest;
import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Category;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import com.tcbs.trungnm.tcbsbe.repository.CategoryRepo;
import com.tcbs.trungnm.tcbsbe.repository.StockRepo;
import com.tcbs.trungnm.tcbsbe.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Category createCategory(Category category) {
        if(!categoryRepo.existsByName(category.getName())) {
            category.setName(category.getName());
            return categoryRepo.save(category);
        }
        return  null;
    }
}
