package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotNull(message = "O nome do aluno não pode ficar vazio")
    @NotEmpty(message = "O nome do aluno não pode ficar vazio")
    @NotBlank(message = "O nome do aluno não pode ficar vazio")
    @Size(max = 50, message = "O comprimento do nome não pode exceder 50 caracteres")
    @Pattern(regexp = "[A-Z][a-z]+", message = "O nome do aluno deve começar com a letra maiúscula")
    String studentName;

    String message;
    Double averageScore;

    @Valid
    List<SubjectDTO> subjects;
}
