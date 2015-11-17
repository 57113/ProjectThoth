package ProtoAlpha;
import java.util.Scanner;
public class commandLine {

	public static void main(String[] args) {
	logIn();

	}
public static void logIn(){
	String shaysUsername ="Shay";
	int shaysPassword = 56734;
	System.out.println("Please Enter Your Username");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String username = sc.next();
	int checkOne = 0;
	if(username.equals(shaysUsername)){
		System.out.println("Username Accepted");
		 checkOne = + 1;
		System.out.println("Please Enter Your Password");
	int password = sc.nextInt();
	if(password == shaysPassword){
		System.out.println("Password Accepted");
	    checkOne = checkOne +1;}
		else{
		System.out.println("Invalid Password Console Locked");}}
		else{
		System.out.println("Invalid Username Console Locked");}
	}
	}



