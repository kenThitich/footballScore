/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpattern;

import java.util.EventObject;

/**
 *
 * @author TUFGAMING
 */
public class ScoreEvent extends EventObject{
    String score;
    public ScoreEvent(Object o,String score) {
        super(o);
        this.score=score;
    }
    
    public String getScore(){
        return score;
    }
}
