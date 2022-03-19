package com.cc.springdatajpa.inheritanceexamples.dao.tableperclassdao;

import com.cc.springdatajpa.inheritanceexamples.model.tableperclass.TeacherTablePerClass;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherPerTableRepository extends CrudRepository<TeacherTablePerClass, UUID> {
}
