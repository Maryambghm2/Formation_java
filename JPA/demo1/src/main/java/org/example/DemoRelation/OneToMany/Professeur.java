package org.example.DemoRelation.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesseur;

    private String name;

    @ManyToOne
    @JoinColumn(name = "idDepartement")

    private Departement departement;


    @Override
    public String toString() {
        return "Profeseur{" +
                "idProfeseur=" + idProfesseur +
                ", name='" + name + '\'' +
                '}';
    }

}
