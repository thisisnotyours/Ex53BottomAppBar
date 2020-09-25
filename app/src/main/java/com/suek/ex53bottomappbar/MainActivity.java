package com.suek.ex53bottomappbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bab;

    boolean isCenter= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1) Bottom AppBar-> toolbar 처럼 사용하기
        bab= findViewById(R.id.bab);
        setSupportActionBar(bab);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void clickFab(View view) {
        isCenter=!isCenter;

        if(isCenter) bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
        else bab.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
    }
}
