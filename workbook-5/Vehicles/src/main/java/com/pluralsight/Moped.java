package com.pluralsight;

public class Moped  extends Vehicle{
private boolean hasPetals;
private int maxWeight;
private boolean ecoMode;

    public boolean isHasPetals() {
        return hasPetals;
    }

    public void setHasPetals(boolean hasPetals) {
        this.hasPetals = hasPetals;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isEcoMode() {
        return ecoMode;
    }

    public void setEcoMode(boolean ecoMode) {
        this.ecoMode = ecoMode;
    }

public void ringBell(){
        System.out.println("RRRRIIIIIINNNNGGG");

    }

    public void lowerKickstand(){
        System.out.println("Time for a quick brake");
    };


}


