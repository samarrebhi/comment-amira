package com.Stock.Controller;

import com.Stock.Service.StockService;
import com.Stock.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequestMapping("Stock")
@RestController
public class StockRestAPI {

    @Autowired
    private StockService StockService;

    @GetMapping(value = "/getallstock", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<String>>findallstock() {
        List<Stock> list=StockService.findAll();
        return (ResponseEntity<List<String>>) list;}


    @PostMapping(value ="/addstock",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Stock> createStock(@RequestBody Stock Stock) {
        return new ResponseEntity<>(StockService.addStock(Stock), HttpStatus.OK);
    }


    @PutMapping(value = "/updatestock/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    Stock updateStock(@PathVariable("id") Long id ,@RequestBody Stock stock){
        return  StockService.updateStock(id,stock);
    }
    @DeleteMapping(value = "deletestock/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteStock(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(StockService.deleteStock(id), HttpStatus.OK);
    }
}
