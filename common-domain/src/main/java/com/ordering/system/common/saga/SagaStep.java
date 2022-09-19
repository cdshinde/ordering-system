package com.ordering.system.common.saga;

import com.ordering.system.common.events.DomainEvent;

public interface SagaStep<T, S extends DomainEvent, U extends DomainEvent> {
    S process(T data);
    U rollback(T data);
}
