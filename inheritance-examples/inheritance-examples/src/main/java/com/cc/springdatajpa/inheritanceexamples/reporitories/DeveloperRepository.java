package com.cc.springdatajpa.inheritanceexamples.reporitories;

import com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass.Developer;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperRepository extends CrudRepository<Developer, String> {
}
