package com.cc.springdatajpa.inheritanceexamples.reporitories.mappedsuperclassrdao;

import com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass.Developer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DeveloperMappedRepository extends CrudRepository<Developer, UUID> {
}
