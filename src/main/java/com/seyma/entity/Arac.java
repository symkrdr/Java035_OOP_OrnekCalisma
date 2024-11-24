package com.seyma.entity;

import com.seyma.utility.AracState;
import com.seyma.utility.State;



public class Arac extends BaseEntity {
    private String aracPlaka;
    private int yas;
    private String renk;
    private Marka marka;
    private Model model;

    private AracState aracstate;
    private State state;


    public Arac(String aracPlaka, int yas, String renk, AracState aracstate, State state, Model model, Marka marka) {
        this.aracPlaka = aracPlaka;
        this.yas = yas;
        this.renk = renk;
        this.aracstate = aracstate;
        this.state = state;
        this.model = model;
        this.marka = marka;
    }






    public String getAracPlaka() {
        return aracPlaka;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public AracState getAracstate() {
        return aracstate;
    }

    public void setAracstate(AracState aracstate) {
        this.aracstate = aracstate;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String toString() {
        return "Arac{" +
                "aracPlaka='" + aracPlaka + '\'' +
                ", yas=" + yas +
                ", renk='" + renk + '\'' +
                ", marka=" + marka +
                ", model=" + model +
                ", aracstate=" + aracstate +
                ", state=" + state +
                '}';
    }
}
