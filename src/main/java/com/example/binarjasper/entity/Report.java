package com.example.binarjasper.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Report {
    @Id
    private long id;
    private String name;
    private String job;
    private long salary;
}
