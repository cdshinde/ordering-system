package com.ordering.system.order.service.domain.core;

import com.ordering.system.common.events.DomainEventPublisher;
import com.ordering.system.order.service.domain.core.entity.Order;
import com.ordering.system.order.service.domain.core.entity.Restaurant;
import com.ordering.system.order.service.domain.core.events.OrderCreatedEvent;
import com.ordering.system.order.service.domain.core.events.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant,
                                               DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher);

    OrderPaidEvent payOrder(Order order, DomainEventPublisher<OrderPaidEvent> orderPaidEventDomainEventPublisher);

    void cancelOrder(Order order, List<String> failureMessages);

}
