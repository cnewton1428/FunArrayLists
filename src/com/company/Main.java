package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // List of colors
        Scanner input = new Scanner(System.in);
        String Q = new String();
        ArrayList<String> colors = new ArrayList<>();
        //Add some colors
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");

        System.out.println(colors);

        System.out.println("The color at index 1 is " + colors.get(1));

       

        for (String c : colors) {

            System.out.println("Enter a new color");
            String colorInput = input.nextLine();

            colors.add(colorInput);
            System.out.println(colors);

//            System.out.println("Enter a new color");
//            String colorAdd = input.nextLine();
            if (c.equalsIgnoreCase(colorInput)) {
                System.out.println(colors);
    } else {
                System.out.println("Enter Q to quit" + Q);
                System.out.println(colors);
    }
        }
    }
}