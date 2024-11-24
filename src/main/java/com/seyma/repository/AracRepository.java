package com.seyma.repository;

import com.seyma.entity.Arac;

import java.util.UUID;

public class AracRepository implements Repository<Arac> {

    public void save(Arac entity) {
        System.out.println("Kaydedildi.");

    }

    public void delete(Arac entity) {

    }

    public void update(Arac entity) {

    }

    public Arac[] findAll() {
        return new Arac[0];
    }

    public Arac findById(UUID id) {
        return null;
    }

    public boolean existsById(UUID id) {
        return false;
    }

    public int count() {
        return 0;
    }
}
