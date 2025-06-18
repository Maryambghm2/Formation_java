package org.example.exo3_spring_student.controllers;

import org.example.exo3_spring_student.models.Student;
import org.example.exo3_spring_student.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;

        //Test
        studentService.create("Titi", "Toto", 40, "titi@toto.com");
    }

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/students")
    public String getStudents(@RequestParam(name = "search", required = false) String search, Model model) {
        List<Student> students = studentService.getStudents();

        if (search == null || search.isBlank()) {
//        System.out.println("students : " + students);
        } else {
          students = studentService.getByName(search);
        }
        model.addAttribute("students", students);
        return "students";

    }

    @GetMapping("students/{id}")
    public String getById(@PathVariable("id") UUID id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
//            System.out.println("student by id : " + student);
        return "student";
    }

    @GetMapping("new")
    public String recupStudent(Model model) {
        model.addAttribute("newStudent", new Student());
        return "new";
    }


    @PostMapping("new")
    public String createStudent(@ModelAttribute("newStudent") Student student) {

        Student newStudent = studentService.create(
                student.getLastname(), student.getFirstname(), student.getAge(), student.getMail());
        return "redirect:/students";
    }
}
