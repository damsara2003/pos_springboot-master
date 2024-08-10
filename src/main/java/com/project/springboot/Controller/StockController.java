package com.project.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.Service.StockService;
import com.project.springboot.entity.Item;
import com.project.springboot.entity.Stock;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("/stocks")
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/stocks/{id}")
    public ResponseEntity<Stock> getStockById(@PathVariable Long id) {
        Stock stock = stockService.getStockById(id);

        if (stock == null) {
            return ResponseEntity.status(404).build();

        } else {
            return ResponseEntity.status(200).body(stock);
        }

    }

    @PostMapping("/stocks")
    public Stock createStock(@RequestBody Stock stock) {

        return stockService.createStock(stock);
    }
    

    @PutMapping("/stocks/{id}")
    public Stock updateStock(@PathVariable Long id, @RequestBody Stock stock) {

        return stockService.updateStock(id, stock);
    }

}
