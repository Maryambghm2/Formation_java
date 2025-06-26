package org.example.tp_rest.dto.specie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.entity.Specie;
import org.example.tp_rest.entity.enums.Category;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpecieReceiveDto {

    private String commonName;
    private String scientificName;
    private Category category;


    public Specie dtoToEntity() {
        return Specie.builder()
                .commonName(getCommonName())
                .scientificName(getScientificName())
                .category(getCategory())
                .build();
    }
}
