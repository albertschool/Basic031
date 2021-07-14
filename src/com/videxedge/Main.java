package com.videxedge;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void q1() {   // שאלה 1
        Scanner input = new Scanner(System.in);
        int grade;
        int students=0, high=0, low=0;
        double totalSum=0;
        System.out.println("Enter grade:");
        grade = input.nextInt();
        while (grade!=999) {
            students++;
            totalSum+=grade;
            if (grade>=90) {
                high++;
            } else if (grade<60) {
                low++;
            }
            System.out.println("Enter grade:");
            grade = input.nextInt();
        }
        double average = totalSum/students;
        System.out.println("Number of students: "+students);
        System.out.println("Average grade: "+average);
        System.out.println("Number of high grade: "+high);
        System.out.println("Number of low grade: "+low);
    }

    public static void q2() {   // שאלה 2
        Scanner input = new Scanner(System.in);
        String name, highName="", lowName="";
        double height, highHeight=0, lowHeight=0;
        System.out.println("Enter student name:");
        name = input.next();
        if (!name.equals("stop")) {
            System.out.println("Enter student height:");
            height = input.nextDouble();
            highName=name;
            highHeight=height;
            lowName=name;
            lowHeight=height;
            System.out.println("Enter student name:");
            name = input.next();
            while (!name.equals("stop")) {
                System.out.println("Enter student height:");
                height = input.nextDouble();
                if (height>highHeight) {
                    highName=name;
                    highHeight=height;
                } else if (height<lowHeight) {
                    lowName=name;
                    lowHeight=height;
                }
                System.out.println("Enter student name:");
                name = input.next();
            }
            System.out.println("Highest student name: "+highName+", "+highHeight+" high");
            System.out.println("Lowest student name: "+lowName+", "+lowHeight+" high");
        } else {
            System.out.println("No data !");
        }
    }

    public static void q5() {   // שאלה 5
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int num = rnd.nextInt(100) + 1;
        int answer, count = 1;
        System.out.println ("What is the number you guess?");
        answer = input.nextInt();
        while (answer != num && count < 11) {
            if (answer > num) {
                System.out.println("Too big");
            } else if (answer < num) {
                System.out.println("Too small");
            }
            count++;
            System.out.println ("What is the number you guess?");
            answer = input.nextInt();
        }
        if (count < 5) {
            System.out.println ("You won 100");
        } else if (count < 11) {
            System.out.println("You won 50");
        } else {
            System.out.println ("You lose");
        }
    }

    public static void q6() {   // שאלה 6
        Scanner input = new Scanner(System.in);
        int min = 0,num = 50, max = 101, count = 1;
        String answer = "";
        System.out.println ("Computer guess is: "+num+" Is it right?");
        answer = input.next();
        while (!answer.equals("Bingo")) {
            if (answer.equals("Small")) {
                min = num+1;
            } else if (answer.equals("Big")) {
                max = num-1;
            }
            num = (min+max)/2;
            count++;
            System.out.println ("Computer guess is: "+num+" Is it right?");
            answer = input.next();
        }
        System.out.println ("The number is: "+num+" in "+count+" guesses");
    }

    public static void main(String[] args) {
        q1();
        q2();
        q5();
        q6();
    }
}
