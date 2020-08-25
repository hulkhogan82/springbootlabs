package com.triveratravel.model;

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

public class Flight {
	private String flightNumber;
	private String destination;
	private String destinationCode;
	private String airlineName;
	private String airlineCode;
	private LocalTime departureTime;
	private String terminal;
	private boolean codeShare;

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

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public boolean isCodeShare() {
		return codeShare;
	}

	public void setCodeShare(boolean codeShare) {
		this.codeShare = codeShare;
	}

	@Override
	public String toString() {
		return "Flight{" +
				"flightNumber='" + flightNumber + '\'' +
				", destination='" + destination + '\'' +
				", destinationCode='" + destinationCode + '\'' +
				", airlineName='" + airlineName + '\'' +
				", airlineCode='" + airlineCode + '\'' +
				", departureTime=" + departureTime +
				", terminal='" + terminal + '\'' +
				", codeShare=" + codeShare +
				'}';
	}
}
