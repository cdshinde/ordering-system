package com.ordering.system.order.service.application.service.ports.output.message.publisher;


import com.ordering.system.common.events.DomainEventPublisher;
import com.ordering.system.order.service.domain.core.events.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
