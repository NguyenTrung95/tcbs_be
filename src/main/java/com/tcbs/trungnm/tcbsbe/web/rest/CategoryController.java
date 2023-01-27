/*package com.tcbs.trungnm.tcbsbe.web.rest;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import com.tcbs.trungnm.tcbsbe.repository.CategoryRepo;
import com.tcbs.trungnm.tcbsbe.repository.StockRepo;
import com.tcbs.trungnm.tcbsbe.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CategoryController extends CommonController {

    private final CategoryService categoryService;

    @PostMapping("/category")
    public ResponseEntity<Department> createDepartment(@RequestBody DepartmentRequest departmentRequest) {
        Department department = departmentService.createDepartment(departmentRequest);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }
}*/
