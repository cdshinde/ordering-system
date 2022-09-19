package com.ordering.system.common.events;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class EmptyEvent implements DomainEvent<Void>{

    public static final EmptyEvent INSTANCE = new EmptyEvent();

    private EmptyEvent(){

    }

    @Override
    public void fire() {
        log.info("Empty Event");
    }
}
