package com.testingmongo.customercrud.controller;

import com.testingmongo.customercrud.model.Customer;
import com.testingmongo.customercrud.service.CCService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CCController {

    CCService custCrudService; //let spring instantiate the service object

    public CCController(CCService custCrudService) {
        this.custCrudService = custCrudService;
    }

    @CrossOrigin(origins = "http://localhost:3000") //white listing localhost to get around CORS issue
    @PostMapping("/create")
    public Customer createCustomerInfo(@RequestBody Customer customer) {
        this.custCrudService.setCustomerData(customer);
        return(customer);

    }

    @CrossOrigin(origins = "http://localhost:3000")//white listing localhost to get around CORS issue
    @GetMapping("/read/{id}")
    public Customer readCustomerInfo(@PathVariable String id) {
        //look to see if this matches a last name, or a first name, or an id
        return (this.custCrudService.getCustData(id));
    }

    @CrossOrigin(origins = "http://localhost:3000")//white listing localhost to get around CORS issue
    @DeleteMapping("/delete/{id}")
    public String deleteCustomerInfo(@PathVariable String id){
        this.custCrudService.deleteCustomerData(id);
        return("Customer Deleted");
    }

    @CrossOrigin(origins = "http://localhost:3000")//white listing localhost to get around CORS issue
    @PostMapping("/update")
    public Customer updateCustomerInfo(@RequestBody Customer customer){
        this.custCrudService.setCustomerData(customer);
        return(this.custCrudService.getCustData(customer.getCustomerId()));
    }


}