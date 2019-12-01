package com.example.quran.UI.SurahFragment;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.quran.Database.Data.AyahEntry;
import com.example.quran.Database.Data.SurahEntry;
import com.example.quran.Database.QuranViewModel;
import com.example.quran.Network.Client;
import com.example.quran.POJO.Ayah;
import com.example.quran.POJO.QuranData;
import   com.example.quran.POJO.Surah;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SurahViewModel extends ViewModel {
    QuranViewModel quranViewModel;

    MutableLiveData<List<Surah>> surahMutableLiveData = new MutableLiveData<>();



    public void loadQuran(){
        Client.getInstance().getSurah().enqueue(new Callback<QuranData>() {
            @Override
            public void onResponse(Call<QuranData> call, Response<QuranData> response) {
                List<Surah>  surah = response.body().getData().getSurahs();
                Log.v("Response !!!!!!", "BODY"+ response.body().getData().getSurahs().get(3).getName());

                Log.v("Response !!!!!!", "BODY"+ surah.get(1).getRevelationType());
                for (int i = 0; i < surah.size(); i++) {

                    String name = surah.get(i).getName();
                    String englishName = surah.get(i).getEnglishName();
                    String type = surah.get(i).getRevelationType();
                    int number = surah.get(i).getNumber();
                    // List<AyahEntry> ayah = surah.get(i).getAyahs();


                    SurahEntry surahList = new SurahEntry(name, englishName, type, number);
                    quranViewModel.insert(surahList);
                }

                //   surahMutableLiveData.setValue(surah);

            }

            @Override
            public void onFailure(Call<QuranData> call, Throwable t) {
                Log.e(" ERROR" ,t.getMessage());

            }
        });
    }



    public LiveData<List<Surah>> getSurahLiveData(){
        return surahMutableLiveData;

    }
}
