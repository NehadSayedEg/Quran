package com.example.quran.UI.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.quran.R;
import com.example.quran.UI.AudioFragment.AudioFragment;
import com.example.quran.UI.QuranFragment.QuranFragment;
import com.example.quran.UI.SurahFragment.SurahFragment;
import com.example.quran.UI.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout ;
    private ViewPager viewPager ;

    private ViewPagerAdapter viewPagerAdapter;

    private int[] tabIcons = {
            R.drawable.ic_format_list_bulleted_black_24dp,
            R.drawable.ic_library_books_black_24dp,
            R.drawable.ic_audiotrack_black_24dp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewPager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //tabLayout.setTabTextColors(Color.parseColor("#ffffff"), Color.parseColor("#ffffff"));


        //Add Fragments
        viewPagerAdapter.addFragment(new SurahFragment() ,"سور");
        viewPagerAdapter.addFragment(new QuranFragment() , "قران ");
        viewPagerAdapter.addFragment(new AudioFragment() ,"صوتى");



        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }


}
