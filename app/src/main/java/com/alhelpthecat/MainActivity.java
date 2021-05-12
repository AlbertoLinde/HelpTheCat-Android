package com.alhelpthecat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fButton;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ONLY TEST
        tView = findViewById(R.id.textViewRecover);
        fButton = findViewById(R.id.buttonNextActivity);

        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goRecoverPass();
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goDetail();
            }
        });
    }

    // ONLY TEST
    private void goDetail(){
        startActivity(new Intent(this, ShowAnimals.class));
    }

    // ONLY TEST
    public void goRecoverPass(){
        startActivity(new Intent(this, RecoverActivity.class));
    }
}