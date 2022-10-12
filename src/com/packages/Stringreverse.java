package com.packages;

import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A= scanner.next();
        String B= new StringBuilder(A).reverse().toString();

        if(B.equals(A)) System.out.println("Yes");
        else System.out.println("No");


    }
}