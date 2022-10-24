package InterfacesMoods;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface EmergencyInterface {
	public static void emergencyInvoked(String userName) {
		System.out.println("Try and call your local authorities as soon as you can.");
		System.out.println("If you cannot call them, would you like us to call them given your current location? (Y/N)");
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
