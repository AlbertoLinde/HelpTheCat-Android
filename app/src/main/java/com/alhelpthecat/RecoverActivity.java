package com.alhelpthecat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alhelpthecat.R;
import com.alhelpthecat.ShowAnimals;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecoverActivity extends AppCompatActivity {

    FloatingActionButton fButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover);

        fButton = findViewById(R.id.buttonNextActivity);
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testGoMainActity();
            }
        });

    }
    // ONLY FOR TEST
    private void testGoMainActity(){
        startActivity(new Intent(this, MainActivity.class));
    }
}