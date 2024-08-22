package com.Makersharks.Makersharks.Assessment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Makersharks.Makersharks.Assessment.dto.SupplierDTO;
import com.Makersharks.Makersharks.Assessment.services.SupplierService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


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
    
    @PostMapping
    public SupplierDTO createNewSupplier(@RequestBody SupplierDTO supplierDTO) {
        return supplierService.createNewSupplier(supplierDTO);
    }
    
}