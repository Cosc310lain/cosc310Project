package Moods;

import java.util.Scanner;

import InterfacesMoods.OtherTherapist;
import Therapists.TherapistConnection;

public class Others implements OtherTherapist{
	public void othersInvoked(String userName) {
		System.out.println("I'm sorry I cannot help you with your specific mood.");
		System.out.println("Would you prefer to chat with a certified therapist to pinpoint "
				+ "your mood and get the help you need? (Y/N)");
		TherapistConnection otherTherapist = new TherapistConnection();
		Scanner standardInput = new Scanner(System.in);
			boolean done = false;
			while(!done) {
				String yesOrNo = (String) standardInput.next();
				if(yesOrNo.equals("Y")) {
					System.out.println("Please wait while we connect you with a therapist.");
					otherTherapist.OtherTherapistInvoked(userName);
					done = true;
					
				}
				else if(yesOrNo.equals("N")) {
					System.out.println("Thank you for using our service, " + userName + "!");
					done = true;
				}
				else {
					System.out.println("You entered a wrong character! Please try again. (Y/N)");
					done = false;
				}
			}
			standardInput.close();
	}
}
