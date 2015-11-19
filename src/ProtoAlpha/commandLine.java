package ProtoAlpha;
import java.util.Scanner;
import java.util.Date;
public class commandLine {

	public static void main(String[] args) {
	logIn();

	}
public static void logIn(){
	Date ti=new Date();
	String shaysUsername ="Shay";
	int shaysPassword = 56734;
	System.out.println("Please Enter Your Username");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String username = sc.next();
	int checkShay = 0;
	if(username.equals(shaysUsername)){
		System.out.println("Username Accepted");
		 checkShay = + 1;
		System.out.println("Please Enter Your Password");
	int password = sc.nextInt();
	if(password == shaysPassword){
		System.out.println("Password Accepted");
	    checkShay = checkShay +1;}
		else{
		System.out.println("Invalid Password Console Locked");}}
		else{
		System.out.println("Invalid Username Console Locked");}
	if(checkShay == 2){
		System.out.println("Welcome Shay");}
	System.out.println("The Current Date and Time is " +ti);
	System.out.println("What can i help you with today?");
	@SuppressWarnings("resource")
	Scanner se=new Scanner(System.in);
	String userInput = se.next();
	String revisionHistory = "history revision please";
	String revisionGeography = "geography revision please";
	String revisionComputerScience = "computer science revision please";
	
	if (userInput.equals(revisionHistory)){
		System.out.println("Okay, what part of the A Level history course would you like help with");
	}
	if (userInput.equals(revisionGeography)){
		System.out.println("Okay, what part of the A Level geography course would you like help with");
	}
	if (userInput.equals(revisionComputerScience)){
		System.out.println("Okay, what part of the A Level computer science course would you like help with");
	}
	
	}
	}
	



