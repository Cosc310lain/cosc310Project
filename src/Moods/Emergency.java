package Moods;

import java.util.Scanner;

public class Emergency {
	public void emergencyInvoked(String userName) {
		System.out.println("Try and call your local authorities as soon as you can.");
		System.out.println("If you cannot call them, would you like us to call them given your current location? (Y/N)");
		boolean done = false;
		while(!done) {
			Scanner standardInput = new Scanner(System.in); 
				String yesOrNo = standardInput.nextLine();
				if(yesOrNo.equals("Y")) {
					System.out.println("Understood. We are calling the local authorities right now. Please stay put.");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("\nThank you. We have called the authorities.");
					done = true;
				}
				else if(yesOrNo.equals("N")) {
					System.out.println("Thank you for using your our service, " + userName + "!");
					done = true;
				}
				else {
					System.out.println("You entered an incorrect answer. Please try again.");
					done = false;
				}
				standardInput.close();
		}
	}
}
