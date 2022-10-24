package Moods;

import java.util.Scanner;

import Therapists.TherapistConnection;

public class Depression {	
	public void depressionInvoked(String userName) {
		System.out.println("Try and take a walk through nature or expend some physical activity.");
		System.out.println("If you feel this technique has not helped, would you prefer to chat with a certified therapist? (Y/N)");
		TherapistConnection depressionTherapist = new TherapistConnection();
		Scanner standardInput = new Scanner(System.in);
			boolean done = false;
			while(!done) {
				String yesOrNo = (String) standardInput.next();
				if(yesOrNo.equals("Y")) {
					System.out.println("Please wait while we connect you with a therapist.");
					depressionTherapist.DepressionTherapistInvoked(userName);
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
