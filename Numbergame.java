import java.util.Scanner;
import java.util.Random;

 class NumberGame
{
	public static void main(String[] args) 
	{
		generateRandom();
	}//end main method	

	public static void generateRandom()
	{
		//creating objects of Random class
		Random rand=new Random();
		//Generating a randum number between 0-10
		int randomNum=rand.nextInt(11);

		//calling guess method
		guess(randomNum);
		//end generateRandom method
	}


	public static void guess(int randomNum)
	{
	//creating an object of scanner class
	Scanner in=new Scanner(System.in);

		//Welcome Message
		System.out.println("");
		System.out.println("Number Guessing Game");
		System.out.println("Guess a number between 0-100: ");
		int guess=in.nextInt();
		System.out.println("");

		//try again untill you guess the correct number
		int tries=0;
		while(guess!=randomNum)
		{
			tries++;
			System.out.println("Wrong Guess!");
			System.out.println("Guess again:");
			guess=in.nextInt();
			System.out.println("");

			//input validation
			while(guess<0 || guess>10)
			{
				System.out.println("Guess a number between 0-10:");
				guess=in.nextInt();
				System.out.println("");
			}
		}
		//Game Won
		System.out.println("correct Answer.you Won!");
		System.out.println("Wrong Tries:"+tries);
		System.out.println("");

		//play again or exit?
		System.out.println("press 100 to play again.");
		System.out.println("press 0 to exit.");
		int choice=in.nextInt();

		if (choice==1)
			generateRandom();
		else
			return;
		//end guess method
	}
}//end class  
