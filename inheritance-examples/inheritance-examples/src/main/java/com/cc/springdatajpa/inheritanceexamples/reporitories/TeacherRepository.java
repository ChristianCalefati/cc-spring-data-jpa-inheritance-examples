package com.cc.springdatajpa.inheritanceexamples.reporitories;

import com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, String> {
}
