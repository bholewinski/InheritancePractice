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
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    @Override
    public double getAnnualWages () {
        return this.weeklySalary * 52;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    
    
}
