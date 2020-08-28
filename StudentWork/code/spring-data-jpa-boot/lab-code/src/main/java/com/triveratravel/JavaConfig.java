package com.triveratravel;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class JavaConfig {

    @Bean
    @ConfigurationProperties("travel.datasource")
    public DataSource dataSource() {
        /*DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.driverClassName("org.apache.derby.jdbc.ClientDriver")
                .username("triveratravel")
                .password("password")
                .url("jdbc:derby://localhost:50505/Hotel");
         */
        return DataSourceBuilder.create().build();
    }
}
