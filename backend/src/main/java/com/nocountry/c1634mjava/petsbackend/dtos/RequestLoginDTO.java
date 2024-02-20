package com.nocountry.c1634mjava.petsbackend.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestLoginDTO {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
