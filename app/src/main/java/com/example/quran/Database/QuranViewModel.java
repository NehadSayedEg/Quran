package com.example.quran.Database;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.quran.Database.Data.DataEntry;
import com.example.quran.Database.Data.QuranEntry;
import com.example.quran.Database.Data.SurahEntry;

import java.util.List;

public class QuranViewModel extends AndroidViewModel {

    private  String TAG = this.getClass().getSimpleName();
    private QuranDao quranDao ;
    private QuranRoomDatabase quranRoomDatabase ;
    private LiveData<List<SurahEntry>>allSurahs;


    public QuranViewModel(@NonNull Application application) {
        super(application);

        quranRoomDatabase = QuranRoomDatabase.getDatabase(application);
        quranDao = quranRoomDatabase.quranDao();
        allSurahs = quranRoomDatabase.quranDao().getAllSurahs();
    }


    public  LiveData<List<SurahEntry>>getAllSurahs(){return allSurahs;}


    public void  insert(SurahEntry surahEntry){
        new InsertAsyncTask(quranDao).execute(surahEntry);
    }



    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG , "ViewModel Destroyed ");
    }

    private class InsertAsyncTask extends AsyncTask<SurahEntry ,Void ,Void>{
        QuranDao quranDao ;

        public InsertAsyncTask(QuranDao quranDao) {
            this.quranDao = quranDao;
        }

        @Override
        protected Void doInBackground(SurahEntry... surahEntries) {
            quranDao.insert(surahEntries[0]);
            return null;
        }
    }
}
