package com.ordering.system.payment.service.dataaccess.creditentry.mapper;

import com.ordering.system.common.valueobjects.CustomerId;
import com.ordering.system.common.valueobjects.Money;
import com.ordering.system.payment.service.dataaccess.creditentry.entity.CreditEntryEntity;
import com.ordering.system.payment.service.domain.core.entity.CreditEntry;
import com.ordering.system.payment.service.domain.core.valueobjects.CreditEntryId;
import org.springframework.stereotype.Component;

@Component
public class CreditEntryDataAccessMapper {

    public CreditEntry creditEntryEntityToCreditEntry(CreditEntryEntity creditEntryEntity) {
        return CreditEntry.builder()
                .creditEntryId(new CreditEntryId(creditEntryEntity.getId()))
                .customerId(new CustomerId(creditEntryEntity.getCustomerId()))
                .totalCreditAmount(new Money(creditEntryEntity.getTotalCreditAmount()))
                .build();
    }

    public CreditEntryEntity creditEntryToCreditEntryEntity(CreditEntry creditEntry) {
        return CreditEntryEntity.builder()
                .id(creditEntry.getId().getValue())
                .customerId(creditEntry.getCustomerId().getValue())
                .totalCreditAmount(creditEntry.getTotalCreditAmount().getAmount())
                .build();
    }

}
