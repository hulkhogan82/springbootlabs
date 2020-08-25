package com.triveratravel.repository;

import com.triveratravel.model.Reservation;
import com.triveratravel.repository.ReservationRepository;
import com.triveratravel.repository.stub.TestData;

import java.util.List;

public class RemoteReservationRepository implements ReservationRepository {

    @Override
    public List<Reservation> findAll() {
        return TestData.testData();
    }
}