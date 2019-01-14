package com.carsApp.MohamadCars.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_trip")
public class Person_Trip implements Serializable{
	
	@Id
	@ManyToOne
    @JoinColumn(name = "person_id")
	private Person person;
	
	@Id
	@ManyToOne
    @JoinColumn(name = "trip_id")
	private Trip trip;
	
    @Column(name = "items")
	private String items;

	
	
	public Person_Trip(Person person, Trip trip, String items) {
		super();
		this.person = person;
		this.trip = trip;
		this.items = items;
	}

	public Person_Trip() {
		super();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
	
}
