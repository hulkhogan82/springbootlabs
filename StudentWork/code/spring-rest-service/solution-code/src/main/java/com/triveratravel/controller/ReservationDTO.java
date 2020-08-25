package com.triveratravel.controller;

import java.time.LocalTime;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC., Worldwide
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Technologies, Inc.
 *
 * Copyright (c) 2020 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 * 
 * @author The Trivera Tech Team.
 */
public class ReservationDTO {
	private Integer reservationNumber;
	private String nameOnReservation;
	private String flightNumber;
	private String flightDestination;
	private String flightAirlineName;
	private LocalTime flightDepartureTime;

	public Integer getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(Integer reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getNameOnReservation() {
		return nameOnReservation;
	}

	public void setNameOnReservation(String nameOnReservation) {
		this.nameOnReservation = nameOnReservation;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public String getFlightAirlineName() {
		return flightAirlineName;
	}

	public void setFlightAirlineName(String flightAirlineName) {
		this.flightAirlineName = flightAirlineName;
	}

	public LocalTime getFlightDepartureTime() {
		return flightDepartureTime;
	}

	public void setFlightDepartureTime(LocalTime flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
}
