package com.ordering.system.order.service.application.service.ports.output.repository;


import com.ordering.system.order.service.domain.core.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {

    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
