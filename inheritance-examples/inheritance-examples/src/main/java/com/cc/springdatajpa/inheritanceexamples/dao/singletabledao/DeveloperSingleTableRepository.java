package com.cc.springdatajpa.inheritanceexamples.dao.singletabledao;

import com.cc.springdatajpa.inheritanceexamples.model.singletable.DeveloperSingleTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DeveloperSingleTableRepository extends CrudRepository<DeveloperSingleTable, UUID> {
}
