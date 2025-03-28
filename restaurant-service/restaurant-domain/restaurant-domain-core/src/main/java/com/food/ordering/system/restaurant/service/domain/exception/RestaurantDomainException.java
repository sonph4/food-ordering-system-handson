package com.food.ordering.system.restaurant.service.domain.exception;

public class RestaurantDomainException extends RuntimeException{
    public RestaurantDomainException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestaurantDomainException(String message) {
        super(message);
    }
}
