package com.ordering.system.common.events;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
