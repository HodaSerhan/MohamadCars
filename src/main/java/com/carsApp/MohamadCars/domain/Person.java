package com.carsApp.MohamadCars.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Person_Trip> person_trip;

	
	public Person(String name) {
		super();
		this.name = name;
		person_trip=new HashSet<>();
		
	}
	public Person() {
		super();
	}
	
	
	public Set<Person_Trip> getPerson_trip() {
		return person_trip;
	}
	public void setPerson_trip(Set<Person_Trip> person_trip) {
		this.person_trip = person_trip;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
