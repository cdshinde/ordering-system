package com.ordering.system.order.service.domain.core.valueobjects;



import com.ordering.system.common.valueobjects.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
