package com.bae.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bae.domain.Account;

public class AccountRepositoryDB {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
	
	EntityManager manager = emf.createEntityManager();
	
	public Account create(Account account) {
		manager.persist(account);
		return account;
		
	}
}
