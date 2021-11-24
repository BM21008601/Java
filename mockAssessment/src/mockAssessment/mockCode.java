package mockAssessment;
import java.util.Scanner;
public class mockCode 
{
	static Scanner kboard = new Scanner(System.in);
	
	public static String starting()
	{
		String prompt = "";
		System.out.println("Shall we begin? y/n" );
		prompt = kboard.next();
		return(prompt);
	} 
	
	public static int getOption()
	{	
		int newOption = 0;
		System.out.println("Please pick an option.");
		System.out.println("1 - Username Generation");
		System.out.println("2 - Square Identifier");
		System.out.println("3 - Quit");
		newOption = kboard.nextInt();
		return(newOption);
	} //end getOption
	
	public static String getForename()
	{	
		String newForename = "";
		System.out.println("Please enter your forename.");
		newForename = kboard.next();
		return(newForename);
	} //end getForename
	
	public static String getSurname()
	{	
		String newSurname = "";
		System.out.println("Please enter your surname.");
		newSurname = kboard.next();
		return(newSurname);
	} //end getSurname
	
	public static void displayDetails(String forename, String surname)
	{	
		char letter = 0;
		String capital = "";
		String username = "";
		letter = forename.charAt(0);
		capital = surname.toUpperCase();
		username = capital + letter;
		System.out.println("Your username is "+username+".");
	} //end displayDetails

	public static int getSide(String name)
	{	
		int side = 0;
		System.out.print("Please enter the "+name+" of the shape: ");
		side = kboard.nextInt();
		return(side);
	} //end getSide

	public static void display(int height, int width)
	{	
		if (height == width)
			System.out.println("The shape is a square."); 
		else 
			System.out.println("The shape is a rectangle.");
	} //end display
	
	public static void bye()
	{
		System.out.println("Bye!"); 
	} //end bye
	
	public static void main(String[] args)
	{
		String begin = "";
		int option = 0;
		String forename = "";
		String surname = "";
		int height = 0;
		int width = 0;
		
		begin = starting();
		
		if (!begin.equalsIgnoreCase("y"))
		{
			bye();
			System.exit(0); //terminates program
		} //end if
		
		do {
			option = getOption();
			
			switch (option) {
				case 1:
					forename = getForename();
					surname = getSurname();
					displayDetails(forename, surname);
				    break;
				case 2:
					height = getSide("height");
					width = getSide("width");
					display(height, width);
				    break;
				case 3:
					bye();
				    break;
				default:
				    System.out.println("This is not an option.");
			} //end switch
			
			if (option == 3)
			{
				break;
			} //end if
			
		} while (begin.equalsIgnoreCase("y")); //end do while
		
		kboard.close();
	} //end main
}//end class
