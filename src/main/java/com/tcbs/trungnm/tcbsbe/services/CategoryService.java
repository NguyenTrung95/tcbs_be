package com.tcbs.trungnm.tcbsbe.services;

import com.tcbs.trungnm.tcbsbe.dto.CategoryRequest;
import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Category;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
  Category createCategory(Category request);

}
