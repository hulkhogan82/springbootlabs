package com.triveratravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
@SpringBootApplication
public class SpringDataBootJpa {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataBootJpa.class, args);

		/*ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		HotelService hotelService = applicationContext.getBean(HotelService.class);

		Integer reservationNumber = hotelService.makeReservation("Crash", LocalDate.now(), 5);
		System.out.printf("--- Created reservation %d ---%n", reservationNumber);

		System.out.println("--- Reservations ---");
		hotelService.getReservations().forEach(System.out::println);
		System.out.println("--------------------");
		*/
	}

}
