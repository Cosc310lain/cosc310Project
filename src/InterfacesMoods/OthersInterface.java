package InterfacesMoods;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface OthersInterface {
	public static void othersInvoked(String userName) {
		System.out.println("I'm sorry I cannot help you with your specific mood.");
		System.out.println("Would you prefer to chat with a certified therapist to pinpoint "
				+ "your mood and get the help you need? (Y/N)");
		boolean done = false;
		while(!done) {
			try(Scanner standardInput = new Scanner(System.in)) {
				String yesOrNo = standardInput.nextLine();
				if(yesOrNo == "Y") {
					
				}
				if(yesOrNo == "N") {
					System.out.println("Thank you for using your our service, " + userName + "!");
				}
				done = true;
			}
			catch (InputMismatchException e) {
				System.out.println("Oops! You entered an incorrect character, please try again.");
				done = false;
			}
		}
	}
}
