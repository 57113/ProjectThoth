package ProtoAlpha;
import java.util.Scanner;
public class commandLine {

	public static void main(String[] args) {
	logIn();

	}
public static void logIn(){
	System.out.println("Please Enter Your Username");
	Scanner sc=new Scanner(System.in);
	String username = sc.next();
	System.out.println("Please Enter Your Password");
	String password = sc.next();
	System.out.println(username);
	System.out.println(password);
}
}
