/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Gumby
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyRate;
    private double hoursPerWeek;
    private double overtimeHoursPerWeek;
    private static final double Overtime_Multiplier = 1.5;
    
    @Override
    public double getAnnualWages () {
        return this.hourlyRate * this.hoursPerWeek +
                this.hourlyRate * this.overtimeHoursPerWeek * Overtime_Multiplier;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getOvertimeHoursPerWeek() {
        return overtimeHoursPerWeek;
    }

    public void setOvertimeHoursPerWeek(double overtimeHoursPerWeek) {
        this.overtimeHoursPerWeek = overtimeHoursPerWeek;
    }
    
    
}
