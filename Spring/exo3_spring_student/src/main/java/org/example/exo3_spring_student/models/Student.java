package org.example.exo3_spring_student.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
 private UUID id;
 private String lastname;
 private String firstname;
 private int age;
 private String mail;
}
