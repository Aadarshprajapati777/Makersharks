package com.Makersharks.Makersharks.Assessment.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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


    public Page<SupplierDTO> getAllSuppliers(int pageNo, int pageSize, String location, String nature_of_business, String manufacturing_processes) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<SupplierEntity> supplierPage = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, nature_of_business, manufacturing_processes, pageable);
        List<SupplierDTO> supplierDTOList = supplierPage.getContent().stream()
            .map(supplierEntity -> modelMapper.map(supplierEntity, SupplierDTO.class))
            .collect(Collectors.toList());
    
        return new PageImpl<>(supplierDTOList, pageable, supplierPage.getTotalElements());
    }
    

    
    
}
