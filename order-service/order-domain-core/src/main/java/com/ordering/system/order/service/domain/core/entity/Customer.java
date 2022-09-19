package com.ordering.system.order.service.domain.core.entity;

import com.ordering.system.common.entity.AggregateRoot;
import com.ordering.system.common.valueobjects.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {
    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
