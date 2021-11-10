package Assignmnet;
import java.util.Scanner;//importing scanner to ask the input from the user 
public class Farmer {

	public static void main(String[] args) {
	    int bins;
		int potbins = 0;
		int applebins = 0;
		int totalbins = 0;
		int totalfeed = 0;
		
		String sex = "";
		String input = "";
		
	    Scanner scan = new Scanner(System.in);//scanner
	    
	    //created Feed class objects for Feed constructor 
	    Feed f = new Feed();
	    Feed f1 = new Feed("Apple",applebins);
	   Feed f2 = new Feed("Potato", potbins);
	    
	   
	   
	    System.out.println("Enter Pig's gender (Male/ Female): ");//farmers three pigs with name, sex, color, and date of birth
        sex = scan.nextLine();
        
        Pig p = new Pig();
        System.out.println();
       
        System.out.println("The gender of all pigs is " + sex + " and it is " + p.isFemale(sex));
 
        //three pig class objects created for constructor
	    Pig p1 = new Pig("Yuki", sex, "Pink", null);
	    Pig p2 = new Pig("Buki", sex, "Black", null);
	    Pig p3 = new Pig("Chuki", sex, "White", null);
	    
	   
	    //Beginning of do while loop
		do {
			
            System.out.println("You have three pigs on your farm, there details are as follows:");
            System.out.println();
            System.out.print("Pig One Name: " + p1.getName() + "\t");
            System.out.print("Yuki's Color: " + p1.getcolor() + "\t");
            System.out.print("Yuki's gender: " + p1.getSex() + "\t");
            System.out.print("Yuki's birthday: " + p1.getDate() + "\n");
            System.out.println();
            System.out.print("Pig Two Name: " + p2.getName() + "\t");
            System.out.print("Buki's color: " + p2.getcolor() + "\t");
            System.out.print("Buki's Gender: " + p2.getSex() + "\t");
            System.out.print("Buki's Birthday: " + p2.getDate() + "\n");
            System.out.println();
            System.out.print("Pig Three Name: " + p3.getName() + "\t");
            System.out.print("Chuki's color: " + p3.getcolor() + "\t");
            System.out.print("Chuki's Gender: " + p3.getSex() + "\t");
            System.out.print("Chuki's Birhtday: " + p3.getDate() + "\n");
            System.out.println();
          
            System.out.print("How many new Bins of Potato do you want? ");
            potbins = scan.nextInt();
            System.out.print("How many new Bins of Apple do you want? ");
            applebins = scan.nextInt();
            totalbins = potbins + applebins;//gives the total bin count for apple and potato
            
           
           System.out.println("Total bins are: " + totalbins);
           
            
           
           System.out.println("How many bins do you want to feed: ");
           totalfeed = scan.nextInt();
            
    	   f.add(totalbins);//calling add method from feed class by passing totalbins variable
    	    
    	    p.feed(f, totalfeed); // 
    	    
    	    System.out.println();
    	    System.out.println("The bins count will be carried over from the last feeding.");
    	    System.out.println();
    	    
    	    
    	    
           
    	    System.out.println("If you want to feed again type: Y and if you want to exit type anything else: ");
    	    input = scan.next();
            
    	
    	    }while(input.equals("Y") || input.equals("y"));//this condition will allow the user to feed the pigs again
		
	    
	    
	    
	    

	}

}
