package com.example.microAnuncios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaDto {
    private int id_categoria;
    private String descripcion;
}
