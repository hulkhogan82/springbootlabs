package com.triveratravel;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JavaConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.driverClassName("org.apache.derby.jdbc.ClientDriver")
                .username("triveratravel")
                .password("password")
                .url("jdbc:derby://localhost:50505/Hotel");
        return builder.build();
    }
}
