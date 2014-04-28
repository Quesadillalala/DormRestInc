/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dormrestinc;

/**
 *
 * @author Wyatt
 */
public enum Infectivity {
    NONE (0.0), VERY_LOW(10.0), LOW(15.0), MEDIUM(20.0), HIGH(25.0), VERY_HIGH(35.0);
    
    Infectivity (double value) {
        this.value = value;
}
    
    private double value = 0.0;
    
    public double getValue()  {
        return value;
    }
}

    