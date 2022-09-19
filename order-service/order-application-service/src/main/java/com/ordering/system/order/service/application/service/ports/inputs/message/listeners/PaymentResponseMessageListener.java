package com.ordering.system.order.service.application.service.ports.inputs.message.listeners;


import com.ordering.system.order.service.application.service.dto.message.PaymentResponse;


public interface PaymentResponseMessageListener {

    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);
}
