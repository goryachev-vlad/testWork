package com.company;

public class Array {
    // fields
    char array[][];

    //constructor
    public Array(int size, String str){
        this.array = new char[size] [size];

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                array[x][y] = str.charAt( y * size + x );
            }
        }
    }

    //methods
    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }

    public void lookup(String searchString) {
       label:
        for (int i = 0; i < searchString.length(); i++) {
            if (i > 0) {
                System.out.print("->");
            }
            char ch = searchString.charAt(i);


            for (int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[i].length; x++) {
                    if (ch == array[x][y]) {
                        System.out.print("[" + y + "," + x + "]");
                        continue label;
                    }
                }
            }
        }
    }

}
