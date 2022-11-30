package br.com.fiap.nano.teste.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {
    Long id;
    String name;
    String description;
    BigDecimal price;
    LocalDateTime dateTimeSave;
    Categoria categoria;
}
