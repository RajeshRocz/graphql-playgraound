package com.graphql.graphql_playgraound.sec05.controller;

import com.graphql.graphql_playgraound.sec05.entity.Customer;
import com.graphql.graphql_playgraound.sec05.entity.Order;
import com.graphql.graphql_playgraound.sec05.service.CustomerService;
import com.graphql.graphql_playgraound.sec05.service.OrderService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @SchemaMapping(typeName = "Query")
public Flux<Customer> getCustomers(){
    return customerService.getAllCustomers();
}


}
