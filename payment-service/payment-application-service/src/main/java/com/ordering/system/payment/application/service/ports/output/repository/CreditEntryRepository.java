package com.ordering.system.payment.application.service.ports.output.repository;

import com.ordering.system.common.valueobjects.CustomerId;
import com.ordering.system.payment.service.domain.core.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
