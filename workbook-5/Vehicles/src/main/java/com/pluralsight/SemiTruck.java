package com.pluralsight;

public class SemiTruck extends Vehicle{

    private boolean sleeperCab;
    int numOfAxles;

    public boolean isSleeperCab() {
        return sleeperCab;
    }

    public void setSleeperCab(boolean sleeperCab) {
        this.sleeperCab = sleeperCab;
    }

    public int getNumOfAxles() {
        return numOfAxles;
    }

    public void setNumOfAxles(int numOfAxles) {
        this.numOfAxles = numOfAxles;
    }

   public void honk(){
       System.out.println("Woooooonnnkkk Woooonnnnkkkk");
   }

}
