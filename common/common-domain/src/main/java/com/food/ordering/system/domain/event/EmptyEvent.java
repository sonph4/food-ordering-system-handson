package com.food.ordering.system.domain.event;

public final class EmptyEvent implements DomainEvent{

    public static final EmptyEvent INSTANCE = new EmptyEvent();

    private EmptyEvent(){}
}
