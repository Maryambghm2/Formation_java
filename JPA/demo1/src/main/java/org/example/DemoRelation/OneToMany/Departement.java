package org.example.DemoRelation.OneToMany;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartement;

    private String name;


//@OneToMany
//    @JoinColumn(name = "idProfesseur" )
//
//    private List<Professeur> professeurList;

    @OneToMany(mappedBy = "departement")
    private List<Professeur> professeurList;
}
