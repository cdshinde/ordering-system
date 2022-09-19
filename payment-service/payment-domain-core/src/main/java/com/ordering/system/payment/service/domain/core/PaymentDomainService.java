package com.ordering.system.payment.service.domain.core;

import com.ordering.system.common.events.DomainEventPublisher;
import com.ordering.system.payment.service.domain.core.entity.CreditEntry;
import com.ordering.system.payment.service.domain.core.entity.CreditHistory;
import com.ordering.system.payment.service.domain.core.entity.Payment;
import com.ordering.system.payment.service.domain.core.events.PaymentCancelledEvent;
import com.ordering.system.payment.service.domain.core.events.PaymentCompletedEvent;
import com.ordering.system.payment.service.domain.core.events.PaymentEvent;
import com.ordering.system.payment.service.domain.core.events.PaymentFailedEvent;


import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages,
                                            DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher,
                                            DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages,
                                          DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher,
                                          DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);
}
