package com.ordering.system.payment.service.domain.core.valueobjects;

import com.ordering.system.common.valueobjects.BaseId;

import java.util.UUID;

public class PaymentId extends BaseId<UUID> {
    public PaymentId(UUID value) {
        super(value);
    }
}
