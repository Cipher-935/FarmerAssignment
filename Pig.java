package Assignmnet;
import java.time.LocalDate;//importing this package to use current date for date of birth of pigs
public class Pig {
	//Declaration of private variables 
        private static int count = 0;
        private boolean isFemale = true;
		private String name;
		private String sex;
		private String color;
		private LocalDate date;
		
		
		//getting private values through getters and setters
		public String getName() {
			return name;
		}
		public String getSex() {
			return sex;
		}
		public String getcolor() {
			return color;
		}
		public LocalDate getDate() {
			return date = LocalDate.now();
		}
        public int getcount() {
        	return count;
        }
        
       
        public boolean getisFemale() {
        	return isFemale;
        }
        public boolean isFemale(String sex) {
        	return sex.equals("Female");
			
        }
         
        public Pig() {
        	
        }
        public Pig(String name, String sex, String color, LocalDate date) {
        	this.name = name;
        	this.sex = sex;
        	this.color = color;
        	this.date = date;
        }
        public void feed(Feed obj, int totalfeed)
		{
        	obj.consume(totalfeed);
        }
        
      
        
}

