package com.dominika.msjuiceconsumer.web.services;

import java.util.UUID;

import com.dominika.msjuiceconsumer.web.model.CustomerDto;
import com.dominika.msjuiceconsumer.web.model.JuiceDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getById(final UUID customerId) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Antek")
            .build();
    }

    @Override
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Reksio")
            .build();
    }

    @Override
    public void updateCustomerById(final UUID customerId, final CustomerDto customerDto) {
        //TODO - jak będzie DB
    }

    @Override
    public void deleteByid(final UUID customerId) {
        //TODO - jak będzie db
    }
}
