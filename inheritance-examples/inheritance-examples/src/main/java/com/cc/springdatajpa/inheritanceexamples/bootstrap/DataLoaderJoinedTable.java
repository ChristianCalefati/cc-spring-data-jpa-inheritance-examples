package com.cc.springdatajpa.inheritanceexamples.bootstrap;

import com.cc.springdatajpa.inheritanceexamples.model.joinedtable.DeveloperJoinedTable;
import com.cc.springdatajpa.inheritanceexamples.model.joinedtable.PersonJoinedTable;
import com.cc.springdatajpa.inheritanceexamples.model.joinedtable.TeacherJoinedTable;
import com.cc.springdatajpa.inheritanceexamples.reporitories.joinedtabledao.DeveloperJoinedTableRepository;
import com.cc.springdatajpa.inheritanceexamples.reporitories.joinedtabledao.PersonJoinedTableRepository;
import com.cc.springdatajpa.inheritanceexamples.reporitories.joinedtabledao.TeacherJoinedTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoaderJoinedTable implements CommandLineRunner {

    private final PersonJoinedTableRepository personJoinedTableRepository;
    private final TeacherJoinedTableRepository teacherJoinedTableRepository;
    private final DeveloperJoinedTableRepository developerJoinedTableRepository;

    @Override
    public void run(String... args) throws Exception {
        PersonJoinedTable p1 = PersonJoinedTable.builder().name("Davide").surname("Campobasso").build();
        personJoinedTableRepository.save(p1);

        TeacherJoinedTable t1 =TeacherJoinedTable.builder()
                .name("Noemi")
                .surname("Castiglione")
                .numberOfPupils(65)
                .salaryPerHour(12.5)
                .build();
        teacherJoinedTableRepository.save(t1);

        DeveloperJoinedTable d1 = DeveloperJoinedTable.builder()
                .name("Angelo")
                .surname("Ustacchio")
                .company("Microsoft")
                .salaryPerProgram(100.4)
                .build();
        developerJoinedTableRepository.save(d1);
    }
}
