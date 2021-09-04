package com.chiongtyron;

public class Main {

    public static void main(String[] args) {
	    int[] bubbleNumbers = {2,5,10,6,4,14,17,19,24};

	    // by default, we assume there is no need to loop again
	    boolean shouldLoopAgain = false;

	    // we used do while since I want it to check the first loop for any swap
        // this is because a swap means that the array has to be sorted again
        do {
            shouldLoopAgain = false;
            for (int i = 0; i < bubbleNumbers.length - 1; ++i) {
                if (bubbleNumbers[i] < bubbleNumbers[i + 1]) {
                    int temp = bubbleNumbers[i];
                    bubbleNumbers[i] = bubbleNumbers[i + 1];
                    bubbleNumbers[i + 1] = temp;
                    // At this point, the original array is not sorted
                    // which is why we started the loop again
                    shouldLoopAgain = true;
                }
            }
        } while(shouldLoopAgain);


	    for (int i = 0; i < bubbleNumbers.length; ++i)
	        System.out.println(bubbleNumbers[i]);
    }
}
