package com.murillo.oct25;

public class AndroidVersion {
    private int logo;
    private String name, rDate, ceo, industry,description;

    public AndroidVersion(int logo, String name, String rDate, String ceoName, String indName, String desc) {
        this.logo = logo;
        this.name = name;
        this.rDate = rDate;
        this.ceo = ceoName;
        this.industry = indName;
        this.description = desc;
    }

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getrDate() {
        return rDate;
    }

    public String getCeoName() {
        return ceo;
    }

    public String getIndName() {
        return industry;
    }

    public String getDescription() {
        return description;
    }
}

