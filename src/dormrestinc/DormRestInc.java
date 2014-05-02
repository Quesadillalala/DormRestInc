/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dormrestinc;

import environment.ApplicationStarter;
import static java.awt.SystemColor.window;

/**
 *
 * @author Wyatt
 */
public class DormRestInc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
//        createPeople();
      
        // TODO code application logic here
    }
    
    private static void start() {
        ApplicationStarter.run("Dorm Rest", new DormRestEnvironment());
    }
  
}
