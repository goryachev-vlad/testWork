package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        Array2 arry = new Array2(q, str);

        arry.print();
        System.out.println("Enter lookup string..");
        String lookupString = scanner.nextLine();

        arry.lookup(lookupString);

    }
}
