package com.bae;

import com.bae.domain.Account;
import com.bae.domain.Task;
import com.bae.repository.AccountRepositoryDB;

public class App {
	public static void main(String[] args) {
		
		
		// ideally you would do this all in a test so as not to cloud up the main - this is just for the learning process
		Account a = new Account();
		a.setName("Danny");	
		Task t = new Task();
		t.setTodo("Work");
		a.getTaskSet().add(t);	
		
		AccountRepositoryDB db = new AccountRepositoryDB();
		//call the method in AccountRepositoryDB to persist this table
		db.create(a);
		
	}
}
