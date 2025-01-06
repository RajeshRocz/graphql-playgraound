package com.graphql.graphql_playgraound.sec02.controller;

import com.graphql.graphql_playgraound.sec02.entity.AgeRangeFilter;
import com.graphql.graphql_playgraound.sec02.entity.Customer;
import com.graphql.graphql_playgraound.sec02.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping
public Flux<Customer> getAllCustomers(){
    return customerService.getAllCustomers();
}

@QueryMapping
public Mono<Customer> getCustomerById(@Argument Integer id){
    return customerService.getCustomerById(id);
}

@QueryMapping
public Flux<Customer> getCustomerByNameContains(@Argument String name){
    return customerService.getCustomersByNameContains(name);
}

@QueryMapping
    public Flux<Customer> getCustomersByAgeRange(@Argument AgeRangeFilter filterAge) {
return customerService.getCustomersByAgeRange(filterAge);
}
}
