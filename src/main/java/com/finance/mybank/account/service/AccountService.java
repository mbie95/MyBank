package com.finance.mybank.account.service;

import com.finance.mybank.account.dto.AccountDTO;
import com.finance.mybank.account.entity.Account;
import com.finance.mybank.auth_user.entity.User;
import com.finance.mybank.enums.AccountType;
import com.finance.mybank.res.Response;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountType accountType, User user);
    Response<List<AccountDTO>> getMyAccounts();
    Response<?> closeAccount(String accountNumber);
}
