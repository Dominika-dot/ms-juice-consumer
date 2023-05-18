package com.dominika.msjuiceconsumer.web.mappers;

import com.dominika.msjuiceconsumer.domain.Customer;
import com.dominika.msjuiceconsumer.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto (Customer customer);
    Customer customerDtoToCustomer (CustomerDto customerDto);
}
