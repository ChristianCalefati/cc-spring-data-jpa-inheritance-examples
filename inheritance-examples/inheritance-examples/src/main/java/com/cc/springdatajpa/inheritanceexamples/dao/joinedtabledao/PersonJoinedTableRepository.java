package com.cc.springdatajpa.inheritanceexamples.dao.joinedtabledao;

import com.cc.springdatajpa.inheritanceexamples.model.joinedtable.PersonJoinedTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonJoinedTableRepository extends CrudRepository<PersonJoinedTable, UUID> {
}
