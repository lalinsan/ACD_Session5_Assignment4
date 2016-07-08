/*
* Student: Eduardo Aguirre
* Session 5
* Assignment 4
* Java Program that handles NumberFormat Exception. For example the statement int num=Integer.parseInt ("XYZ")
* would throw NumberFormatException because String XYZ cannot be parsed to int. So handle it.
*/

import java.util.Scanner; //Imports Scanner Class from java API Class Library to allow user input


public class StringToIntException {

	public static void main (String [] args) //Main Method to run the Program
	{
		String str; //Declare str variable to store the String 
		int strConverted=0;	//Stores an initializes the String (str) that is converted to an Integer	
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in); //Initiates the Scanner Instance
		String choice="Y"; //Declare and initialize choice variable 
		while (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Y")) //Executes the code as long as the variable choice =Y or Yes
		{
			System.out.print("Enter string to be converted to an Int : "); //Prompts the user to enter the String to be converted into an Integer
			str=sc.next(); //stores the value entered by the User
			try  //Try the call below
			{
				strConverted=Integer.parseInt(str.trim()); //Calls the Integer.parseInt Method, converts str and stores the int in strConverted variable
				System.out.println("String: " +str); //Prints out initial String str
				System.out.println("Converted to int: " +strConverted); //Prints out converted to Integer value
				
				System.out.print ("Do you want to try one more time : "); //Prompts the user to try again 
				choice=sc.next(); //Stores user's response
			}
			catch (NumberFormatException e) //catches the exception if an Error
			{
				System.out.println("Number Format Exception : " +e.getMessage());//Displays exception message when an Exception is caught
				System.out.println("Invalid Entry, use a number"); //Displays a message to indicating a Number (String such as 111, or 72626 is needed)
			}
			
		}
		System.out.println ("Thanks for using the String to Int conversion tool"); //Prints out good bye message
	}
}
