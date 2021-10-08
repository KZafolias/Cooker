package javaproj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Vars
        int eggsAmount;
	    int eggsMin = 1;
	    int milkAmount;
	    int milkMin = 200; //milliliter
        int flourAmount;
        int flourMin = 100; //grams
        //Boot up
        System.out.println("Hello User");
        System.out.println("Cooker starting up...");
        //Questions
        System.out.println("How many eggs do you have?");

        Scanner userInput;
        userInput = new Scanner(System.in);
        eggsAmount = userInput.nextInt();
        //eggs done

        System.out.println("How much milk do you have?");
        userInput = new Scanner(System.in);
        milkAmount = userInput.nextInt();
        //milk done

        System.out.println("How much flour do you have?");
        userInput = new Scanner(System.in);
        flourAmount = userInput.nextInt();
        //flour done
        //main code here
        if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
            System.out.println("No blin today :(");
        } else {
            //calculation
            flourAmount = flourAmount / flourMin;
            System.out.println("you have " + flourAmount + " portions of flour");

            milkAmount = milkAmount / milkMin;
            System.out.println("you have " + milkAmount + " portions of milk");

            //find smallest number of all 3
            int smallest;
            if (eggsAmount <= milkAmount && milkAmount <= flourAmount) {
                smallest = eggsAmount;
            } else if (milkAmount <= flourAmount && milkAmount <= eggsAmount){
                smallest = milkAmount;
            } else {
                smallest = flourAmount;
            }
            System.out.println(" "); //every portion is 4 blins
            System.out.println("You can make " + smallest*4 + " of blins");
            System.out.println(" ");
            System.out.println("You will need " + smallest*eggsMin + "eggs");
            System.out.println("You will need " + smallest*flourMin + "flour");
            System.out.println("You will need " + smallest*milkMin + "milk");
            //ending
            System.out.println("Cooker shutting down...");
        }

    }
}
