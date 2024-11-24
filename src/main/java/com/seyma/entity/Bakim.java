package com.seyma.entity;

import java.util.UUID;

public class Bakim extends BaseEntity{
    private String bakimTarih;
    private String bakimDetayi;
    private String bakimTeslimTarihi;


    private Arac arac;


    public Bakim(String tarih, Arac arac) {
        this.bakimTarih = bakimTarih;
        this.bakimDetayi= bakimDetayi;
        this.bakimTeslimTarihi = bakimTeslimTarihi;
        this.arac = arac;
    }


    @Override
    public String toString() {
        return "Bakim{" +
                "bakimTarih='" + bakimTarih + '\'' +
                ", bakimDetayi='" + bakimDetayi + '\'' +
                ", bakimTeslimTarihi='" + bakimTeslimTarihi + '\'' +
                ", arac=" + arac +
                '}';
    }
}
