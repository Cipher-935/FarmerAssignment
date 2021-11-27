package Assignment_Four;

import java.util.ArrayList;
import java.util.Scanner;


public class PigCollection {
	
	
    private int SIZE;
    private int SET_AMOUNT = 5;
    private Pig[] PIG_LIST;

    public PigCollection() {
        this.PIG_LIST = new Pig[SET_AMOUNT];
    }

    public Pig[] getPigArray() {
        return PIG_LIST;
    }

    public void setPigList(Pig[] pigList) {
        this.PIG_LIST = pigList;
    }

    private void croitre() {
        int newSetAmount = SET_AMOUNT * 2;
        Pig[] newList = new Pig[newSetAmount];

        for (int index = 0; index < SIZE; index++) {
            newList[index] = PIG_LIST[index];
        }
        SET_AMOUNT = newSetAmount;
        PIG_LIST = newList;
    }

    public void addPIG(Pig pig) {
        if (SIZE >= SET_AMOUNT) {
            croitre();
        }
        PIG_LIST[SIZE] = pig;
        SIZE++;
    }

    public int getPigCount() {
        return SIZE;
    }

    public boolean isEmpty() {
        return SIZE == 0;
    }

    public String getPigList() {

        String string = "";

        for (int index = 0; index < SIZE; index++) {
            string += PIG_LIST[index].getName() + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }

}
	