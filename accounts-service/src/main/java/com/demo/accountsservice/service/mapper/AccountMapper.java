package com.demo.accountsservice.service.mapper;

import com.demo.accountsservice.service.dto.AccountDto;
import com.demo.accountsservice.domain.Account;

public class AccountMapper {

    public static AccountDto mapToAccountsDto(Account account, AccountDto accountDto) {
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBranchAddress(account.getBranchAddress());
        return accountDto;
    }

    public static Account mapToAccounts(AccountDto accountDto, Account accounts) {
        accounts.setAccountNumber(accountDto.getAccountNumber());
        accounts.setAccountType(accountDto.getAccountType());
        accounts.setBranchAddress(accountDto.getBranchAddress());
        return accounts;
    }

}