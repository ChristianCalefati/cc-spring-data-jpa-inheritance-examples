package com.cc.springdatajpa.inheritanceexamples.dao.joinedtabledao;

import com.cc.springdatajpa.inheritanceexamples.model.joinedtable.TeacherJoinedTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherJoinedTableRepository extends CrudRepository<TeacherJoinedTable, UUID> {
}
