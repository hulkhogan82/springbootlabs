package com.triveratravel.config;

import com.triveratravel.repository.JdbcReservationRepository;
import com.triveratravel.repository.ReservationRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClass(name = "org.apache.derby.jdbc.EmbeddedDriver")
public class RepositoryConfig{


    @Bean
    ReservationRepository reservationRepository(){
        JdbcReservationRepository repository = new JdbcReservationRepository();
        repository.setDataSource(dataSource());
        return repository;
    }
    @Bean
    DataSource dataSource() {
        EmbeddedDatabase dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.DERBY)
                .ignoreFailedDrops(true).addScript("ReservationDDL.sql").addScripts("ReservationData.sql").build();
        return dataSource;
    }
}