package com.alhelpthecat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alhelpthecat.model.Animal;
import com.bumptech.glide.Glide;
import com.google.firebase.database.annotations.NotNull;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    static ArrayList<Animal> animalList;
    Context context;
    public AnimalSelected animalSelected;


    public AnimalAdapter(ArrayList<Animal> animalList, AnimalSelected animalSelected) {
        this.animalList = animalList;
        this.animalSelected = animalSelected;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_item, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.name.setText(animal.getNombre());
        holder.veterinary.setText(animal.getVeterinario());
        holder.pendingAmount.setText(animal.getCantidadPendiente());
        Glide.with(holder.animalImage.getContext())
                .load(animal.getUrlImage())
                .into(holder.animalImage);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {

        ImageView animalImage;
        TextView name, veterinary, pendingAmount, totalAnimal;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            veterinary = itemView.findViewById(R.id.veterinario);
            pendingAmount = itemView.findViewById(R.id.cantidad);
            animalImage = itemView.findViewById(R.id.elementImage);
            totalAnimal = itemView.findViewById(R.id.totalAnimals);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalSelected.selectedAnimal(animalList.get(getAdapterPosition()));
                }
            });

        }
    }

    public interface AnimalSelected {
        void selectedAnimal(Animal animal);
    }
}



