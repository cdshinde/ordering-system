package com.ordering.system.common.events;

public interface DomainEvent<T> {
    void fire();
}
