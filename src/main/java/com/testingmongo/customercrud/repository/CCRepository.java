package com.testingmongo.customercrud.repository;


import com.testingmongo.customercrud.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CCRepository extends MongoRepository<Customer,String> {
    //Spring and Mongo line up keyword "findBy" "CustomerId" from Customer model class to build these
    public Customer findByFirstName(String firstName);
    public Customer findByLastName(String lastName);
    public Customer findByAge(Integer age); //"Integer" not "int" for interface
    public Customer findByCustomerId(String id);

}
