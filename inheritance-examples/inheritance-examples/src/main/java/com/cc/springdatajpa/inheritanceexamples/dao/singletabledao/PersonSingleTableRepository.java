package com.cc.springdatajpa.inheritanceexamples.dao.singletabledao;

import com.cc.springdatajpa.inheritanceexamples.model.singletable.PersonSingleTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonSingleTableRepository extends CrudRepository<PersonSingleTable, UUID> {
}
