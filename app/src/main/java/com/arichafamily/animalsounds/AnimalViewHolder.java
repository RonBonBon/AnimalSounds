package com.arichafamily.animalsounds;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class AnimalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView ivAnimal;
    public AnimalViewHolder(View v) {
        super(v);
        ivAnimal = (ImageView) v.findViewById(R.id.ivAnimal);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int position = getAdapterPosition();
    }
}
