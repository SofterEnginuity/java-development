package com.pluralsight;

import java.time.LocalDate;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend ) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equalsIgnoreCase("king")){
            this.price = 139.00;
        }else if( roomType.equalsIgnoreCase("double")){
            this.price = 109.99;
        }

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        String day = "";



        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {

        if (!isWeekend) {
            return price * numberOfNights;
        } else{
            return price *= 1.1;
        }
    }
}
