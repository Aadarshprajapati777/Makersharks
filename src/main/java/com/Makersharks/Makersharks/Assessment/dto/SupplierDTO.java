package com.Makersharks.Makersharks.Assessment.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {

    @NotNull(message = "Supplier ID cannot be null")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long supplier_id;

    @NotBlank(message = "Company name cannot be blank")
    private String company_name;

    private String website;

    @NotBlank(message = "Location cannot be blank")
    private String location;

    @NotBlank(message = "Nature of business cannot be blank")
    private String nature_of_business;

    @NotBlank(message = "Manufacturing processes cannot be blank")
    private String manufacturing_processes;
}
