package com.cc.springdatajpa.inheritanceexamples.reporitories.mappedsuperclassrdao;

import com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherMappedRepository extends CrudRepository<Teacher, UUID> {
}
