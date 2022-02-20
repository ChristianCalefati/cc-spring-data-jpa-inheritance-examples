package com.cc.springdatajpa.inheritanceexamples.model.joinedtable;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "teacher_joined_table")
public class TeacherJoinedTable extends PersonJoinedTable{
    @Column(name = "n_of_pupils")
    private int numberOfPupils;
    @Column(name = "salary_per_hour")
    private double salaryPerHour;
}
