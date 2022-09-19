package com.ordering.system.payment.service.domain.core.valueobjects;

import com.ordering.system.common.valueobjects.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {
    public CreditEntryId(UUID value) {
        super(value);
    }
}
