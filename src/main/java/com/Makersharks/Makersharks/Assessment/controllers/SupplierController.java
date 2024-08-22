package com.Makersharks.Makersharks.Assessment.controllers;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Makersharks.Makersharks.Assessment.dto.SupplierDTO;
import com.Makersharks.Makersharks.Assessment.services.SupplierService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/api/v1/supplier")
public class SupplierController{
    final SupplierService supplierService;
    SupplierController(SupplierService supplierService){
        this.supplierService = supplierService;
    }

    @GetMapping(path = "/{id}")
    public SupplierDTO getSupplierById(@PathVariable("id") Long supplierid) {
        return supplierService.getSupplierById(supplierid);
    }

    // @GetMapping
    // public ResponseEntity<Page<Product>> getProducts(
    //         @RequestParam(defaultValue = "0") int pageNo,
    //         @RequestParam(defaultValue = "10") int pageSize) {
        
    //     Page<Product> products = productService.getProducts(pageNo, pageSize);
    //     return ResponseEntity.ok(products);
    // }
  
    @GetMapping
    public Page<SupplierDTO> getAllSuppliers(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "3") int pageSize) {
        return supplierService.getAllSuppliers(pageNo, pageSize);
    }
    
    @PostMapping
    public SupplierDTO createNewSupplier(@RequestBody SupplierDTO supplierDTO) {
        return supplierService.createNewSupplier(supplierDTO);
    }
    
}