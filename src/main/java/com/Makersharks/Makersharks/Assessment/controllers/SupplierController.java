package  com.Makersharks.Makersharks.Assessment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.Makersharks.Makersharks.Assessment.dto.SupplierDTO;

import jakarta.websocket.server.PathParam;

@RestController
public class SupplierController{

    // @GetMapping(path = "/supplier")
    // public SupplierDTO getSupplier(){
    //     return new SupplierDTO("1", "Makersharks", "www.makersharks.com", "Lagos", "Software Development", "Software Development");
    // }

    @GetMapping(path = "/supplier")
    public String getData(@PathParam("query") String query,
                          @PathParam("limit") Integer limit
    ){
        return "Aadarsh heere" + query + limit;
    }
}