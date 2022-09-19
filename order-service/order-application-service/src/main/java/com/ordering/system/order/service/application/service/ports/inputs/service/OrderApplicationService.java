package com.ordering.system.order.service.application.service.ports.inputs.service;


import com.ordering.system.order.service.application.service.dto.create.CreateOrderCommand;
import com.ordering.system.order.service.application.service.dto.create.CreateOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

}
