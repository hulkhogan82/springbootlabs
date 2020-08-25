package com.triveratravel.service;

import com.triveratravel.model.Reservation;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC., Worldwide
 * <p>
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Technologies, Inc.
 * <p>
 * Copyright (c) 2020 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 *
 * @author The Trivera Tech Team.
 */

public interface HotelService {

   Optional<Reservation> findReservation(Integer reservationNumber);

   List<Reservation> findReservations(String nameOnReservation);

   List<Reservation> findReservations(String hotelName, String nameOnReservationLike);

   int getNumberOfReservations(String hotelName);

   List<Reservation> findReservations(LocalDate arrivalDate);

   Page<Reservation> findReservations(String hotelName, int page);
}
