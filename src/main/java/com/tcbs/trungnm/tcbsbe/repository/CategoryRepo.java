package com.tcbs.trungnm.tcbsbe.repository;

import com.tcbs.trungnm.tcbsbe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo  extends JpaRepository<Category, Long> {

     Category findByName(String name);
     boolean existsByName(String name);

}
