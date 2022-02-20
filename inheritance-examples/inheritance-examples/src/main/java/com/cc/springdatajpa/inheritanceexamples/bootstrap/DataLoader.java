package com.cc.springdatajpa.inheritanceexamples.bootstrap;

import com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass.Developer;
import com.cc.springdatajpa.inheritanceexamples.model.mappedsuperclass.Teacher;
import com.cc.springdatajpa.inheritanceexamples.reporitories.DeveloperRepository;
import com.cc.springdatajpa.inheritanceexamples.reporitories.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final TeacherRepository teacherRepository;
    private final DeveloperRepository developerRepository;

    @Override
    public void run(String... args) throws Exception {
        Teacher t1 = Teacher.builder().numberOfPupils(65).salaryPerHour(12.5).build();
        t1.setName("Enrico");
        t1.setSurname("Mazzitelli");
        teacherRepository.save(t1);

        Developer d1 = Developer.builder().company("Microsoft").salaryPerProgram(1000.5).build();
        d1.setName("Daniele");
        d1.setSurname("Ambrosoli");
        developerRepository.save(d1);
    }
}
