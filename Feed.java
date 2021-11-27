package Assignment_Four;

public class Feed {

    private boolean IS_FULL;
    private double WEIGHT;
    private String FEED;
    
    public String getNameFeed() {
        return FEED;
    }
   
    public void setNameFeed(String feed) {
        this.FEED = feed;
    }
    
    public double getWeight() {
        return WEIGHT;
    }
    
    public void setWeight(double weight) {
        this.WEIGHT = weight;
    }

    public boolean isFull() {
          return IS_FULL;
    }
   
    public void setFull(boolean isFull) {
        this.IS_FULL = isFull;
    }
    
    public void consume() {
        IS_FULL = false;
    }
    
    Feed(String feed) {
        FEED = feed;
        IS_FULL = true;
    }

}
