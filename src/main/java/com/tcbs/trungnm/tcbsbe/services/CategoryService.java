package com.tcbs.trungnm.tcbsbe.services;

import com.tcbs.trungnm.tcbsbe.entity.Category;
import org.springframework.stereotype.Service;
@Service
public interface CategoryService {
  Category createCategory(Category request);

}
