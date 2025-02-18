package com.hspeds.HousRent.Utils;

import java.util.Scanner;

public class utility {

    public static char readchar() {
            Scanner scanner = new Scanner(System.in);
            char s = scanner.next().charAt(0);
            return s;
    }
    public static String readSting(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        return s;
    }
    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        return s;
    }
}
