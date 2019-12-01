package com.example.quran.Database.Data;



import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;
@Entity(tableName ="quran_table")

public class QuranEntry {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="number")

    private int number ;

    @NonNull
       @Embedded
   //    @ColumnInfo(name ="surahs")
    private List<SurahEntry> surahs ;

    @NonNull
    @Embedded
   // @ColumnInfo(name ="edition")
    private EditionEntry edition;


    public QuranEntry(int number, @NonNull List<SurahEntry> surahs, @NonNull EditionEntry edition) {
        this.number = number;
        this.surahs = surahs;
        this.edition = edition;
    }

    public List<SurahEntry> getSurahs() {
        return surahs;
    }

    public void setSurahs(List<SurahEntry> surahs) {
        this.surahs = surahs;
    }

    public EditionEntry getEdition() {
        return edition;
    }

    public void setEdition(EditionEntry edition) {
        this.edition = edition;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

