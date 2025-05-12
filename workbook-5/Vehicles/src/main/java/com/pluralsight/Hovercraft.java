package com.pluralsight;

public class Hovercraft extends Vehicle{
private boolean hasLandMode;
private int numOfCoolFans;

    public boolean isHasLandMode() {
        return hasLandMode;
    }

    public void setHasLandMode(boolean hasLandMode) {
        this.hasLandMode = hasLandMode;
    }

    public int getNumOfCoolFans() {
        return numOfCoolFans;
    }

    public void setNumOfCoolFans(int numOfCoolFans) {
        this.numOfCoolFans = numOfCoolFans;
    }



   public void hover(){
       System.out.println("Taking off in..3...2...1...PSSssshhhhwWWAahsshsh");
    };

}
