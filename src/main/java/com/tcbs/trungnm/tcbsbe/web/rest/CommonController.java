package com.tcbs.trungnm.tcbsbe.web.rest;

//import com.tcbs.trungnm.tcbsbe.entity.request.CategoryRequest;
import com.tcbs.trungnm.tcbsbe.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CommonController {

    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/version")
    public ResponseEntity<?> getVersion(){
        return ResponseEntity.ok("v0.0.1");
    }

 /*   @PostMapping("/trung")
    public ResponseEntity<?> getList( @RequestBody CategoryRequest request){
        System.out.println("request = " + request.toString());
        CategoryRequest category = new CategoryRequest(null, "HBV");
        categoryRepo.save(category);
        return ResponseEntity.ok( categoryRepo.findAll());
//        return ResponseEntity.ok( categoryRepo.findCategoryById(request.getId()));
    }

    @PostMapping("/trung")
    public ResponseEntity<?> getList( @RequestBody CategoryRequest request){
        System.out.println("request = " + request.toString());
        CategoryRequest update = categoryRepo.findCategoryById(1L);
        update.setName("LMK");
        categoryRepo.save(update);
        CategoryRequest category = new CategoryRequest(6L, "LMM");
        categoryRepo.save(category);

        return ResponseEntity.ok( categoryRepo.findAll());
//        return ResponseEntity.ok( categoryRepo.findCategoryById(request.getId()));
    }*/
}
