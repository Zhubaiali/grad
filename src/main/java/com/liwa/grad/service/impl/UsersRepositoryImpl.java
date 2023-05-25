package com.liwa.grad.service.impl;

import com.liwa.grad.model.Users;
import com.liwa.grad.service.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersRepositoryImpl implements UsersRepository {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public <S extends Users> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Users> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Users> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    public Iterable<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Iterable<Users> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Users entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Users> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Page<Users> searchSimilar(Users entity, String[] fields, Pageable pageable) {
        return null;
    }

    @Override
    public Iterable<Users> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Users> findAll(Pageable pageable) {
        return null;
    }
}
