package com.graphql.graphql_playgraound.sec04.controller;

import com.graphql.graphql_playgraound.sec04.entity.Customer;
import com.graphql.graphql_playgraound.sec04.entity.Order;
import com.graphql.graphql_playgraound.sec04.service.CustomerService;
import com.graphql.graphql_playgraound.sec04.service.OrderService;
import org.springframework.graphql.data.method.annotation.BatchMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerService customerService;
    private final OrderService orderService;

    public CustomerController(CustomerService customerService, OrderService orderService) {
        this.customerService = customerService;
        this.orderService = orderService;
    }


    @SchemaMapping(typeName = "Query")
public Flux<Customer> getCustomers(){
    return customerService.getAllCustomers();
}


//Fetch order only when client request order details in the request customer details
    @BatchMapping(typeName = "Customer")
public Flux<List<Order>> order(List<Customer> customers){
        System.out.println("Order called for customers:"+customers);
        return orderService.getOrdersByCustomer(customers);

}

}
