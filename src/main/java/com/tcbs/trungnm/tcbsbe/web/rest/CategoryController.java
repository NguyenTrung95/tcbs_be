package com.tcbs.trungnm.tcbsbe.web.rest;

import com.tcbs.trungnm.tcbsbe.dto.CategoryRequest;
import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Category;
import com.tcbs.trungnm.tcbsbe.services.CategoryService;
import com.tcbs.trungnm.tcbsbe.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/add")
    public Category createCategory(@RequestBody Category request) {
        return categoryService.createCategory(request);
    }
}
