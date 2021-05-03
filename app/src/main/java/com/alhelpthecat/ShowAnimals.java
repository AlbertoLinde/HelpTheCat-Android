package com.alhelpthecat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.alhelpthecat.model.Animal;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ShowAnimals extends AppCompatActivity {

    private final String ANIMALS = "animales";
    private ArrayList<Animal> animalList;

    private RecyclerView rView;
    private AnimalAdapter animalAdapter;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child(ANIMALS);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_animals);

        rView = findViewById(R.id.recyclerView);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new LinearLayoutManager(this));

        animalList = new ArrayList<>();
        animalAdapter = new AnimalAdapter(animalList, this);

        rView.setAdapter(animalAdapter);

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                animalList.clear();

                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    Animal animal = snapshot.getValue(Animal.class);
                    animalList.add(animal);
                }
                animalAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}