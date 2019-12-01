package com.example.quran.UI.AudioFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quran.R;

public class AudioFragment extends Fragment {

    View view;

    public AudioFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.audio_fragment, container ,false);

        return view;
    }
}
