package com.kodilla.good.patterns.challenges.food2Door.providers;

import com.kodilla.good.patterns.challenges.food2Door.Order;
import com.kodilla.good.patterns.challenges.food2Door.OrderDto;

public interface Provider {
    String getProviderName();

    OrderDto process(Order order);
}
