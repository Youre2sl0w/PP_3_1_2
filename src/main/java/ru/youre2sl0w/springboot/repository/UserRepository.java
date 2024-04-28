package ru.youre2sl0w.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.youre2sl0w.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}