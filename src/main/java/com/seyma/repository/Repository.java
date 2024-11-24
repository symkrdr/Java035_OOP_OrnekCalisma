package com.seyma.repository;

import java.util.List;
import java.util.UUID;

public interface Repository <T> {

    void save(T entity);
    void delete(T entity);
    void update(T entity);
    T[] findAll();
    T findById(UUID id);
    boolean existsById(UUID id);
    int count();





}
