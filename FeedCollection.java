package Assignment_Four;

import java.util.Scanner;
import java.util.ArrayList;

public class FeedCollection {

    public static final int SIZE = 20;
    private Feed[] FEED_ARRAY = new Feed[SIZE];

    public int getSize() {
        return SIZE;
    }

    public Feed[] getFeedArray() {
        return FEED_ARRAY;
    }

    public void setFeedArray(Feed[] feedArray) {
        this.FEED_ARRAY = feedArray;
    }

    public void setFeedNumber(int location, Feed feed) {
        try {
            FEED_ARRAY[location - 1] = feed;
        } catch (Exception e) {
            System.out.println("Huh! Bin is overloaded :( [Out of capacity: " + SIZE + "]");
        }
    }

    public void emptyFeedNumber(int id) {
        FEED_ARRAY[id].consume();
    }

    public int getNumberOfFullBins() {
        int fullIncrementor = 0;
        for (int index = 0; index < SIZE; index++) {
            if (FEED_ARRAY[index] != null && FEED_ARRAY[index].isFull()) {
                fullIncrementor++;
            }
        }
        return fullIncrementor;
    }

    public Feed getNextFullBin() {
        for (int index = 0; index < SIZE; index++) {
            if (FEED_ARRAY[index] != null && FEED_ARRAY[index].isFull()) {
                return FEED_ARRAY[index];
            }
        }
        return null;
    }

}
