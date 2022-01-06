package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String star = "**"; //The shape of the stars

        int numRows = inputInt("How many rows?"); //Gets the number of rows the user wants
        final int allNum = numRows * 10; //All the numbers required is the number of rows multiplied by 10, so gets this number as well

        int num1 = inputInt("What is the first multiplication table you want to replace?");
        int num2 = inputInt("What is the second multiplication table you want to replace?");
        //Gets the numbers the user wants to replace


        String[] intArray = new String[allNum]; // Creates a String array the size of all the numbers

        inputArray(intArray, allNum, num1, num2, star); //Inputs all the values into the arrays

        printArray(intArray); //Prints all the elements as per



    }

    public static void inputArray(String[] intArray,int allNum, int num1, int num2, String star){
        for (int i = 0; i < allNum; i++) {
            int n = i + 1;
            if (n % num1 == 0 || n % num2 == 0) {
                intArray[i] = star;
            } else {
                intArray[i] = Integer.toString(n);
            }
        }
    } //If the value of a number is in the numbers input multiplication table, a star is added at that position otherwise the number converted to String is added to that position


    public static void printArray(String[] intArray){
        for (int i = 0; i < intArray.length; i++) {

                if ((i+1) % 10 == 0) {
                    System.out.print(intArray[i] + "\n");
                } else {
                    System.out.print(intArray[i] + " ");
                }

        }
    } //If the position is a multiplication of 10, goes down to the next line otherwise prints all the numbers in one lie

    public static void print(String m) {

        System.out.println(m);
    } //Prints a message

    public static String inputString(String m) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextLine();
        return answer;
    } //Returns a string input

    public static int inputInt(String m) {
        int answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextInt();
        return answer;
    } //Returns an integer input
}
