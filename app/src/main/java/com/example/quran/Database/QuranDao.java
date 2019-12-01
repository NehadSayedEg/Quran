package com.example.quran.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.quran.Database.Data.SurahEntry;

import java.util.List;

@Dao
public interface QuranDao {
    @Query("SELECT * from surah_table")
    LiveData<List<SurahEntry>>getAllSurahs();

    @Insert
    void  insert(SurahEntry dataEntry);

}
