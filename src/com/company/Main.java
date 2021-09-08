package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printAmerican("wednesday", 4, "september", 2021);
        printEuropean("wednesday", 4, "september", 2021);
    }


    //exercise 1
    public static void printAmerican(String day, int date, String month, int year){
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year){
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }

    //exercise 2
    /*
    public static void main(String[] args) {
        1
        zippo("rattle", 13);
    }
    public static void baffle(String blimp) {
        5
        System.out.println(blimp);
        6
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
            2, 7
        if (flag < 0) {
            8
            System.out.println(quince + " zoop");

        } else {
            3
            System.out.println("ik");
            4
            baffle(quince);
            9
            System.out.println("boo-wa-ha-ha");
        }
    }
    What is the value of the parameter blimp when baffle gets invoked?
    Rattle

    What is the output of this program?
    ik
    rattle
    ping zoop
    boo-wa-ha-ha
     */

    //exercise 3
    /*
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    public static void ping() {
        System.out.println(".");
    }

    What is output by the following program? Be precise about the placement of spaces and newlines.
    No, I wug.
    You wugga wug.
    I wug.
  /*

}
