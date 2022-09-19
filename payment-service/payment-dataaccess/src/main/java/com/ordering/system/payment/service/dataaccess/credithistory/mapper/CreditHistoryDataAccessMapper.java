package com.ordering.system.payment.service.dataaccess.credithistory.mapper;

import com.ordering.system.common.valueobjects.CustomerId;
import com.ordering.system.common.valueobjects.Money;
import com.ordering.system.payment.service.dataaccess.credithistory.entity.CreditHistoryEntity;
import com.ordering.system.payment.service.domain.core.entity.CreditHistory;
import com.ordering.system.payment.service.domain.core.valueobjects.CreditHistoryId;
import org.springframework.stereotype.Component;

@Component
public class CreditHistoryDataAccessMapper {

    public CreditHistory creditHistoryEntityToCreditHistory(CreditHistoryEntity creditHistoryEntity) {
        return CreditHistory.builder()
                .creditHistoryId(new CreditHistoryId(creditHistoryEntity.getId()))
                .customerId(new CustomerId(creditHistoryEntity.getCustomerId()))
                .amount(new Money(creditHistoryEntity.getAmount()))
                .transactionType(creditHistoryEntity.getType())
                .build();
    }

    public CreditHistoryEntity creditHistoryToCreditHistoryEntity(CreditHistory creditHistory) {
        return CreditHistoryEntity.builder()
                .id(creditHistory.getId().getValue())
                .customerId(creditHistory.getCustomerId().getValue())
                .amount(creditHistory.getAmount().getAmount())
                .type(creditHistory.getTransactionType())
                .build();
    }

}
