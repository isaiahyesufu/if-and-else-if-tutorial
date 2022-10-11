package com.packages;

import java.util.*;

public class Tutorial6Variables {
    public static void main(String[] args) {
        System.out.println("what school do you go to?");
        Scanner scanner = new Scanner(System.in);
        String School = scanner.nextLine();
        String Remark = new String(" is a good school. I hope you do well");
        String Motivation = new String( "Enjoy yourself at ");
        System.out.println( School + Remark);
        System.out.println( Motivation + School);


    }
}