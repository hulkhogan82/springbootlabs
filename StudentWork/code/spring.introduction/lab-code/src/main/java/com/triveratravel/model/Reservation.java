package com.triveratravel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOnReservation;

    public Reservation(String nameOnReservation, LocalDate arrivalDate, int numberOfNights) {
        this.nameOnReservation = nameOnReservation;
        this.arrivalDate = arrivalDate;
        this.numberOfNights = numberOfNights;
    }

    private LocalDate arrivalDate;
    private int numberOfNights;

    public Reservation(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOnReservation() {
        return nameOnReservation;
    }

    public void setNameOnReservation(String nameOnReservation) {
        this.nameOnReservation = nameOnReservation;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
}