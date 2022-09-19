package com.ordering.system.order.service.dataaccess.customer.mapper;

import com.ordering.system.common.valueobjects.CustomerId;
import com.ordering.system.order.service.dataaccess.customer.entity.CustomerEntity;
import com.ordering.system.order.service.domain.core.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }
}
