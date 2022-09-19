package com.ordering.system.payment.service.domain.core.valueobjects;


import com.ordering.system.common.valueobjects.BaseId;

import java.util.UUID;

public class CreditHistoryId extends BaseId<UUID> {
    public CreditHistoryId(UUID value) {
        super(value);
    }
}
