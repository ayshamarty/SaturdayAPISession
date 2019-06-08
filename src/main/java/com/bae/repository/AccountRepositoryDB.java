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
	
	//CREATE  manager.persist
	public Account create(Account account) {
		transaction.begin();
		manager.persist(account);
		transaction.commit();
		return account;	
	}
	
	//READ manager.find
	
	//DELETE manager.delete
	
	//UPDATE doesn't have a method for update as it doesn't need it - you just change something in create
	public Account update(int id, String name) {
		transaction.begin();
		Account returned = manager.find(Account.class, id);
		returned.setName(name);
		transaction.commit();
		return returned;	
	}
}
