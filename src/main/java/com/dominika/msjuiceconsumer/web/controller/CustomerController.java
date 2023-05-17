package com.dominika.msjuiceconsumer.web.controller;

import java.util.UUID;

import com.dominika.msjuiceconsumer.web.model.CustomerDto;
import com.dominika.msjuiceconsumer.web.services.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity getCustomerById(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getById(customerId), HttpStatus.OK);
    }

    @PostMapping //POST -create new customer
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto){
        HttpHeaders headers = new HttpHeaders();
        //TODO - add hostname to url
        headers.add("Location", "/api/v1/customer/"+customerService.createNewCustomer(customerDto).getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){
        customerService.updateCustomerById(customerId, customerDto);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId){
        customerService.deleteByid(customerId);
        log.debug("deleting customer: "+customerId.toString());
    }
}
