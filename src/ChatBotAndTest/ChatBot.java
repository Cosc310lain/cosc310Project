package ChatBotAndTest;

import java.util.Scanner;

import InterfacesMoods.*;
import Moods.*;

public class ChatBot implements AnxietyInterface, DepressionInterface, EmergencyInterface, HappyInterface, OthersInterface, StressedInterface{
	public static Anxiety anxiety = new Anxiety();
	public static Depression depression = new Depression();
	public static Emergency emergency = new Emergency();
	public static Happy happy = new Happy();
	public static Others other = new Others();
	public static Stressed stress = new Stressed();
	
	public void Greet(String userName) {
		System.out.println("Hello, " + userName + "! Welcome.");
		System.out.println("Please state the current theme of your issue so that I may assist you the best.");
		Scanner standardInput = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			String currentIssue = standardInput.next();
			switch(currentIssue) {
				case "Anxiety":
					anxiety.anxietyInvoked(userName);
					done = true;
					break;
				case "Depression":
					depression.depressionInvoked(userName);
					done = true;
					break;
				case "Emergency":
					emergency.emergencyInvoked(userName);
					done = true;
					break;
				case "Happy":
					happy.happyInvoked(userName);
					done = true;
					break;
				case "Others":
					other.othersInvoked(userName);
					done = true;
					break;
				case "Stressed":
					stress.stressedInvoked(userName);
					done = true;
					break;
				default:
					System.out.println("You didn't enter a proper theme, try again!");
					done = false;
					break;
			}
		}
	standardInput.close();
	}
	
}
