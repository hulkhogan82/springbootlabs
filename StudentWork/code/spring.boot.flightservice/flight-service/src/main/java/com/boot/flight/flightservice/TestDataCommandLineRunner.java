package com.boot.flight.flightservice;

import com.boot.flight.flightservice.domain.Flight;
import com.boot.flight.flightservice.domain.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataCommandLineRunner implements CommandLineRunner {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public void run(String... args) throws Exception {
        flightRepository.save(new Flight("DL80", "Boston"));
        flightRepository.save(new Flight("KL603", "Amsterdam"));
        flightRepository.save(new Flight("UA807", "Las Vegas"));
        flightRepository.save(new Flight("DL800", "Atlanta"));
    }
}
