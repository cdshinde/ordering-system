package com.ordering.system.order.service.application.service;

import com.ordering.system.order.service.application.service.dto.create.CreateOrderCommand;
import com.ordering.system.order.service.application.service.dto.create.CreateOrderResponse;
import com.ordering.system.order.service.application.service.ports.inputs.service.OrderApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderCreateCommandHandler orderCreateCommandHandler;


    public OrderApplicationServiceImpl(OrderCreateCommandHandler orderCreateCommandHandler) {
        this.orderCreateCommandHandler = orderCreateCommandHandler;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        return orderCreateCommandHandler.createOrder(createOrderCommand);
    }


}
