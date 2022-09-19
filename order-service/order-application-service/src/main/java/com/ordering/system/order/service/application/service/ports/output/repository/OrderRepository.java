package com.ordering.system.order.service.application.service.ports.output.repository;

import com.ordering.system.common.valueobjects.OrderId;
import com.ordering.system.common.valueobjects.TrackingId;
import com.ordering.system.order.service.domain.core.entity.Order;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
