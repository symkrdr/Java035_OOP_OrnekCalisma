package com.seyma.entity;

import java.util.UUID;

public class Firma extends BaseEntity{
    public String adres;
    public int telefon;

    public Firma(String adres, int telefon) {
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "adres='" + adres + '\'' +
                ", telefon=" + telefon +
                '}';
    }
}
