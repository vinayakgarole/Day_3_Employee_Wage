package com.bridgelabz;

public class EmployeeWage {

    static final int FullTIME = 1;
    static final int PartTime = 2;

    /*
     * Creating calculate wage method
     */
    static void calculateWage(String company, int wagePerHour, int dayPerMonth, int workHourPerMonth) {

        int empHrs;
        int totalHours = 0;
        int dailyWage;
        int day = 0;
        int totalWage = 0;

        while ((totalHours < workHourPerMonth) && (day < dayPerMonth)) {
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
            dailyWage = wagePerHour * empHrs;
            totalWage = totalWage + dailyWage;
            day++;
            System.out.println("Day " + day + " Emp work hour " + empHrs + " wage is " + dailyWage);
        }
        System.out.println("Total work hours is: " + totalHours);
        System.out.println("Total work days are: " + day);
        System.out.println("Total wage of company " + company + " is " + totalWage);
    }

    public static void main(String[] args) {

        calculateWage("Tata", 10, 20, 100);
        System.out.println("--------------------------------");
        calculateWage("Reliance", 20, 22, 90);
        System.out.println("--------------------------------");
        calculateWage("Mahindra", 15, 24, 95);
    }
}