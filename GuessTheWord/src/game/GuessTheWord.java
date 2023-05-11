
package game;

import java.util.Scanner;

public class GuessTheWord {
	private boolean play=true;
	private Words randomWords=new Words();
	private Scanner scanner=new Scanner(System.in);
	private int rounds=10;
	private char lastround;
	public void start()
	{
		do{
			showWord();
			getInput();
			cheakInput();
		}while(play);
	}
	
	void showWord()
	{
		System.out.println(" you have "+rounds+" tries left");
		System.out.println(randomWords);
	}	
	
	void getInput()
	{
		System.out.println("enter a world to guess the word");
		String userGuess=scanner.nextLine();
	    lastround=userGuess.charAt(0);
	    
	}
	
	void cheakInput()
	{
		boolean isGuessRight =randomWords.guess(lastround);
		
		if(isGuessRight)
	     	{
		   if(  randomWords.isGuestedRight() )
	     	 {
			System.out.println("Congrates you guess right");
			System.out.println("the word is "+randomWords);
			play=false;
	    	}
	}
		else
			rounds--;
		if(rounds==0)
		{
			System.out.println("Soory game over!");
			play=false;
		}
	}
	public void end() {
	scanner.close();																																					
	}	
	
}
