package com.ordering.system.payment.application.service.ports.output.message.publisher;


import com.ordering.system.common.events.DomainEventPublisher;
import com.ordering.system.payment.service.domain.core.events.PaymentCompletedEvent;

public interface PaymentCompletedMessagePublisher extends DomainEventPublisher<PaymentCompletedEvent> {
}
