package com.chiongtyron;

import java.util.Scanner;

public class Prompter {

    private static Scanner scn = new Scanner(System.in);

    static boolean confirm(String msg) {
        System.out.println(msg);
        while(true) {
            switch (scn.nextLine().toLowerCase()) {
                case "y": return true;
                case "n": return false;
                default: System.out.println("invalid answer!");
            }
        }
    }
}
