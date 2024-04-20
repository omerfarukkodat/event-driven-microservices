package com.kodat.of.bankingapp.repository;

import com.kodat.of.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account,Long> {
}
