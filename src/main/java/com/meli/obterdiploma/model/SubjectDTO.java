package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotNull(message = "O nome do assunto não pode ficar vazio")
    @NotEmpty(message = "O nome do assunto não pode ficar vazio")
    @NotBlank(message = "O nome do assunto não pode ficar vazio")
//    @Pattern(regexp = "[A-Z][a-z]+", message = "O nome do assunto deve começar com a letra maiúscula")
    @Size(max = 30, message = "O comprimento do nome do assunto não pode exceder 30 caracteres")
    String name;

    @NotNull(message = "a nota  não pode estar vazia")
    @Min(value = 0)
    @Max(value = 10)
    Double score;
}
