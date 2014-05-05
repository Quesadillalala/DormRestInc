/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dormrestinc;

import environment.ApplicationStarter;
<<<<<<< HEAD
import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
=======
import static java.awt.SystemColor.window;
>>>>>>> FETCH_HEAD

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
        Image background = ResourceTools.loadImageFromResource("resources/brentwood map.png");
        ApplicationStarter.run(new String[0], "Dorm Rest", new Dimension(1100, background.getHeight(null)), new DormRestEnvironment());
    }
  
}
