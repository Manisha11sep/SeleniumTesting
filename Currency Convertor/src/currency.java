import java.util.Scanner;


public class currency {
	public static void main(String[] args)
	{
//currenty converter//
 char USD =67;
	char pound = 87;
	char yen = 165;
	char euro = 200;
	
	String US_Dollar = "Dollars";
	String Pound = "Pounds";
	String Yen = "Yen";
	String Euro ="Euros";
	double rate =0;
	
	System.out.println("Welcome to the Currency convertor");
	System.out.println("Please choose input currency value");
	
	Scanner in = new Scanner(System.in);
	int choice = in.nextInt();
	
	String inType = null;
	switch(choice)
	{
	case 1: inType ="Dollars" + USD; 
	break;
	case 2: inType ="Pounds"+ pound;
	break;
	case 3: inType ="Euros" +euro;
	break;
	default:
	System.out.println("please enter the no again");
	return  ;
	}
	System.out.println("please choose the output currency");
	int output = in.nextInt();
	System.out.println("now enter the input"+ inType);
	double input = in.nextDouble();
	if (choice == output)
		System.out.println("");
	}

	
	
	}

}
