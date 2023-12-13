package com.Stock.Repositories;


import com.Stock.entities.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    //@Query("select s from Stock s where s.numstock like :numstock")
    //public Page<Stock> StockByNum(@Param("numstock") String num, Pageable pageable);
    List<Stock> findAll();
}


