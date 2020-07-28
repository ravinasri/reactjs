package com.example.react.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.react.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder,String>{
//	List<AccountHolder> findByTitleContaining(String title);

}
