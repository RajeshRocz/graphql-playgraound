package com.graphql.graphql_playgraound.sec03.service;

import com.graphql.graphql_playgraound.sec03.entity.Customer;
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

}
