package com.finance.mybank.transaction.service;

import com.finance.mybank.res.Response;
import com.finance.mybank.transaction.dto.TransactionDTO;
import com.finance.mybank.transaction.dto.TransactionRequest;

import java.util.List;

public interface TransactionService {
    Response<?> createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}
