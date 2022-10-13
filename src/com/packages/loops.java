package com.packages;

import java.util.Scanner;

public class loops {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int N= scanner.nextInt();

        for( int X=1;X<=10;X++){
            System.out.println(N+" x "+X+" = "+ N*X);

        }


    }
}
