package com.example.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.react.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder,Integer>{


}
