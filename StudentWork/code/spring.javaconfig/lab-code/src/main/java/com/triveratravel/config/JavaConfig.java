package com.triveratravel.config;

import com.triveratravel.repository.RemoteReservationRepository;
import com.triveratravel.repository.ReservationRepository;
import com.triveratravel.service.HotelService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
@Configuration
@ComponentScan("com.triveratravel")
public class JavaConfig {


	@Bean
	HotelService hotelService(ReservationRepository repository){
		HotelService hotelService = new HotelService();
		hotelService.setHotelName("JTravelsphere");
		hotelService.setNumberOfRooms(256);
		hotelService.setReservationRepository(repository);
		return hotelService;
	}

	@Bean
	@Primary
	ReservationRepository remoteReservationRepository(){
		return new RemoteReservationRepository();
	}
}
