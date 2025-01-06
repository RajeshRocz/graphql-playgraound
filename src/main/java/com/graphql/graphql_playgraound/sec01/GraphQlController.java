package com.graphql.graphql_playgraound.sec01;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class GraphQlController {

    @QueryMapping
    public Mono<String> sayHello(){
        return Mono.just("Hello World");
    }

    @QueryMapping
    public Mono<String> sayHelloName(@Argument String name){
        return Mono.fromSupplier(()-> "Hello "+name);
    }
}
