package com.seyma.entity;

import java.util.UUID;

public class Marka extends BaseEntity {
    private String ad;


    public Marka(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
