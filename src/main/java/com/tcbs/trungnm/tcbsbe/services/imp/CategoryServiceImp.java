package com.tcbs.trungnm.tcbsbe.services.imp;

import com.tcbs.trungnm.tcbsbe.entity.Category;
import com.tcbs.trungnm.tcbsbe.repository.CategoryRepo;
import com.tcbs.trungnm.tcbsbe.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
