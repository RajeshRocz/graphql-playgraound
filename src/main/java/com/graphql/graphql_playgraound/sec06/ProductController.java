package com.graphql.graphql_playgraound.sec06;

import com.graphql.graphql_playgraound.sec06.entity.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.LocalDate;
import java.util.UUID;

@Controller
public class ProductController {

    @QueryMapping
    public Flux<Object> products(DataFetchingEnvironment env){
        return Flux.just(
                new Fruit(UUID.randomUUID(),"Apple",100, LocalDate.now().plusDays(4)),
                new Fruit(UUID.randomUUID(),"Banana",150, LocalDate.now().plusDays(2)),
                new Book(UUID.randomUUID(),"Java",800, "Robert"),
                new Book(UUID.randomUUID(),"Digital Design",900, "Morris"),
                new Electronics(UUID.randomUUID(),"phone",1000, Brand.SAMSUNG),
                new Electronics(UUID.randomUUID(),"Mac",2000, Brand.APPLE)

                );
    }

    /*
    graphQl query details:
    query getProducts{
  products{
    id
    description
    price
    ... on Fruit{expiryDate}
    ... on Book{author}
    ... on Electronics{brand}
    type: __typename #just to get type of the object
  }
}
     */
}
