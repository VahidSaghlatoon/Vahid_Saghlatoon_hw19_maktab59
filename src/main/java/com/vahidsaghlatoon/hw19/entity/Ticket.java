package com.vahidsaghlatoon.hw19.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "tickets")
public class Ticket extends BaseEntity<Long> {
    private String firstname ;
    private String lastname;
    private String nationalCode ;
    private String gender ;
    private String phone ;
    private String origin;
    private String destination;
    private Date date;
    private Time time ;
    private Long tripId ;
    private Long price ;
}
