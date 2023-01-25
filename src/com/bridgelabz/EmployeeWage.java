package com.bridgelabz;

public class EmployeeWage {

    static final int FullTIME = 1;
    static final int PartTime = 2;
    static final int WagePerHour = 20;
    static final int WorkingDayPerMonth = 20;
    static final int TotalWorkHours = 100;

    /*
     * Creating calculate wage method
     */
    static void calculateWage() {

        int empHrs;
        int totalHours = 0;
        int dailyWage;
        int day = 0;
        int totalWage = 0;

        while ((totalHours < TotalWorkHours) && (day < WorkingDayPerMonth)) {
            int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

            switch (attendance) {
                case FullTIME:
                    empHrs = 8;
                    break;
                case PartTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalHours = totalHours + empHrs;
            dailyWage = WagePerHour * empHrs;
            totalWage = totalWage + dailyWage;
            day++;
            System.out.println("Day " + day + " Emp work hour " + empHrs + " wage is " + dailyWage);
        }
        System.out.println("Total work hours is: " + totalHours);
        System.out.println("Total work days are: " + day);
        System.out.println("Total wage is: " + totalWage);
    }

    public static void main(String[] args) {

        calculateWage();
    }
}