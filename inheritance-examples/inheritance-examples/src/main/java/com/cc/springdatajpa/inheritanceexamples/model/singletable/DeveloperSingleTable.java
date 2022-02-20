package com.cc.springdatajpa.inheritanceexamples.model.singletable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("1")
public class DeveloperSingleTable extends PersonSingleTable {
    @Column(name = "salary_per_program")
    private double salaryPerProgram;
    @Column(name = "company")
    private String company;
}
