package com.ordering.system.payment.application.service.mapper;


import com.ordering.system.common.valueobjects.CustomerId;
import com.ordering.system.common.valueobjects.Money;
import com.ordering.system.common.valueobjects.OrderId;

import com.ordering.system.payment.application.service.dto.PaymentRequest;
import com.ordering.system.payment.service.domain.core.entity.Payment;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PaymentDataMapper {

    public Payment paymentRequestModelToPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .orderId(new OrderId(UUID.fromString(paymentRequest.getOrderId())))
                .customerId(new CustomerId(UUID.fromString(paymentRequest.getCustomerId())))
                .price(new Money(paymentRequest.getPrice()))
                .build();
    }
}
