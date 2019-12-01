package com.example.quran.Network;

import com.example.quran.POJO.QuranData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuranInterface {

    //  http://api.alquran.cloud/v1/quran/ar.alafasy
    @GET("quran/ar.alafasy")
    Call<QuranData> getQuran();



    //http://api.alquran.cloud/v1/quran/en.asad
}
