package com.example.hifz;
import java.io.Serializable;


public class Students implements Serializable {
    private int id;
   // private int imageID;
    private String name;
    private String age;
    private String sclass;
    private String sabaq;
    private String sabaqi;
    private String manzil;

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }



    public Students(int id, String name,String age,String sclass, String sabaq, String sabaqi, String manzil) {
        this.id = id;
        this.name = name;
        this.sclass=sclass;
        this.age=age;

        this.sabaq = sabaq;
        this.sabaqi = sabaqi;
        this.manzil = manzil;
    }



    public Students( String name) {
        this.id=0;
        this.name = name;
        this.sabaq = "sabaq";
        this.sabaqi = "sabaqi";
        this.manzil = "manzil";
    }
    public Students(int id, String name) {
        this.id = id;
        this.name = name;
        this.sabaq = "sabaq";
        this.sabaqi = "sabaqi";
        this.manzil = "manzil";
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Students(String name, String age, String sclass) {
        this.age=age;
        this.sclass=sclass;
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




