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
public class Locations {
    private Transmissivity transmissivity = Transmissivity.NONE;
    

    /**
     * @return the transmissivity
     */
    public Transmissivity getTransmissivity() {
        return transmissivity;
    }

    /**
     * @param transmicivity the transmicivity to set
     */
    public void setTransmissivity(Transmissivity transmissivity) {
        this.transmissivity = transmissivity;
    }
}
