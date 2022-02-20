package com.cc.springdatajpa.inheritanceexamples.bootstrap;

import com.cc.springdatajpa.inheritanceexamples.model.singletable.DeveloperSingleTable;
import com.cc.springdatajpa.inheritanceexamples.model.singletable.PersonSingleTable;
import com.cc.springdatajpa.inheritanceexamples.model.singletable.TeacherSingleTable;
import com.cc.springdatajpa.inheritanceexamples.reporitories.singletabledao.DeveloperSingleTableRepository;
import com.cc.springdatajpa.inheritanceexamples.reporitories.singletabledao.PersonSingleTableRepository;
import com.cc.springdatajpa.inheritanceexamples.reporitories.singletabledao.TeacherSingleTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoaderSingleTable implements CommandLineRunner {

    private final PersonSingleTableRepository personSingleTableRepository;
    private final DeveloperSingleTableRepository developerSingleTableRepository;
    private final TeacherSingleTableRepository teacherSingleTableRepository;

    @Override
    public void run(String... args) throws Exception {
        PersonSingleTable p1 = PersonSingleTable.builder().name("Davide").surname("Campobasso").build();
        personSingleTableRepository.save(p1);

        TeacherSingleTable t1 = TeacherSingleTable.builder()
                .name("Noemi")
                .surname("Castiglione")
                .numberOfPupils(65)
                .salaryPerHour(12.5)
                .build();
        teacherSingleTableRepository.save(t1);

        DeveloperSingleTable d1 = DeveloperSingleTable.builder()
                .name("Angelo")
                .surname("Ustacchio")
                .company("Microsoft")
                .salaryPerProgram(100.4)
                .build();
        developerSingleTableRepository.save(d1);
    }
}
