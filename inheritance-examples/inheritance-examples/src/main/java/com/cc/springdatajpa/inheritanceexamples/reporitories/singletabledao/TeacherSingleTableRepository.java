package com.cc.springdatajpa.inheritanceexamples.reporitories.singletabledao;

import com.cc.springdatajpa.inheritanceexamples.model.singletable.TeacherSingleTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherSingleTableRepository extends CrudRepository<TeacherSingleTable, UUID> {
}
