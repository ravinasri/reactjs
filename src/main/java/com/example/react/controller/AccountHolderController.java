package com.example.react.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.react.model.AccountHolder;
import com.example.react.repository.AccountHolderRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AccountHolderController {


  @Autowired
  AccountHolderRepository accountRepository;

  @GetMapping("/accounts")
  public ResponseEntity<List<AccountHolder>> getAllDetails(@RequestParam(required = false) String customer_name) {
    try {
      List<AccountHolder> accounts = new ArrayList<AccountHolder>();

      if (customer_name == null)
    	  accountRepository.findAll().forEach(accounts::add);
      else
    	 System.out.println("pls check it");

      if (accounts.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(accounts, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  
  
  @PostMapping("/accounts")
  public ResponseEntity<AccountHolder> create(@RequestBody AccountHolder accountholder) {
    try {
    	AccountHolder _accountholder = accountRepository.save(new AccountHolder(accountholder.getCustomer_name(), accountholder.getCustomer_address(), accountholder.getAccount_type(),accountholder.getAccount_number(),accountholder.getNomination()));
      return new ResponseEntity<>(_accountholder, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
    }
  }
}
