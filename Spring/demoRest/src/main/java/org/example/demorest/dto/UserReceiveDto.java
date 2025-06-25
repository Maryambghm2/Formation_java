package org.example.demorest.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.demorest.entity.User;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserReceiveDto {
    @Size(min = 3, max = 25)
    private String name;
    @Pattern(regexp = "[0-9]{2}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{4}" , message = "La date dois etre au format dd-MM-yyyy")
    private String birthDateStr;
    @Size(min = 4, message = "Le mot de passe doit faire au moins 4 characteres")
    private String password;


    public User dtoToEntity (){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return User.builder()
                .name(getName())
                .birthDate(LocalDate.parse(getBirthDateStr(),dateTimeFormatter))
                .password(getPassword())
                .build();
    }
}
