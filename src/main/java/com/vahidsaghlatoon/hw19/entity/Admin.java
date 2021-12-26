package com.vahidsaghlatoon.hw19.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "admins")
public class Admin extends BaseEntity<Long> {
    private String firstname;
    private String lastname ;
    private String nationalCode;
    private String username ;
    private String password ;
}
