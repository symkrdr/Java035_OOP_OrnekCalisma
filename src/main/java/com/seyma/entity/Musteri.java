package com.seyma.entity;


import com.seyma.utility.State;

public class Musteri extends BaseEntity {

    private String isim_soyisim;
    private String telefon;
    private String email;
    private State state;




    public Musteri(String soyisim, String telefon, String email,State state) {
        this.isim_soyisim = soyisim;
        this.telefon = telefon;
        this.email = email;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "isim_soyisim='" + isim_soyisim + '\'' +
                ", telefon=" + telefon +
                ", email='" + email + '\'' +
                ", state=" + state +
                '}';
    }
}
