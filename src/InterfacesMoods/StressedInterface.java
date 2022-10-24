package InterfacesMoods;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface StressedInterface {
	public static void stressedInvoked(String userName) {
		System.out.println("Try to take a few deep breaths, identifying the cause of your stress and writing it down"
				+ " may aid in negating the pressure.");
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
				System.out.println("Oops! You entered an incorrect character, please try again.");
				done = false;
			}
		}
	}
}
