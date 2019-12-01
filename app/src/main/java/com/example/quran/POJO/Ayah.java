package com.example.quran.POJO;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Ayah{

    @SerializedName("number")
    @Expose
    private int number;
    @SerializedName("audio")
    @Expose
    private String audio;
    @SerializedName("audioSecondary")
    @Expose
    private List<String> audioSecondary = null;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("numberInSurah")
    @Expose
    private int numberInSurah;
    @SerializedName("juz")
    @Expose
    private int juz;
    @SerializedName("manzil")
    @Expose
    private int manzil;
    @SerializedName("page")
    @Expose
    private int page;
    @SerializedName("ruku")
    @Expose
    private int ruku;
    @SerializedName("hizbQuarter")
    @Expose
    private int hizbQuarter;
    @SerializedName("sajda")
    @Expose
    private Object  sajda;


    public Ayah() {
    }

    public Ayah(int number, String audio, List<String> audioSecondary, String text,
                int numberInSurah, int juz, int manzil, int page, int ruku, int hizbQuarter, Object sajda) {
        this.number = number;
        this.audio = audio;
        this.audioSecondary = audioSecondary;
        this.text = text;
        this.numberInSurah = numberInSurah;
        this.juz = juz;
        this.manzil = manzil;
        this.page = page;
        this.ruku = ruku;
        this.hizbQuarter = hizbQuarter;
        this.sajda = sajda;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public List<String> getAudioSecondary() {
        return audioSecondary;
    }

    public void setAudioSecondary(List<String> audioSecondary) {
        this.audioSecondary = audioSecondary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberInSurah() {
        return numberInSurah;
    }

    public void setNumberInSurah(int numberInSurah) {
        this.numberInSurah = numberInSurah;
    }

    public int getJuz() {
        return juz;
    }

    public void setJuz(int juz) {
        this.juz = juz;
    }

    public int getManzil() {
        return manzil;
    }

    public void setManzil(int manzil) {
        this.manzil = manzil;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRuku() {
        return ruku;
    }

    public void setRuku(int ruku) {
        this.ruku = ruku;
    }

    public int getHizbQuarter() {
        return hizbQuarter;
    }

    public void setHizbQuarter(int hizbQuarter) {
        this.hizbQuarter = hizbQuarter;
    }

    public Object getSajda() {
        return sajda;
    }

    public void setSajda(Object sajda) {
        this.sajda = sajda;
    }
}