package com.chiongtyron;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float[] floatArray = {
                20.20f, 10.3f, 115.4f, 12.6f, 10f,
                85.61f, 24.5f, 250.87f, 153.23f, 5.23f,
                12f, 65.65f, 48.85f, 25.76f, 99.99f,
                1.1f, 33.33f, 192.81f, 710.24f, 32.4f
            };
        
        System.out.println("Java float with 20 elements");
        for (int i = 0; i < floatArray.length; ++i){
            System.out.println("Element at Index : " + i + " " + floatArray[i]);
        }
    }
}
