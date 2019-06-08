package com.bae.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bae.domain.Account;

public class AccountRepositoryDB {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");	
	EntityManager manager = emf.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	//CREATE
	public Account create(Account account) {
		transaction.begin();
		manager.persist(account);
		transaction.commit();
		return account;	
	}
}
