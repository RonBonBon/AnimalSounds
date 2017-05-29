package com.arichafamily.animalsounds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by hackeru on 29/05/2017.
 */

public class AnimalRecyclerAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    List<Animal> animals;
    private LayoutInflater inflater;
    private Context context;

    public AnimalRecyclerAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        animals = AnimalDataSource.getAnimals();
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.animal_item, parent, false);
        AnimalViewHolder vh = new AnimalViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.ivAnimal.setImageResource(animal.getImageResID());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
