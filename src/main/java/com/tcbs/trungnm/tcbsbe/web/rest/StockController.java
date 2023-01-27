package com.tcbs.trungnm.tcbsbe.web.rest;

import com.tcbs.trungnm.tcbsbe.dto.StockRequest;
import com.tcbs.trungnm.tcbsbe.entity.Stock;
import com.tcbs.trungnm.tcbsbe.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api")
public class StockController extends CommonController {

    @Autowired
    StockService stockService;

    @GetMapping("/find")
    public ResponseEntity<?> findByCategoryId( @RequestParam(defaultValue = "")  ){
        return ResponseEntity.ok( stockService.findStockByCategoryId(request.category_id));
    }

    @PostMapping("/category/add")
    public ResponseEntity<HttpStatus> add(@RequestBody StockRequest request) {
        stockService.saveStockToCategory(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/category/remove")
    public ResponseEntity<HttpStatus> remove( @RequestBody StockRequest request){
            stockService.deleteStockToCategory(request);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/category/update")
    public ResponseEntity<HttpStatus> update( @RequestBody StockRequest request){
        stockService.updateStockToCategory(request);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
