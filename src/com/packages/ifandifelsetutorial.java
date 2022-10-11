package com.packages;

import java.util.Scanner;

public class ifandifelsetutorial {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        if (N % 2 != 0) {
            System.out.println("wierd");
        } else if (N % 2 == 0 && N > 1 && N < 6) {
            System.out.println("Not Wierd");
        } else if(N % 2 ==0 && N>5 && N<21){
            System.out.println("wierd");
        } else if (N % 2 ==0 && N>20) {
            System.out.println("Not Wierd");
        }


    }

}
