package com.company;

public class Array2 {
    // fields
    int size;
    String str;
    int index[];

    //constructor
    public Array2(int size, String str){
        this.size = size;
        this.str = str;
        index = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            index[ch] = i;
        }
    }

    //methods
    public void print() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print(str.charAt(y * size + x));
            }
            System.out.println();
        }
    }
//QLGNAEKIRLRNGEAE
    public void lookup(String searchString) {
        for (int i = 0; i < searchString.length(); i++) {
            char ch = searchString.charAt(i);
            int position = index[ch];

            int x = position % size;
            int y = position / size;
            System.out.print("[" + y + "," + x + "]->");
        }
    }

}
