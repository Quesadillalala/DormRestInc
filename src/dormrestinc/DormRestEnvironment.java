/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dormrestinc;

import environment.Environment;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


        

/**
 *
 * @author Wyatt
 */
public class DormRestEnvironment extends Environment {

    @Override
    public void initializeEnvironment() {
        this.setBackground(Color.BLUE);
        this.setBackground(ResourceTools.loadImageFromResource("resources/brentwood map.png"));
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
    }
    
} 