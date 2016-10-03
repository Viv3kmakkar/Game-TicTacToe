	
 import java.util.*;
 import java.io.*;
public class TicTacToe {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	Scanner sc= new Scanner(System.in);
    	
    	boolean doYouWantToPlay= true;
    	
    	while(doYouWantToPlay)
    	{
    		System.out.println("Choose your marker");
    		System.out.println();
    		System.out.println(" Enter the character ");
    		char playerToken= sc.next().charAt(0);
    		System.out.println("oppnent char");
    		char opponentToken= sc.next().charAt(0);
    		
    		TicTacTo game= new TicTacTo(playerToken, opponentToken);
    		
    		AI ai= new AI();
    		System.out.println();
    		System.out.println("Now game khelo");
    		TicTacTo.printIndexBoard();
    		System.out.println();
    		
    		while(game.gameOver().equals("notOver")) {
    			if(game.currentMarker==game.userMarker)
    			{
    				System.out.print("its your turn enter a spot dude");
    				int spot= sc.nextInt();
    				
    				while(!game.playTurn(spot))
    				{
    					System.out.println("try again invalid");
    					spot=sc.nextInt();
    				}
    				System.out.print(" you picked " +spot);
    			}else
    			{
    				System.out.print("comp turn");
    				
    				int aiSpot= ai.pickSpot(game);
    				game.playTurn(aiSpot);
    				System.out.println(" compuer picked "+aiSpot);
    			}
    			
    			System.out.println();
    			game.printBoard();
    		}
    		System.out.println(game.gameOver());
    		System.out.println();
    		
    		System.out.println(" do u wanna play again enter y");
    		 char response=sc.next().charAt(0);
    		 
    		 doYouWantToPlay=(response=='Y');
    		 System.out.println();
    		 System.out.println();
    	}
    }
}
