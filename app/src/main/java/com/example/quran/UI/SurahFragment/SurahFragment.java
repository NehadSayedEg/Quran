package com.example.quran.UI.SurahFragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quran.Database.Data.SurahEntry;
import com.example.quran.Database.QuranViewModel;
import   com.example.quran.POJO.Surah;


import com.example.quran.R;

import java.util.ArrayList;
import java.util.List;

public class SurahFragment extends Fragment {
    private RecyclerView surahRecyclerView;
    private List<Surah> surahList;
    private List<SurahEntry> surahEntries;
    Context context ;

    SurahViewModel surahViewModel ;
    QuranViewModel quranViewModel;
    View view;

    public SurahFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.surah_fragement, container, false);
        //final RecyclerView
                surahRecyclerView = view.findViewById(R.id.surahRecyclerView);
        quranViewModel = ViewModelProviders.of(this).get(QuranViewModel.class);
        surahViewModel.loadQuran();
        quranViewModel.getAllSurahs().observe(this, new Observer<List<SurahEntry>>() {
            @Override
            public void onChanged(List<SurahEntry> surahEntries) {
                Log.d("From Surah Fragment ", "onChanged: Surahs List "
                        + surahEntries.get(2).getAyahs().toString());

                SurahAdapter surahAdapter = new SurahAdapter(getContext() , (ArrayList<SurahEntry>)surahEntries);
                surahRecyclerView.setLayoutManager(new LinearLayoutManager(context));
             surahRecyclerView.setAdapter(surahAdapter);

            }
        });


       // surahViewModel = ViewModelProviders.of(this).get(SurahViewModel.class);
       // surahViewModel.loadQuran();
//        surahViewModel.getSurahLiveData().observe(this, new Observer<List<Surah>>() {
//
//            @Override
//            public void onChanged(List<Surah> surahs) {
//                Log.d("From Surah Fragment ", "onChanged: Surahs List "
//                        + surahs.get(0).getAyahs().toString());


//                SurahAdapter surahAdapter = new SurahAdapter(getActivity(), (ArrayList<Surah>) surahs);
//                surahRecyclerView.setLayoutManager(new LinearLayoutManager(context));
//                surahRecyclerView.setAdapter(surahAdapter);

//            }
//        });




        return view; }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }





    }




