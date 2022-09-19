package com.ordering.system.order.service.application.service.ports.output.repository;

import com.ordering.system.order.service.domain.core.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);
}
