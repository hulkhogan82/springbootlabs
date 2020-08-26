package com.triveratravel;

import com.triveratravel.model.Reservation;
import com.triveratravel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class InitializeApplicationData implements CommandLineRunner {

    @Autowired
    private ReservationRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<Reservation> reservations = new ArrayList<>();
        reservations.add(new Reservation("Sid", LocalDate.now(), 4));
        reservations.add(new Reservation("Scrat", LocalDate.now(), 4));
        reservations.add(new Reservation("Manfred", LocalDate.now(), 4));
        reservations.add(new Reservation("Diego", LocalDate.now(), 4));
        reservations.add(new Reservation("Eddie", LocalDate.now(), 4));

        reservations.forEach(repository::save);
    }
}
