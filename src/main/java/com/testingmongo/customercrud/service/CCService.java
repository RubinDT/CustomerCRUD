package com.testingmongo.customercrud.service;


import com.testingmongo.customercrud.model.Customer;
import com.testingmongo.customercrud.repository.CCRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
public class CCService {
    CCRepository custRepository; //letting spring do the instantiation

    public CCService(CCRepository custRepository){
        this.custRepository = custRepository;

    }


    public Customer getCustData(String id){
        return(this.custRepository.findByCustomerId(id));
    }


    public void setCustomerData(Customer customer){
        custRepository.save(customer);
    }

    public void deleteCustomerData(String id){
        custRepository.delete(this.custRepository.findByCustomerId(id));
    }



}
