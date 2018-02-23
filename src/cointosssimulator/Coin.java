/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointosssimulator;

import java.util.Random;
/**
 *
 * @author bluebackdev
 */
public class Coin {
    private static Random rand = new Random();
    
    private static String sideUp;
    
    public Coin() {
        sideUp = determineSide();
    }
    
    private static String determineSide() {
        switch(rand.nextInt(2)) {
            case 0:
                return "Heads";
            case 1:
                return "Tails";
            default:
                return "ERROR";
        }
    }
    
    public static String getSide() {
        return determineSide();
    }
}
