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
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    StockService stockService;

    @GetMapping("/id/{id}")
    public Stock findById(
            @PathVariable(value = "id") Long id
            ){
        return stockService.findStockById(id);
    }

    @GetMapping("/name/{name}")
    public List<Stock> findByName(
            @PathVariable(value = "name") String name
    ){
        return stockService.findStockByName(name);
    }

    @GetMapping("/category/{categoryName}")
    public List<Stock> findByNameCategory(
            @PathVariable(value = "categoryName") String name
    ){
        return stockService.findStockByCategoryName(name);
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> add(@RequestBody StockRequest request) {
        stockService.saveStockToCategory(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<HttpStatus> remove( @PathVariable(value = "id") Long id){
            stockService.deleteStockToCategory(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PostMapping("/update")
    public ResponseEntity<HttpStatus> update( @RequestBody StockRequest request){
        stockService.updateStockToCategory(request);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
