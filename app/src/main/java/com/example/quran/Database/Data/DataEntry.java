package com.example.quran.Database.Data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName ="data")
public class DataEntry {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name ="code")
    private int code;

    @NonNull
    @ColumnInfo(name ="status")
    private String status;

    @NonNull
    @Embedded
  //  @ColumnInfo(name ="quran")
    private QuranEntry quran;




    public DataEntry(int code, String status, QuranEntry quran) {
        this.code = code;
        this.status = status;
        this.quran = quran;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuranEntry getQuran() {
        return quran;
    }

    public void setQuran(QuranEntry quran) {
        this.quran = quran;
    }
}
