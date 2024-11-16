package syed;
import java.util.Scanner;

public class Validation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctUserId = "user123";
	    String correctPassword = "password123";

	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter User ID: ");
	    String userId = scanner.nextLine();

	    System.out.print("Enter Password: ");
	    String password = scanner.nextLine();

	    if (!userId.equals(correctUserId)) {
	        System.out.println("Invalid User ID");
	    } else if (!password.equals(correctPassword)) {
	        System.out.println("Login unsuccessful");
	    } else {
	        System.out.println("Login successful");
	    }

	    scanner.close();
	}

}


        


