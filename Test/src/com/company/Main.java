package com.company;

import java.util.Arrays;
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
        averageSum= initialSum/(nr-1);
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

    public static void sumProductMinMax()
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

    static void countVowelsDigits(String str)
    {
        // Declare the variable vowels, consonant, digit
        // and special characters
        int vocale = 0;
        int consoane = 0;
        int caractereSpeciale = 0;
        int cifre = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ( (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z') ) {
                ch = Character.toLowerCase(ch);;

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vocale++;
                else
                    consoane++;
            }
            else if (ch >= '0' && ch <= '9')
                cifre++;
            else
                caractereSpeciale++;
        }

        System.out.println("Vocale: " + vocale);
        System.out.println("Consoane: " + consoane);
        System.out.println("Cifre: " + cifre);
        System.out.println("Caractere speciale: " + caractereSpeciale);
    }

    public static void insertCharSpecificPosition()
    {
        int len, position,element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" all the elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        position = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        element = sc.nextInt();
        for(int i = len-1; i >= (position-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[position-1] = element;
        System.out.print("After inserting : ");
        for(int i = 0; i <=len; i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void averageWithoutSmallestAndLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        int len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" all the elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        float sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }
        float result = ((sum - max - min) / (arr.length - 2));
        System.out.printf("Compute the average value without largest and smallest values: %.2f", result);
        System.out.print("\n");

}

    public static int[] removeOccuranceOfElementInArray(int[] arr, int key)
    {

            int position = 0;
            for (int i=0; i<arr.length; i++)
                if (arr[i] != key)
                    arr[position++] = arr[i];
            return Arrays.copyOf(arr, position);
        }

   public static void bubbleSortAlgorithm(int[] arr) {
       int len = arr.length;
       int temp = 0;
       for (int i = 0; i < len; i++) {
           for (int j = 1; j < (len - i); j++) {
               if (arr[j - 1] > arr[j]) {
                   temp = arr[j - 1];
                   arr[j - 1] = arr[j];
                   arr[j] = temp;
               }
           }
       }
   }


        public static void main(String[] args) {
       Integer nrInt = null;
       String input = "asdfv";
        sumProductMinMax();
        reverseInput();
        String str = "Test de verificat cate cifre 01278278 si cate litere are un cuvant si cate ^#*&*&^#&^ sunt";
        countVowelsDigits(str);
        insertCharSpecificPosition();
        int[] array = { 1,4,7,9,3,7,1,8};
        int key = 4;
        array = removeOccuranceOfElementInArray(array, key);
        System.out.println(Arrays.toString(array));
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length of an array:");
            int len = sc.nextInt();
            int arr[] = new int[len+1];
            System.out.println("Enter "+len+" all the elements:");
            for(int i = 0; i < len; i++)
            {
                arr[i] = sc.nextInt();
            }
            bubbleSortAlgorithm(arr);
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

           
        if (uniqueCharacters(input)) {
          System.out.println("The String " + input + " has all unique characters");
       }
        else {
           System.out.println("The String " + input + " has duplicate characters");
        }
          CheckOddEven(nrInt);
          SumAverageInt();
            averageWithoutSmallestAndLargest();
    }

    }

