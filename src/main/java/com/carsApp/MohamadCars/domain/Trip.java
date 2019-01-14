package com.carsApp.MohamadCars.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Trip {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long seqId;
	private String place;
	@ManyToMany(mappedBy="trips")
	private Set<Car> cars;
	
    @OneToMany(mappedBy = "trip")
    private Set<Person_Trip> person_trip;

	
	
	public Trip( String place) {
		super();
		this.place = place;
		person_trip=new HashSet<>();
	}

	public Trip() {
		super();
	}
	
	

	public Set<Person_Trip> getPerson_trip() {
		return person_trip;
	}

	public void setPerson_trip(Set<Person_Trip> person_trip) {
		this.person_trip = person_trip;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public Long getSeqId() {
		return seqId;
	}

	public void setSeqId(Long seqId) {
		this.seqId = seqId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	

}
