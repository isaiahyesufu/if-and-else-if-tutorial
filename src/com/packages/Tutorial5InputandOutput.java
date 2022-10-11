package com.packages;

import java.util.*;
public class Tutorial5InputandOutput{
    public static void main(String []args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        System.out.println("hello " + name);

    }
}
