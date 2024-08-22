package com.Makersharks.Makersharks.Assessment.dto;
import org.springframework.cglib.core.Local;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO{
    private Long supplier_id;
    private String company_name;
    private String website;
    private String location;
    private String nature_of_business;
    private String manufacturing_processes;
}