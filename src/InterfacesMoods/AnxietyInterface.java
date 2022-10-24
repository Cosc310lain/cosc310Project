package InterfacesMoods;
import java.util.Scanner;

public interface AnxietyInterface {
	public static void anxietyInvoked(String userName) {
		System.out.println("Take a deep breath. In through the nose, out through the mouth.");
		System.out.println("If you feel this technique has not helped, would you prefer to chat with a certified therapist? (Y/N)");
		try(Scanner standardInput = new Scanner(System.in)) {
			String yesOrNo = standardInput.nextLine();
			if(yesOrNo == "Y") {
				
			}
			if(yesOrNo == "N") {
				System.out.println("Thank you for using your our service, " + userName + "!");
			}
		}	
	}
}
