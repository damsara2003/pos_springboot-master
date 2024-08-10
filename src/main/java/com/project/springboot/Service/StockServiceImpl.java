package com.project.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.Repository.StockRepository;
import com.project.springboot.entity.Stock;

@Service
public class StockServiceImpl implements StockService {


    @Autowired
    private StockRepository stockRepository;

    @Override
    public List <Stock> getAllStocks () {
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockById (Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public Stock createStock (Stock stock){
        return stockRepository.save(stock);

    }

    @Override
    public Stock updateStock (Long id, Stock stock){
        Stock existStock = stockRepository.findById(id).orElse(null);

        if (existStock == null ) {
            return null;
            
        }
        existStock.setName(stock.getName());
        existStock.setQuantity(stock.getQuantity());

        return stockRepository.save(existStock);
    }

    
}
