import java.util.Scanner;

//Create a new object of type Scanner that reads from the keyboard
//Create a new movie object
//Prompt the user to enter the title of a movie 
//Read in the line that the user types
//Set the title in the movie object
//Prompt the user to enter the movie’s rating
//Read in the line that the user types
//Set the rating in the movie object
//Prompt the user to enter the number of tickets sold at a (unnamed) theater
//Read in the integer that the user types
//Set the number of tickets sold in the movie object
//Print out the information using the movie’s toString method

public class MovieDriver {

	public static void main(String[] args) {
		
		//Create a new movie object
		String Movie;
		String Rating;
		int SoldTickets;
		Scanner input = new Scanner(System.in);
		
		//task2
		char ch='y';
		while(ch=='y'|| ch =='Y')
		{
			
		System.out.println("Enter the name of a movie ");
		Movie =input.nextLine();
		//Set the title in the movie object
		Movie a = new Movie();
		a.setTitle(Movie);
		
		System.out.println("Enter the rating of the movie");
		Rating = input.nextLine();
		a.setRating(Rating);
		
		System.out.println("Enter the number of tickets sold for this movie ");
		SoldTickets = input.nextInt();
		a.setSoldTickets(SoldTickets);
		
		//Print out the information using the movie’s toString method
		System.out.println(a.toString());
		System.out.println("Do you want to enter another? (y or n)");
		
		ch=input.next().charAt(0);
		input.nextLine();//for line feed
		}
		
		System.out.println("Goodbye");

	}

	
	
}
