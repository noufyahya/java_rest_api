package com.saas.Sales.controller;

import com.saas.Sales.Entity.products;
import com.saas.Sales.service.salesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class salesController {

    @Autowired
    private salesService salesservice;

    @GetMapping("/top-products")
    public List<Object []> getTopProducts(){
        //This gets top products based on revenue
        return salesservice.getTopProducts();

    }

}
