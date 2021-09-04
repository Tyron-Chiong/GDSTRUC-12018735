package com.chiongtyron;

public class Main {

    static void bubbleSort() {
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

    static void selectionSort(){

        int[] selectionNumbers = {7,6,3,1,9,13,4,16,19,20};

        for (int i = 0; i < selectionNumbers.length - 1; ++i){

            // scans for the maximum element after the i
            int currMax = i;
            for (int j = i + 1; j < selectionNumbers.length; ++j){
                if (selectionNumbers[j] > selectionNumbers[currMax]){
                    currMax = j;
                }
            }

            // swap the current minimum with the i
            int temp = selectionNumbers[i];
            selectionNumbers[i] = selectionNumbers[currMax];
            selectionNumbers[currMax] = temp;
        }

        for (int i = 0; i < selectionNumbers.length; ++i)
            System.out.println(selectionNumbers[i]);
    }

    public static void main(String[] args) {
        System.out.println("BubbleSort");
        bubbleSort();
        System.out.println("-------------------");
        System.out.println("SelectionSort");
        selectionSort();
    }

}
