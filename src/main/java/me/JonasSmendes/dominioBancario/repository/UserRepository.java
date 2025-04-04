package me.JonasSmendes.dominioBancario.repository;

import me.JonasSmendes.dominioBancario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
