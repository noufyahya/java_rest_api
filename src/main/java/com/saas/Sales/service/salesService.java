package com.saas.Sales.service;

import com.saas.Sales.Entity.products;
import com.saas.Sales.repo.salesRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Service
public class salesService {
    @Autowired
    private salesRepo repo;


    public List<Object[]> getTopProducts(){
    return repo.findTopProducts();
   }

}
