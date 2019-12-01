package com.example.quran.Database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.quran.Database.Data.AyahEntry;
import com.example.quran.Database.Data.DataEntry;
import com.example.quran.Database.Data.EditionEntry;
import com.example.quran.Database.Data.QuranEntry;
import com.example.quran.Database.Data.SurahEntry;

import java.nio.file.OpenOption;

@Database(entities = {DataEntry.class, QuranEntry.class , SurahEntry.class , AyahEntry.class ,
        EditionEntry.class} , version = 1)
public abstract class QuranRoomDatabase extends RoomDatabase {


    public abstract QuranDao quranDao();

    private static volatile QuranRoomDatabase quranRoomInstance ;

    static QuranRoomDatabase getDatabase(final Context context){
        if(quranRoomInstance == null){
            synchronized (QuranRoomDatabase.class){
                if(quranRoomInstance == null){
                    quranRoomInstance = Room.databaseBuilder(context.getApplicationContext(),
                            QuranRoomDatabase.class , "quran_database")
                            .fallbackToDestructiveMigration().addCallback(sRoomDatabaseCallback).build();


                }
            }
        }
        return quranRoomInstance ;

    }
    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){

        @Override
        public void onOpen (@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
        }
    };
}
