package com.ordering.system.order.service.messaging.publisher.kafka;

import com.ordering.system.order.service.application.service.ports.output.message.publisher.OrderCreatedPaymentRequestMessagePublisher;
import com.ordering.system.order.service.domain.core.events.OrderCreatedEvent;

public class CreateOrderKafkaMessagePublisher implements OrderCreatedPaymentRequestMessagePublisher {
    @Override
    public void publish(OrderCreatedEvent domainEvent) {

    }
}
