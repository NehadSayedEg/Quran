package com.example.quran.Database.Data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName ="edition_table")

public class EditionEntry {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="edtionNumber")
    private int edtionNumber ;

    @NonNull
    @ColumnInfo(name ="identifier")
    private String identifier;

    @NonNull
    @ColumnInfo(name ="language")
    private String language;

    @NonNull
    @ColumnInfo(name ="name")
    private String name;


    @NonNull
    @ColumnInfo(name ="englishName")
    private String englishName;


    @NonNull
    @ColumnInfo(name ="format")
    private String format;

    @NonNull
    @ColumnInfo(name ="type")
    private String type;

    @NonNull
    public String getIdentifier() {
        return identifier;
    }


    public EditionEntry(int number, @NonNull String identifier, @NonNull String language,
                        @NonNull String name, @NonNull String englishName, @NonNull String format,
                        @NonNull String type) {
        this.edtionNumber = number;
        this.identifier = identifier;
        this.language = language;
        this.name = name;
        this.englishName = englishName;
        this.format = format;
        this.type = type;
    }

    public int getedtionNumber() {
        return edtionNumber;
    }

    public void setedtionNumber(int number) {
        this.edtionNumber = number;
    }

    public void setIdentifier(@NonNull String identifier) {
        this.identifier = identifier;
    }

    @NonNull
    public String getLanguage() {
        return language;
    }

    public void setLanguage(@NonNull String language) {
        this.language = language;
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
    public String getFormat() {
        return format;
    }

    public void setFormat(@NonNull String format) {
        this.format = format;
    }

    @NonNull
    public String getType() {
        return type;
    }

    public void setType(@NonNull String type) {
        this.type = type;
    }

    public int getEdtionNumber() {
        return edtionNumber;
    }

    public void setEdtionNumber(int edtionNumber) {
        this.edtionNumber = edtionNumber;
    }
}
