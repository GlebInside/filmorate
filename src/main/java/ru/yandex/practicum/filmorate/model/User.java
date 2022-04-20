package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class User {
    int userId;
    @Email
    String email;
    @NotBlank
    String login;
    String name;
    LocalDate birthday;
}