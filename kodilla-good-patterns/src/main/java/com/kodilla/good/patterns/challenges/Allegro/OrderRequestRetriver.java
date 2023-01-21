package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("Bartosz", "Szych");

        LocalDateTime orderTime = LocalDateTime.of(2023, 1, 15, 20, 20, 22);
        LocalDateTime deliveryTime = LocalDateTime.of(2023, 2, 1, 12, 15, 59);

        return new OrderRequest(user, orderTime, deliveryTime);
    }
}
