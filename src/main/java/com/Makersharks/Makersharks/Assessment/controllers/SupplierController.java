package com.Makersharks.Makersharks.Assessment.controllers;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

import com.Makersharks.Makersharks.Assessment.dto.SupplierDTO;
import com.Makersharks.Makersharks.Assessment.services.SupplierService;
import com.Makersharks.Makersharks.Assessment.dto.MyRequest;

@RestController
@RequestMapping(path = "/api/v1/supplier")
public class SupplierController {
    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping(path = "/{id}")
    // @RateLimited
    public SupplierDTO getSupplierById(@PathVariable("id") Long supplierId) {
        return supplierService.getSupplierById(supplierId);
    }

    @PostMapping("/search")
    @RateLimited
    public Page<SupplierDTO> getAllSuppliers(@Valid @RequestBody MyRequest request,
                                              @RequestParam(defaultValue = "0") int pageNo,
                                              @RequestParam(defaultValue = "3") int pageSize) {
        return supplierService.getAllSuppliers(pageNo, pageSize, request.getLocation(), request.getNature_of_business(), request.getManufacturing_processes());
    }

    @PostMapping("/create")
    // @RateLimited
    public SupplierDTO createNewSupplier(@Valid @RequestBody SupplierDTO supplierDTO) {
        return supplierService.createNewSupplier(supplierDTO);
    }
}
