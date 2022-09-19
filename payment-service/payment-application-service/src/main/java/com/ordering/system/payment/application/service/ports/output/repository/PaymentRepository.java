package com.ordering.system.payment.application.service.ports.output.repository;


import com.ordering.system.payment.service.domain.core.entity.Payment;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> findByOrderId(UUID orderId);
}
