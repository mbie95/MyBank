package com.finance.mybank.audit_dashboard.service;

import com.finance.mybank.account.dto.AccountDTO;
import com.finance.mybank.auth_user.dto.UserDTO;
import com.finance.mybank.transaction.dto.TransactionDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AuditorService {
    Map<String, Long> getSystemTotals();
    Optional<UserDTO> findUserByEmail(String email);
    Optional<AccountDTO> findAccountDetailsByAccountNumber(String accountNumber);
    List<TransactionDTO> findTransactionsByAccountNumber(String accountNumber);
    Optional<TransactionDTO> findTransactionById(Long transactionId);
}
