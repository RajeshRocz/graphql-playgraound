package com.graphql.graphql_playgraound.sec05.controller;

import com.graphql.graphql_playgraound.sec05.entity.Customer;
import com.graphql.graphql_playgraound.sec05.entity.Order;
import com.graphql.graphql_playgraound.sec05.service.CustomerService;
import com.graphql.graphql_playgraound.sec05.service.OrderService;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.DataFetchingFieldSelectionSet;
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
public Flux<Customer> getCustomers(DataFetchingEnvironment dataFetchingEnvironment){
        //Get what is the environment requested from
        System.out.println(dataFetchingEnvironment.getDocument());
    return customerService.getAllCustomers();
}


/*
graphql query details:

query getCustomersByAgeRange($kids:AgeRangeFilter!, $adults:AgeRangeFilter!){
 kids: getCustomersByAgeRange(filterAge:$kids){
    id
    name
    age
  city
  }
   adults: getCustomersByAgeRange(filterAge:$adults){
    id
    name
    age
    city
  }
}

variables:

{
  "kids":{
"minAge":0,
  "maxAge":5
},
  "adults":{
"minAge":6,
  "maxAge":35
}
}

 */


}
