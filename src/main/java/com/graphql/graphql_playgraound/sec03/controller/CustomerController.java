package com.graphql.graphql_playgraound.sec03.controller;

import com.graphql.graphql_playgraound.sec03.entity.Customer;
import com.graphql.graphql_playgraound.sec03.entity.Order;
import com.graphql.graphql_playgraound.sec03.service.CustomerService;
import com.graphql.graphql_playgraound.sec03.service.OrderService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

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
    @SchemaMapping(typeName = "Customer")
public Flux<Order> order(Customer customer){
        System.out.println("Order called for customer:"+customer.getName());
        return orderService.getOrdersByCustomer(customer);

}

}
