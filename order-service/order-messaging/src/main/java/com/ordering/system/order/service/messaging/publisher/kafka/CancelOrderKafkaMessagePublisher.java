package com.ordering.system.order.service.messaging.publisher.kafka;

import com.ordering.system.order.service.application.service.ports.output.message.publisher.OrderCancelledPaymentRequestMessagePublisher;
import com.ordering.system.order.service.domain.core.events.OrderCancelledEvent;

public class CancelOrderKafkaMessagePublisher implements OrderCancelledPaymentRequestMessagePublisher {
    @Override
    public void publish(OrderCancelledEvent domainEvent) {

    }
}
