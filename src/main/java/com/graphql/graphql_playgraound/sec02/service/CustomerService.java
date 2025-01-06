package com.graphql.graphql_playgraound.sec02.service;

import com.graphql.graphql_playgraound.sec02.entity.AgeRangeFilter;
import com.graphql.graphql_playgraound.sec02.entity.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    private final Flux<Customer> customers = Flux.just(
            new Customer(1,"Rajesh",35,"Mexico city"),
            new Customer(2,"Ramesh",30,"Chennai"),
            new Customer(3,"Suresh",25,"Mumbai"),
            new Customer(5,"Senthil",20,"Bengaluru")
    );

    public Flux<Customer> getAllCustomers(){
        return customers;
    }

    public Mono<Customer> getCustomerById(Integer id){
        return customers.filter(customer -> customer.getId().equals(id)).next();
    }

    public Flux<Customer> getCustomersByNameContains(String name){
        return customers.filter(customer->customer.getName().contains(name));
    }

    public Flux<Customer> getCustomersByAgeRange(AgeRangeFilter filter){
        return customers.filter(customer -> customer.getAge()>=filter.minAge()&& customer.getAge()<=filter.maxAge());
    }
}
