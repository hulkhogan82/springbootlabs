package com.triveratravel;

import com.triveratravel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TestDataCommandLineRunner implements CommandLineRunner {

    @Autowired
    private HotelService hotelService;

    @Override
    public void run(String... args) throws Exception {
        hotelService.makeReservation("Diego", LocalDate.now(), 5);
        hotelService.makeReservation("Sid", LocalDate.now().plusDays(1), 4);
    }
}
