package com.ordering.system.order.service.application.service.ports.output.message.publisher;

import com.ordering.system.common.events.DomainEventPublisher;
import com.ordering.system.order.service.domain.core.events.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
