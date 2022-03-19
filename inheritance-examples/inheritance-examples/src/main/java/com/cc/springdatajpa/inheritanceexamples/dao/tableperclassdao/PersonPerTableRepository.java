package com.cc.springdatajpa.inheritanceexamples.dao.tableperclassdao;

import com.cc.springdatajpa.inheritanceexamples.model.tableperclass.PersonTablePerClass;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface PersonPerTableRepository extends CrudRepository<PersonTablePerClass, UUID> {
    List<PersonTablePerClass> findAll();
}
