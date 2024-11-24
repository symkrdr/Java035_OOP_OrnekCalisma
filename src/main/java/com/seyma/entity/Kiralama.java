package com.seyma.entity;

import com.seyma.utility.AracState;

public class Kiralama extends BaseEntity{
    private String kiralamaTarihi;
    private String teslimTarihi;
    private Musteri musteri;
    private AracState aracState;
    private Arac arac;
    private Firma firma;





    public Kiralama(String kiralamaTarihi, String teslimTarihi, Musteri musteri, AracState aracState , Firma firma) {
        this.kiralamaTarihi = kiralamaTarihi;
        this.teslimTarihi = teslimTarihi;
        this.musteri = musteri;
        this.aracState = aracState;
        this.arac = arac;
        this.firma = firma;

    }

    public String getKiralamaTarihi() {
        return kiralamaTarihi;
    }

    public void setKiralamaTarihi(String kiralamaTarihi) {
        this.kiralamaTarihi = kiralamaTarihi;
    }

    public String getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(String teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public AracState getAracState() {
        return aracState;
    }

    public void setAracState(AracState aracState) {
        this.aracState = aracState;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Kiralama{" +
                "kiralamaTarihi='" + kiralamaTarihi + '\'' +
                ", teslimTarihi='" + teslimTarihi + '\'' +
                ", musteri=" + musteri +
                ", aracState=" + aracState +
                ", arac=" + arac +
                ", firma=" + firma +
                '}';
    }
}
