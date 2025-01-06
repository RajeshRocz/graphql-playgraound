package com.graphql.graphql_playgraound.sec05.controller;

import com.graphql.graphql_playgraound.sec05.entity.Customer;
import com.graphql.graphql_playgraound.sec05.entity.Order;
import com.graphql.graphql_playgraound.sec05.service.OrderService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
//Multiple controller with multiple schema files
    @SchemaMapping(typeName = "Customer")
    public Flux<Order> order(Customer customer){
        System.out.println("Order called for customer:"+customer.getName());
        return orderService.getOrdersByCustomer(customer);

    }
}
