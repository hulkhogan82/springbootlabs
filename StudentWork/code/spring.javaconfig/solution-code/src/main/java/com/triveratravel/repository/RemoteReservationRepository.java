package com.triveratravel.repository;

import java.util.List;

import com.triveratravel.model.Reservation;
import com.triveratravel.repository.stub.TestData;

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
public class RemoteReservationRepository implements ReservationRepository {

	@Override
	public List<Reservation> findAll() {
		return TestData.testData();
	}

}
