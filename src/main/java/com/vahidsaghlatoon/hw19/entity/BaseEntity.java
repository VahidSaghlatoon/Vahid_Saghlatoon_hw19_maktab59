package com.vahidsaghlatoon.hw19.entity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
public class BaseEntity <ID extends Number>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id ;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
