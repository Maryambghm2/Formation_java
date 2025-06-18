package org.example.exo3_spring_student.services;

import lombok.Getter;
import lombok.Setter;
import org.example.exo3_spring_student.models.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Getter
@Setter
public class StudentService {
    private Map<UUID, Student> students = new HashMap<>();

    public Student create(String lastname, String firstname, int age, String mail) {
        Student newStudent = new Student(UUID.randomUUID(), lastname, firstname, age, mail);
        students.put(newStudent.getId(), newStudent);
        return newStudent;
    }

    public List<Student> getStudents() {
        return students.values().stream().toList();
    }

    public List<Student> getByName(String lastname) {
        return students.values().stream().filter(s -> s.getLastname().equals(lastname)).toList();
    }

    public Student getStudentById(UUID id) {
        return students.get(id);
    }


}
