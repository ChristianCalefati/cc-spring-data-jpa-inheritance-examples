package com.cc.springdatajpa.inheritanceexamples.model.tableperclass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class DeveloperTablePerClass extends PersonTablePerClass{
    @Column(name = "salary_per_program")
    private double salaryPerProgram;
    @Column(name = "company")
    private String company;
}
