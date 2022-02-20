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
@Table(name = "developer_joined_table")
public class DeveloperJoinedTable extends PersonJoinedTable{
    @Column(name = "salary_per_program")
    private double salaryPerProgram;
    @Column(name = "company")
    private String company;
}
