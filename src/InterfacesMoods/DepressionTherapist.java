package InterfacesMoods;

import java.util.Scanner;

public interface DepressionTherapist {
	public static void DepressionTherapistInvoked(String userName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thank you for reaching out about your Depression.");
		System.out.println("My name is Justin Jiang.\n"); 
		System.out.println("It would help me better serve you if I knew more about you. How old are you?");
		Scanner standardInput = new Scanner(System.in);
		// AGE QUESTION
		int age = 0;
		boolean ageDone = false;
		while(!ageDone) {
			age = standardInput.nextInt();
			if(age < 0 || age > 120) {
				System.out.println("That is an incorrect age. Please try again: ");
				ageDone = false;
			} else {
				System.out.println("Thank you for inputting your age.");
				ageDone = true;
			}
		}
		// GENDER QUESTION
		System.out.println("You are " + age + " years old, now please enter your gender. (Male, Female, Other)");
		String gender = "";
		boolean genderDone = false;
		while(!genderDone) {
			gender = standardInput.next();
			switch(gender) {
				case "Male":
					System.out.println("Thank you for inputting your gender.");
					genderDone = true;
					break;
				case "Female":
					System.out.println("Thank you for inputting your gender.");
					genderDone = true;
					break;
				case "Other":
					System.out.println("Thank you for inputting your gender.");
					genderDone = true;
					break;
				default:
					System.out.println("You entered an incorrect gender. Please try again. (Male, Female, Other)");
					genderDone = false;
					break;
			}
		}
		System.out.println("Your gender is " + gender + ". Now that I know a little about you, what is the best time to meet during the week?\n"
				+ "(Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)");
		String day = "";
		boolean dayDone = false;
		while(!dayDone) {
			day = standardInput.next();
			switch(day) {
				case "Monday":
					System.out.println("Mondays are best for you.");
					dayDone = true;
					break;
				case "Tuesday":
					System.out.println("Tuesdays are best for you.");
					dayDone = true;
					break;
				case "Wednesday":
					System.out.println("Wednesdays are best for you.");
					dayDone = true;
					break;
				case "Thursday":
					System.out.println("Thursdays are best for you.");
					dayDone = true;
					break;
				case "Friday":
					System.out.println("Fridays are best for you.");
					dayDone = true;
					break;
				case "Saturday":
					System.out.println("Saturdays are best for you.");
					dayDone = true;
					break;
				case "Sunday":
					System.out.println("Sundays are best for you.");
					dayDone = true;
					break;
				default:
					System.out.println("You did not enter a correct day. Try again.");
					dayDone = false;
					break;
			}
		}
		standardInput.close();
	}
}
