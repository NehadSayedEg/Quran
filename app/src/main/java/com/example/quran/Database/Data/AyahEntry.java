package com.example.quran.Database.Data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName ="ayah_table")

public class AyahEntry {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name ="number")
    private int number;


    @NonNull
    @ColumnInfo(name ="audio")
    private String audio;


    @NonNull
    @ColumnInfo(name ="audioSecondary")
    private List<String> audioSecondary ;


    @NonNull
    @ColumnInfo(name ="text")
    private String text;

    @NonNull
    @ColumnInfo(name ="numberInSurah")
    private int numberInSurah;


    @NonNull
    @ColumnInfo(name ="juz")
    private int juz;

    @NonNull
    @ColumnInfo(name ="manzil")
    private int manzil;


    @NonNull
    @ColumnInfo(name ="page")
    private int page;


    @NonNull
    @ColumnInfo(name ="ruku")
    private int ruku;

    @NonNull
    @ColumnInfo(name ="hizbQuarter")
    private int hizbQuarter;

    @NonNull
    @ColumnInfo(name ="sajda")
    private Object  sajda;

    @Ignore

    public AyahEntry(int number, @NonNull String audio, @NonNull List<String> audioSecondary,
                     @NonNull String text, int numberInSurah, int juz, int manzil, int page,
                     int ruku, int hizbQuarter, @NonNull Object sajda) {
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

    @NonNull
    public String getAudio() {
        return audio;
    }

    public void setAudio(@NonNull String audio) {
        this.audio = audio;
    }

    @NonNull
    public List<String> getAudioSecondary() {
        return audioSecondary;
    }

    public void setAudioSecondary(@NonNull List<String> audioSecondary) {
        this.audioSecondary = audioSecondary;
    }

    @NonNull
    public String getText() {
        return text;
    }

    public void setText(@NonNull String text) {
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

    @NonNull
    public Object getSajda() {
        return sajda;
    }

    public void setSajda(@NonNull Object sajda) {
        this.sajda = sajda;
    }
}
