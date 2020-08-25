package com.triveratravel.model;

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

public class Reservation {
	private Integer reservationNumber;
	private String nameOnReservation;
	private Flight flight;

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

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Reservation{" +
				"reservationNumber=" + reservationNumber +
				", nameOnReservation='" + nameOnReservation + '\'' +
				", flight=" + flight +
				'}';
	}
}
