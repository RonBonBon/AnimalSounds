package com.arichafamily.animalsounds;

/**
 * Created by hackeru on 29/05/2017.
 */

public class Animal {
    private int imageResID;
    private int soundReID;

    public Animal(int imageResID, int soundReID) {
        this.imageResID = imageResID;
        this.soundReID = soundReID;
    }

    public int getImageResID() {
        return imageResID;
    }

    public int getSoundReID() {
        return soundReID;
    }
}
