package org.example.demo_validation.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Contact {
    private Long id;

    @NotNull
    @NotBlank
    private String firstname;

    @NotNull
    @Size(min = 3, max = 35, message = "3 char min ; 35 char max svp !!!")
    private String lastname;

    @Min(18)
    @Max(77)
    private Integer age;
}
