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
    private Transmissivity transmicivity = Transmissivity.NONE;   

    /**
     * @return the transmissivity
     */
    public Transmissivity getTransmicivity() {
        return transmicivity;
    }

    /**
     * @param transmicivity the transmissivity to set
     */
    public void setTransmicivity(Transmissivity transmicivity) {
        this.transmicivity = transmicivity;
    }
}
