package InterfacesMoods;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface DepressionInterface {
	public static void depressionInvoked(String userName) {
		System.out.println("Try and take a walk through nature or expend some physical activity.");
		System.out.println("If you feel this technique has not helped, would you prefer to chat with a certified therapist? (Y/N)");
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
				System.out.println("Oops! You entered an incorrect theme, please try again.");
				done = false;
			}
		}
	}
}
