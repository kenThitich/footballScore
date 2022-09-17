/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpattern;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author TUFGAMING
 */
public class ScoreSource {
    private ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
        
	public void setSource() {
            Scanner sc = new Scanner(System.in);
            String score;
            while(true){
                System.out.print("Enter Score ");
                String resultScore = sc.nextLine();
                if(resultScore.length()==0){
                    System.out.println("END SEND SCORE");
                    break;
                }
                else {
                    score=resultScore;
                    fireMyEvent(new ScoreEvent(this, score));
                }
            }
        }
       
	public void addScoreListener(ScoreListener l) {
		listeners.add(l);
	}
        
	public void removeScoreListener(ScoreListener l) {
		listeners.remove(l);
	}
        
	public void fireMyEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
                        l.scoreChange(e);
        }
    }
}
