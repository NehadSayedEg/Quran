package com.example.quran.Network;

import com.example.quran.POJO.QuranData;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    //http://api.alquran.cloud/v1/quran/ar.alafasy
    private static final String Base_URL ="http://api.alquran.cloud/v1/";

    private QuranInterface quranInterface ;

    public static  Client instance ;

    public Client() {



        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.MINUTES)
                .writeTimeout(10, TimeUnit.MINUTES)
                .readTimeout(10, TimeUnit.MINUTES)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create())
                .client(client).build();

        quranInterface = retrofit.create(QuranInterface.class);

    }

    public static Client getInstance() {
        if (null == instance){
            instance =  new Client() ;
        }
        return instance;
    }

    public Call<QuranData> getSurah(){
        return quranInterface.getQuran();

    }
    HttpLoggingInterceptor loggingInterceptor(){
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }
}
