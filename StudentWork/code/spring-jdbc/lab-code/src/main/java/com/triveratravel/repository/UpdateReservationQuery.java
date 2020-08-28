package com.triveratravel.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;

public class UpdateReservationQuery extends SqlUpdate {
    String SQL = "UPDATE RESERVATIONS SET STATUS=? WHERE ID=?";

    @Autowired
    public UpdateReservationQuery (DataSource dataSource){

    }

}
