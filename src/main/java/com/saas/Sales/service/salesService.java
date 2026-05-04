package com.saas.Sales.service;

import com.saas.Sales.Entity.products;
import com.saas.Sales.repo.salesRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NoArgsConstructor
@Service
public class salesService {
    @Autowired
    private salesRepo repo;
    private static final Logger logger = LoggerFactory.getLogger(salesService.class);


    public List<Object[]> getTopProducts(){
    return repo.findTopProducts();
   }

    public List<Object[]> getTopSegments(){
        return repo.findTopSegments();
    }
    public products addProduct(products product1) {
        logger.info("record added");
        return repo.save(product1);
    }

    public List<products> showProducts() {
        return repo.findAll();
    }
}
