package com.hendisantika.handler;

//import com.hendisantika.dto.Customer;
//import com.hendisantika.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-webflux-openapi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/10/21
 * Time: 08.17
 */
@Service
public class CustomerHandler {

//    @Autowired
//    private CustomerRepository customerRepository;

    public Mono<ServerResponse> loadCustomers(ServerRequest request) {
//        Flux<Integer> customerList = customerRepository.getCustomerList();
        return ServerResponse.ok().body(Flux.just(List.of(1, 2)), Integer.class);
    }

//    public Mono<ServerResponse> findCustomer(ServerRequest request) {
//        int customerId =  4; //Integer.parseInt(request.pathVariable("input"));
//        Predicate<Integer> x = c -> c == customerId;
//        // dao.getCustomerList().filter(c->c.getId()==customerId).take(1).single();
////        Mono<Integer> customerMono = customerRepository.getCustomerList()
////                .filter(x)
////                .next();
//        return ServerResponse.ok().body(Mono.just("find"), Integer.class);
//    }
//
//    public Mono<ServerResponse> saveCustomer(ServerRequest request) {
////        Mono<Customer> customerMono = request.bodyToMono(Customer.class);
////        Mono<String> saveResponse = customerMono.map(dto -> dto.getId() + ":" + dto.getName());
//        return ServerResponse.ok().body(Mono.just("hello"), String.class);
//    }
}
