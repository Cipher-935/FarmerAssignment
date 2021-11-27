package Assignment_Four;

import java.util.Scanner;
import java.time.LocalDate;

public class Farmer {

	private static PigCollection pigCollection = new PigCollection();
	private static FeedCollection feedCollection = new FeedCollection();
			
	private static Scanner system = new Scanner(System.in);
	private static String ID, NAME, SEX, COLOR, FEED_TYPE, PIG_LIST;
	private static int YEAR, MONTH, DAY, BIN_NUMBER;
	public static double WEIGHT;
	public static int set;
	public static int id = 0;


	public static void main(String[] args) {

		do {

		    mainWindow();
		            
		    	do {
		            while (!system.hasNextInt()) {
		                System.out.println("Huh! Error, reach out next time");
		                System.out.print("Your Choice: ");
		                system.nextLine();
		                }
		                
						set = system.nextInt();
		                
					if (set < 0 || set > 5) {
		                do {
		                        System.out.print("System Error, try once more: ");
		                        set = system.nextInt();
		                } while (set < 0 || set > 5);
		        	}
		        } while (set < 0);

		        switch (set) {
		            case 1: getPigInfo();
		                	Pig newPigList = new Pig(ID, NAME, SEX.charAt(0), COLOR, LocalDate.of(YEAR, MONTH, DAY));
		                	pigCollection.addPIG(newPigList);
		                	System.out.println("Added Pig successfully, congratulations!!!");
		                	System.out.println("\n\nID: " + newPigList.getPigID() + "\tName: " + newPigList.getName() + "\tSex: "
		                        				+ newPigList.getSex() + "\tColor: " + newPigList.getColor() + "\tDate of Birth: " 
												+ newPigList.getDate());
		               		break;

		            case 2: getFeedInfo();
		                	Feed newFeedList = new Feed(FEED_TYPE);
		                	feedCollection.setFeedNumber(BIN_NUMBER, newFeedList);
		                	System.out.println("Added Feed at " + BIN_NUMBER);
		                	break;

		            case 3: if (pigCollection.isEmpty()) {
		                    	System.out.println("Huh, no Pigs found, try to add some.");
		                	} 
							
							else {
		                    	for (int index = 0; index < pigCollection.getPigCount(); index++) {
		                        	Feed temp = feedCollection.getNextFullBin();
		                        	System.out.println(feedCollection.getNumberOfFullBins() + " bin(s) in inventory.");
		                        	if (temp != null) {
		                            	pigCollection.getPigArray()[index].feed(temp);
		                            	System.out.println("Bins Used! :)");
		                        	} 
									
									else {
		                            	System.out.println("Huh, you're out of bins. Wanna add some?");
		                            	break;
		                        	}
		                    	}
		                	}

		                	break;

		            case 4: System.out.println("Total " + feedCollection.getSize() + " bins available");
		                	PIG_LIST = pigCollection.getPigList();
		                	System.out.println("Pigs: " + PIG_LIST);
		                	break;

		            case 5:	System.out.println("Thank you, see you soon. :)");
		                	break;
		            }

		            System.out.println();

		        } while (set != 5);

	}

	public static void mainWindow() {
		System.out.println("1. Add Pig     |     2. Add Feed     |     3. Feed Pigs     |     4. Report     |     5. Exit");
		System.out.print("Your Choice: ");

    }

	public static void getPigInfo() {
		id++;
		System.out.print("ID: " + id + "\n");
		System.out.print("Name: ");
		NAME = system.next();
		System.out.print("Sex: ");
		SEX = system.next();
		System.out.print("Color: ");
		COLOR = system.next();
		System.out.print("Date of birth (YYYY): ");
		YEAR = system.nextInt();
		System.out.print("Date of birth (MM): ");
		MONTH = system.nextInt();
		System.out.print("Date of birth (DD): ");
		DAY = system.nextInt();
	}

	public static void getFeedInfo() {
		System.out.print("Number of bin: ");
		BIN_NUMBER = system.nextInt();
		System.out.print("Feed type: ");
		FEED_TYPE = system.next();
		System.out.print("Weight (in kg): ");
		WEIGHT = system.nextDouble();
	}
}
		
	