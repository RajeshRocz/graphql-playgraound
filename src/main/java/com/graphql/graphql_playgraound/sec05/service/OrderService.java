package com.graphql.graphql_playgraound.sec05.service;

import com.graphql.graphql_playgraound.sec05.entity.Customer;
import com.graphql.graphql_playgraound.sec05.entity.Order;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class OrderService {

    private final Map<String, List<Order>> orderDetails=Map.of(
            "Rajesh",List.of(new Order(UUID.randomUUID(), "Rajesh Order1"),new Order(UUID.randomUUID(), "Rajesh Order2")),
            "Ramesh",List.of(new Order(UUID.randomUUID(), "Ramesh Order1"),new Order(UUID.randomUUID(), "Ramesh Order2"),new Order(UUID.randomUUID(), "Ramesh Order3")),
            "Suresh",List.of(new Order(UUID.randomUUID(), "Suresh Order1"))
            );

    public Flux<Order> getOrdersByCustomer(Customer customer){
        return Flux.fromIterable(orderDetails.getOrDefault(customer.getName(), Collections.emptyList()));
    }
}
