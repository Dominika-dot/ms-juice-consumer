package com.dominika.msjuiceconsumer.web.services;

import java.util.UUID;

import com.dominika.msjuiceconsumer.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getById(UUID customerId);
    CustomerDto createNewCustomer(CustomerDto customerDto);
    void updateCustomerById(UUID customerId, CustomerDto customerDto);

    void deleteByid(UUID customerId);
}
