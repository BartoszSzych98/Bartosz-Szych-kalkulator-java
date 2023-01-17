package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(final User user, final LocalDateTime orderTime, final LocalDateTime deliveryTime);
}
