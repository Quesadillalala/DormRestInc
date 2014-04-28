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
public enum Population {
    NONE (0), VERY_LOW(25), LOW(50), MEDIUM(75), HIGH(125), VERY_HIGH(250), WHOLE_SCHOOL(450);
    
    Population (int value) {
        this.value = value;
}
    
    private double value = 0.0;
    
    public double getValue()  {
        return value;
    }
}
    

