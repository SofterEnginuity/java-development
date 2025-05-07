package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

//
//    public void PunchIn(double time){
//        startTime = time;
//    }
        public void PunchIn(){

           LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int min = now.getMinute();
           double time = hour + (min / 60);

            startTime = time;

    }

//    public void PunchOut(double time){
//        endTime = time;

//    }
    public void PunchOut(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();
        double time = hour + (min / 60);
        double duration = time - startTime;
        hourseWorked += duration;
        startTime = 0;
    }
    public void PunchTimeCard{

    }
public double getTotalPay{

    }
    public double getRegularHours{

    }
public double getOvertimeHours{

    }

}
