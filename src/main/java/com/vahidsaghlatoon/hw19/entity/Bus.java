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
@Table(name = "buses")
public class Bus extends BaseEntity<Long> {

    private String name ;
    private String origin ;
    private String destination;
    private Integer capacity;
    private Date date ;
    private Time time ;
    private Long ticketPrice ;
    private String driverName;
    private String driverPhone;

}
