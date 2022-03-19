package com.cc.springdatajpa.inheritanceexamples.dao.tableperclassdao;

import com.cc.springdatajpa.inheritanceexamples.model.tableperclass.DeveloperTablePerClass;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DeveloperPerTableRepository extends CrudRepository<DeveloperTablePerClass, UUID> {
}
