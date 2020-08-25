package com.boot.flight.flightservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private long id;

    private String flightNumber;
    private String destination;

    public Flight() {
        super();

    }

    public Flight(String flightNumber, String destination) {
        super();
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


}

