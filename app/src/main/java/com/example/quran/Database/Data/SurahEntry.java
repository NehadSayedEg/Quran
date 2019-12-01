package com.example.quran.Database.Data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName ="surah_table")

public class SurahEntry {




    @NonNull
    @PrimaryKey
    @ColumnInfo(name ="number")
    private int number;


    @NonNull
    @ColumnInfo(name ="name")
    private String name;



    @NonNull
    @ColumnInfo(name ="englishName")
    private String englishName;




    @NonNull
    @ColumnInfo(name ="englishNameTranslation")
    private String englishNameTranslation;


    @NonNull
    @ColumnInfo(name ="revelationType")
    private String revelationType;


    @NonNull
  //  @ColumnInfo(name ="ayahs")
    @Embedded
    private List<AyahEntry> ayahs ;

    public SurahEntry(String name, String englishName, String type, int number){}

    public SurahEntry(int number, @NonNull String name, @NonNull String englishName,

                      @NonNull String englishNameTranslation, @NonNull String revelationType,
                      @NonNull List<AyahEntry> ayahs) {
        this.number = number;
        this.name = name;
        this.englishName = englishName;
        this.englishNameTranslation = englishNameTranslation;
        this.revelationType = revelationType;
        this.ayahs = ayahs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(@NonNull String englishName) {
        this.englishName = englishName;
    }

    @NonNull
    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public void setEnglishNameTranslation(@NonNull String englishNameTranslation) {
        this.englishNameTranslation = englishNameTranslation;
    }

    @NonNull
    public String getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(@NonNull String revelationType) {
        this.revelationType = revelationType;
    }

    @NonNull
    public List<AyahEntry> getAyahs() {
        return ayahs;
    }

    public void setAyahs(@NonNull List<AyahEntry> ayahs) {
        this.ayahs = ayahs;
    }
}
