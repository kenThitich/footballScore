/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpattern;

/**
 *
 * @author TUFGAMING
 */
public class FootBallObserverDesignPatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource ss = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        ss.addScoreListener(sub1);
        ss.addScoreListener(sub2);
        ss.setSource();
    }
    
}
