package com.cc.springdatajpa.inheritanceexamples.reporitories.joinedtabledao;

import com.cc.springdatajpa.inheritanceexamples.model.joinedtable.DeveloperJoinedTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DeveloperJoinedTableRepository extends CrudRepository<DeveloperJoinedTable, UUID> {
}
