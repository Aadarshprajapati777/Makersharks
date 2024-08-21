package  com.Makersharks.Makersharks.Assessment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Makersharks.Makersharks.Assessment.dto.SupplierDTO;

@RestController
public class SupplierController{

    @GetMapping(path = "/supplier")
    public SupplierDTO getSupplier(){
        return new SupplierDTO("1", "Makersharks", "www.makersharks.com", "Lagos", "Software Development", "Software Development");
    }
}