package com.ordering.system.payment.application.service.ports.output.repository;



import com.ordering.system.common.valueobjects.CustomerId;
import com.ordering.system.payment.service.domain.core.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
