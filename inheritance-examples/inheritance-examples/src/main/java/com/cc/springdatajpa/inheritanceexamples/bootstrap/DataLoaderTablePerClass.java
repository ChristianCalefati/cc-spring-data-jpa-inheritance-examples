package com.cc.springdatajpa.inheritanceexamples.bootstrap;

import com.cc.springdatajpa.inheritanceexamples.dao.tableperclassdao.DeveloperPerTableRepository;
import com.cc.springdatajpa.inheritanceexamples.dao.tableperclassdao.PersonPerTableRepository;
import com.cc.springdatajpa.inheritanceexamples.dao.tableperclassdao.TeacherPerTableRepository;
import com.cc.springdatajpa.inheritanceexamples.model.tableperclass.DeveloperTablePerClass;
import com.cc.springdatajpa.inheritanceexamples.model.tableperclass.PersonTablePerClass;
import com.cc.springdatajpa.inheritanceexamples.model.tableperclass.TeacherTablePerClass;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class DataLoaderTablePerClass implements CommandLineRunner {
    private final PersonPerTableRepository personPerTableRepository;
    private final TeacherPerTableRepository teacherPerTableRepository;
    private final DeveloperPerTableRepository developerPerTableRepository;

    @Override
    public void run(String... args) throws Exception {
        PersonTablePerClass person = PersonTablePerClass.builder().name("Davide").surname("Campobasso").build();
        personPerTableRepository.save(person);

        TeacherTablePerClass teacher = TeacherTablePerClass.builder()
                .name("Enza")
                .surname("Vincenza")
                .salaryPerHour(25.3)
                .numberOfPupils(34)
                .build();
        teacherPerTableRepository.save(teacher);

        DeveloperTablePerClass developer = DeveloperTablePerClass.builder()
                .name("Enzo")
                .surname("Vincenzo")
                .company("Apple")
                .salaryPerProgram(500.5)
                .build();
        developerPerTableRepository.save(developer);


        List<PersonTablePerClass> allEntries = personPerTableRepository.findAll();
        for (PersonTablePerClass p : allEntries) {
            System.out.println(p);
        }
    }
}
