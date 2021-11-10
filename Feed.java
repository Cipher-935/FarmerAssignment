package Assignmnet;

public class Feed {
       private int bins;//private variables are used 
       private String feedtype;
       public int getAmount() {
    	   return bins;
       }
       public Feed() {
    	   
       }
       public Feed(String feedtype, int bins) {
    	  this.feedtype = feedtype; 
    	  this.bins = bins; 
       }
       public int add(int totalbins) {
    	   bins += totalbins;
    	   return bins;
    	   
       }
       public void consume(int totalfeed) {
    	   
    	    if(bins>0){
    	    	bins = bins-totalfeed;
    		  System.out.println("The leftover bins are " + bins );
    		  
    	    }
    	    else if(bins == 0) {
       		   System.out.println("No bins are left!!");//used this for farmer class
       		   
       	   }
    	    
    	   }
       
       
}
