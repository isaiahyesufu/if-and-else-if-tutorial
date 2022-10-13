package com.packages;

import java.util.Scanner;

public class Stringreverse2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        String reverseword = "";

        for (int i = (A.length() - 1); i >= 0; i--){
            reverseword = reverseword + A.charAt(i);
            System.out.print(A.charAt(i));
        }
        System.out.println(" ");
        if (A.toLowerCase().equals(reverseword.toLowerCase()) ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}