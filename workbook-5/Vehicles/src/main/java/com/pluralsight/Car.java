package com.pluralsight;

public class Car extends Vehicle {
    private boolean hasSportMode;
    private boolean allWheelDrive;

    public boolean isHasSportMode() {
        return hasSportMode;
    }

    public void setHasSportMode(boolean hasSportMode) {
        this.hasSportMode = hasSportMode;
    }

    public boolean isAllWheelDrive() {
        return allWheelDrive;
    }

    public void setAllWheelDrive(boolean allWheelDrive) {
        this.allWheelDrive = allWheelDrive;
    }

   public void openTrunk(){
       System.out.println("Popping the trunk");
   };
    public void closeTrunk(){
        System.out.println("Closing the trunk");
    };

}
