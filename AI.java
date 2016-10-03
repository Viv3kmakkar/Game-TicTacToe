/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2016/10/1
 */

import java.util.*;
public class AI {

    public int pickSpot(TicTacTo game) {
    	
    	ArrayList<Integer> choices = new ArrayList<Integer>();
    	
    	for(int i=0;i<9;i++)
    	{
    		if(game.board[i]=='-')
    		{
    			choices.add(i+1);
    		}
    	}
    	Random rand= new Random();
    	int choice= choices.get(Math.abs(rand.nextInt() % choices.size()));
    	return choice;
    }
    
    
}