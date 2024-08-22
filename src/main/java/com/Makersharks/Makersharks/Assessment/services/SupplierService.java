package com.Makersharks.Makersharks.Assessment.services;

import java.util.function.Supplier;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.Makersharks.Makersharks.Assessment.dto.SupplierDTO;
import com.Makersharks.Makersharks.Assessment.entites.SupplierEntity;
import com.Makersharks.Makersharks.Assessment.repositories.SupplierRepository;

@Service
public class SupplierService {
    final SupplierRepository supplierRepository;
    final ModelMapper modelMapper;
    
    public SupplierService(SupplierRepository supplierRepository, ModelMapper modelMapper) {
        this.supplierRepository = supplierRepository;
        this.modelMapper = modelMapper;
    }

    public SupplierDTO getSupplierById(Long Id) {
        SupplierEntity supplierEntity = supplierRepository.getReferenceById(Id);
        return modelMapper.map(supplierEntity, SupplierDTO.class);
    }
    
    public SupplierDTO createNewSupplier(SupplierDTO supplierDTO) {
        SupplierEntity supplierEntity = modelMapper.map(supplierDTO, SupplierEntity.class);
        return modelMapper.map(supplierRepository.save(supplierEntity), SupplierDTO.class);
    }
}
