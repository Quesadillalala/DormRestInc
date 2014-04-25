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
public class Event {
    private Transmicivity transmicivity = Transmicivity.NONE;   

    /**
     * @return the transmicivity
     */
    public Transmicivity getTransmicivity() {
        return transmicivity;
    }

    /**
     * @param transmicivity the transmicivity to set
     */
    public void setTransmicivity(Transmicivity transmicivity) {
        this.transmicivity = transmicivity;
    }
}
