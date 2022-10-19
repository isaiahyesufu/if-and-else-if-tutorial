package com.packages;

import java.util.Scanner;

public class passwordpersonallpractice {
    public static void main(String[]args){
        String askforthepassword= "What is the password?";
        System.out.println(askforthepassword);

        String password= new String("Injesusname");
        Scanner scanner= new Scanner(System.in);
        String answer= scanner.nextLine();


        System.out.println(answer.equals(password));


        
    }
}
