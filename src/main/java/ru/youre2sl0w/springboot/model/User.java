package ru.youre2sl0w.springboot.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "users")
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Pattern(regexp = "^[A-ZА-Я]{1}[a-zA-Zа-яА-Я]*((-)[a-zA-Zа-яА-Я])*$", message = "Некорректный формат имени: проверьте введённые данные")
    private String name;

    @Column
    @Pattern(regexp = "^^[A-ZА-Я]{1}[a-zA-Zа-яА-Я]*((-)[a-zA-Zа-яА-Я])*$", message = "Некорректный формат фамилии: проверьте введённые данные")
    private String lastName;

    @Column
    @NotNull(message = "Некорректный формат возраста: возраст не указан")
    @Min(value = 0, message = "Некорректный формат возраста: возраст не может быть меньше 0")
    private byte age;
}