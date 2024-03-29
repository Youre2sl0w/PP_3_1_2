package web.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "users")
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

    public User() {
    }

    public User(String name, String lastName, byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}