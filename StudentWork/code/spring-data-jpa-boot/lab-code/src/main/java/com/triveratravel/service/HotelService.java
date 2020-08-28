package com.triveratravel.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import com.triveratravel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triveratravel.model.Reservation;

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
@Service
public class HotelService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Integer makeReservation(String nameOnReservation, LocalDate arrivalDate, int numberOfNights) {

        // Save the reservation
        Reservation reservation =
                new Reservation(nameOnReservation, arrivalDate, numberOfNights);
        reservationRepository.save(reservation);
        return reservation.getId();
    }

    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

}
