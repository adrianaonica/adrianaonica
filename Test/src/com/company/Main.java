package com.company;

import java.util.Scanner;

public class Main {

    public static void CheckOddEven(Integer number) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the num: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else
            System.out.println("Odd Number");
        System.out.println("bye");
    }

    public static void SumAverageInt() {
        int nr;
        int total = 0;

        for (nr = 1; nr <= 100; nr++) {
            total = total + nr;
        }
        System.out.println(total);

        int initialSum = 0;
        double averageSum;
        for (int number = 1; number <= nr-1; ++number) {
            initialSum += number;
        }
        averageSum= initialSum/nr-1;
        System.out.println("The sum = "+initialSum);
        System.out.println("The average = "+ averageSum);

        }

    public static boolean uniqueCharacters(String str)
    {
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;

        return true;
    }

    public static void SumProductMinMax()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = input.nextInt();
        System.out.print("Enter second number :");
        int b = input.nextInt();
        System.out.println("Enter thirds number :");
        int c = input.nextInt();
        int sum = a+b+c;
        int product = a*b*c;
        System.out.println("Sum is :"+sum);
        System.out.println("Product is :"+product);

        int arr[] = { a,b,c };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            min = Math.min(min, arr[i]);
        System.out.println("Minimum is :"+min);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            max = Math.max(max, arr[i]);
        System.out.println("Maximum is :"+max);

    }

    public static void reverseInput()
    {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter nr :");
            int nr = input.nextInt();
            int rev_nr = 0;
            while (nr > 0) {
                rev_nr = rev_nr * 10 + nr % 10;
                nr = nr / 10;
            }
            System.out.println(rev_nr);

        }




    public static void main(String[] args) {
       Integer nrInt = null;
       String input = "asdfv";
        SumProductMinMax();
        reverseInput();

        if (uniqueCharacters(input)) {
          System.out.println("The String " + input + " has all unique characters");
       }
       else {
           System.out.println("The String " + input + " has duplicate characters");
       }
          CheckOddEven(nrInt);
          SumAverageInt();
    }
     
    }

