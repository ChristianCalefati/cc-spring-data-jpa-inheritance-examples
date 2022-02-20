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
@Table(name = "developer_mapped")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Developer extends BasePersonEntity {
    @Column(name = "salary_per_program")
    private double salaryPerProgram;
    @Column(name = "company")
    private String company;
}
