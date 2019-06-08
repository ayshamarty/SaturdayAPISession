package com.bae.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	//instantiate the list of tasks for each account
	//OneToMany expects a collection and tells the compiler it's a one to many table
	//Cascade persists any changes from account, so that you don't need to do a for each loop in the method with persist. etc
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "Account_ID")
	private Set<Task> taskSet = new HashSet<Task>();
	
	//default constructor
	public Account(){
		
	}	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Set<Task> getTaskSet() {
		return taskSet;
	}

	public void setTaskSet(Set<Task> taskSet) {
		this.taskSet = taskSet;
	}
	

}
