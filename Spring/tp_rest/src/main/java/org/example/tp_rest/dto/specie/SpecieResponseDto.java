package org.example.tp_rest.dto.specie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.entity.enums.Category;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class SpecieResponseDto {
    private long idSpecie;
    private String commonName;
    private String scientificName;
    private Category category;
}
