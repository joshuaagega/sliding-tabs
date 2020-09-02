package com.gego.tabfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private TabItem tabBirds;
    private TabItem tabCats;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tadBar);
        tabBirds = findViewById(R.id.birds);
        tabCats = findViewById(R.id.cats);
        viewPager = findViewById(R.id.viewPager2);

        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
        tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        //On selected Tab listener

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}