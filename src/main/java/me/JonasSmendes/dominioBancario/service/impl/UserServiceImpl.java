package me.JonasSmendes.dominioBancario.service.impl;

import me.JonasSmendes.dominioBancario.model.User;
import me.JonasSmendes.dominioBancario.repository.UserRepository;
import me.JonasSmendes.dominioBancario.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private  final UserRepository userRepository;

    public UserServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate) throws IllegalAccessException {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalAccessException("this user Id already exists");
        }
        return userRepository.save(userToCreate);
    }
}
