package com.example.hifz;



public class Students {
    private int id;
   // private int imageID;
    private String name;
    private String sabaq;
    private String sabaqi;
    private String manzil;

    public Students(int id, String name, String sabaq, String sabaqi, String manzil) {
        this.id = id;
        this.name = name;
        this.sabaq = sabaq;
        this.sabaqi = sabaqi;
        this.manzil = manzil;
    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
        this.sabaq = "sabaq";
        this.sabaqi = "sabaqi";
        this.manzil = "manzil";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSabaq() {
        return sabaq;
    }

    public void setSabaq(String sabaq) {
        this.sabaq = sabaq;
    }

    public String getSabaqi() {
        return sabaqi;
    }

    public void setSabaqi(String sabaqi) {
        this.sabaqi = sabaqi;
    }

    public String getManzil() {
        return manzil;
    }

    public void setManzil(String manzil) {
        this.manzil = manzil;
    }
}




