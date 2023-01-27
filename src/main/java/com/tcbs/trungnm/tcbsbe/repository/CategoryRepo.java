package com.tcbs.trungnm.tcbsbe.repository;

import com.tcbs.trungnm.tcbsbe.dto.CategoryRequest;
import com.tcbs.trungnm.tcbsbe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo  extends JpaRepository<Category, Long> {

    HttpStatus findCategoryById(Long id);

    CategoryRequest findCategoryByCompanyName(String name);

    CategoryRequest findCategoryByCategoryId(Long id);

}
