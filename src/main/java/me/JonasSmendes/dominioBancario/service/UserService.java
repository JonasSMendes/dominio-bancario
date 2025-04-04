package me.JonasSmendes.dominioBancario.service;

import me.JonasSmendes.dominioBancario.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate) throws IllegalAccessException;
}
