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
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("2")
public class TeacherSingleTable extends PersonSingleTable {
    @Column(name = "n_of_pupils")
    private int numberOfPupils;
    @Column(name = "salary_per_hour")
    private double salaryPerHour;
}
