package com.seyma.repository;

import com.seyma.entity.Musteri;

import java.util.UUID;

public class MusteriRepository implements Repository<Musteri> {

    public void save(Musteri entity) {
        System.out.println("Musteri saved");

    }

    public void delete(Musteri entity) {

    }

    public void update(Musteri entity) {
        System.out.println("Müşteri güncellendi");

    }

    public Musteri[] findAll() {
        return new Musteri[0];
    }

    public Musteri findById(UUID id) {
        return null;
    }

    public boolean existsById(UUID id) {
        return false;
    }

    public int count() {
        return 0;
    }
}
