package com.seyma.repository;

import com.seyma.entity.Kiralama;

import java.util.UUID;

public class KiralamaRepository implements Repository<Kiralama> {


    public void save(Kiralama entity) {

    }

    public void delete(Kiralama entity) {

    }

    public void update(Kiralama entity) {

    }

    public Kiralama[] findAll() {
        return new Kiralama[0];
    }

    public Kiralama findById(UUID id) {
        return null;
    }

    public boolean existsById(UUID id) {
        return false;
    }

    public int count() {
        return 0;
    }
}
