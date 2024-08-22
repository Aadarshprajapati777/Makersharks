package com.Makersharks.Makersharks.Assessment.entites;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Table(name = "suppliers")
@AllArgsConstructor
@NoArgsConstructor
public class SupplierEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplier_id;
    private String company_name;
    private String website;
    private String location;
    private String nature_of_business;
    private String manufacturing_processes;
}