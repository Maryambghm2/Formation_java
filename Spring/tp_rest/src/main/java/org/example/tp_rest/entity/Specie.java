package org.example.tp_rest.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.enums.Category;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "species")
public class Specie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSpecie;

    private String commonName;
    private String scientificName;

    private Category category;


}
