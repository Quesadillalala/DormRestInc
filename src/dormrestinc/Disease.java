
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
public class Disease {
    
    public Disease (Infectivity infectivity, Detectability detectability, Lethality lethality){
        this.infectivity = infectivity;
        this.detectability = detectability;
        this.lethality = lethality;
    }
    
    private Infectivity infectivity = Infectivity.NONE;
    private Lethality lethality = Lethality.NONE;
    private Detectability detectability = Detectability.NEVER;

    /**
     * @return the infectivity
     */
    public Infectivity getInfectivity() {
        return infectivity;
    }

    /**
     * @param infectivity the infectivity to set
     */
    public void setInfectivity(Infectivity infectivity) {
        this.infectivity = infectivity;
    }

    /**
     * @return the lethality
     */
    public Lethality getLethality() {
        return lethality;
    }

    /**
     * @param lethality the lethality to set
     */
    public void setLethality(Lethality lethality) {
        this.lethality = lethality;
    }

    /**
     * @return the detectability
     */
    public Detectability getDetectability() {
        return detectability;
    }

    /**
     * @param detectability the detectability to set
     */
    public void setDetectability(Detectability detectability) {
        this.detectability = detectability;
    }
    
}
