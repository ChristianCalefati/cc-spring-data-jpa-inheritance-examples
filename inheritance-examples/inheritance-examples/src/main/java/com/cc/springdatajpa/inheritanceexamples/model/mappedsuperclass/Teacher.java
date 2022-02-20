package com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teacher_mapped")
@Builder
public class Teacher extends BasePersonEntity {
    @Column(name = "n_of_pupils")
    private int numberOfPupils;
    @Column(name = "salary_per_hour")
    private double salaryPerHour;
}
