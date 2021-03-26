package com.codeforces.divA;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int watermelonWight = scanner.nextInt();
        if (watermelonWight > 2 && watermelonWight % 2 == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }

}
