package com.example.testing;

import java.util.Scanner;

public class MyMath {
    int a;
    int b;

    public void plus() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int res = a + b;
    }

    public void minus() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int res = a - b;
    }
}
