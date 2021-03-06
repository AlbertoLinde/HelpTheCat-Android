package com.alhelpthecat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.alhelpthecat.model.Animal;
import com.bumptech.glide.Glide;

public class ActivityDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView description, tViewDonations;
        ImageView iView;

        Intent intent = getIntent();

        if (intent.getExtras() != null){
            Animal animal = (Animal) getIntent().getSerializableExtra("animal");
            description = findViewById(R.id.description);
            iView = findViewById(R.id.imageView);
            tViewDonations = findViewById(R.id.textAmount);
            description.setText(animal.getDescripcion());
            tViewDonations.setText(animal.getCantidadRecaudada().concat(" €"));
                Glide.with(this)
                        .load(R.drawable.noimage)
                        .into(iView);
        }
    }
}