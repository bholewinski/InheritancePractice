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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private double weeklyComission;
    
    @Override
    public double getAnnualWages () {
        return this.weeklyComission * 52 + getAnnualSalary();
    }

    public double getWeeklyComission() {
        return weeklyComission;
    }

    public void setWeeklyComission(double weeklyComission) {
        this.weeklyComission = weeklyComission;
    }
    
    
}
