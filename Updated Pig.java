package Assignment_Four;

import java.time.LocalDate;

public class Pig {

    private static int NORMAL = 0; 

    private String NAME, COLOR, PIG_ID;
    private char SEX;
    private LocalDate DATE;
    private boolean IS_FEED;

    public Pig(String id, String name, char gender, String color, LocalDate date){
        this.PIG_ID = id;
        this.NAME = name;
        this.COLOR = color;
        this.SEX = gender;
        this.DATE = LocalDate.now();
    }

    public static int getCount() {
        return NORMAL;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }
    
    public LocalDate getDate() {
        return DATE;
    }

    public void setDate(LocalDate date) {
        this.DATE = date;
    }

    public char getSex() {
        return SEX;
    }
    
    public void setSex(char gender) {
        this.SEX = gender;
    }

    public String getColor() {
        return COLOR;
    }
    
     public void setColor(String color) {
        this.COLOR = color;
    }

    public String getPigID() {
        return PIG_ID;
    }

    public void setPigID(String id) {
        this.PIG_ID = id;
    }

    public static void setCount(int count) {
        Pig.NORMAL = count;
    }

    public boolean isFed() {
        return IS_FEED;
    }

    public void setFed(boolean isFed) {
        this.IS_FEED = isFed;
    }

    public void feed(Feed object) {
        object.consume();
    }

}
    
    
    
    
    
	//Declaration of private variables
       /* private boolean isFed = true;

		public int id;
		
		public int getID() {
			return id;
		}
		public boolean getisFed() {
			return isFed;
		}
		public Pig(int x) {
			this.id = x;
			
		}
		
		
      
        public void feed(Feed obj, int totalfeed) {
        	obj.consume(totalfeed);
        }
        
      
        
}*/

