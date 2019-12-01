package com.example.quran.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Quran {

    @SerializedName("surahs")
    @Expose
    private List<Surah> surahs = null;
    @SerializedName("edition")
    @Expose
    private Edition edition;


    public Quran() {
    }


    public Quran(List<Surah> surahs, Edition edition) {
        super();
        this.surahs = surahs;
        this.edition = edition;
    }

    public List<Surah> getSurahs() {
        return surahs;
    }

    public void setSurahs(List<Surah> surahs) {
        this.surahs = surahs;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }
}
