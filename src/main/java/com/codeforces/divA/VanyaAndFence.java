package com.codeforces.divA;

import java.util.Scanner;

/**
 * A. Vanya and Fence
 */
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPersons ,fenceHeight;
        int minimumWidth =0;

        numberOfPersons = scanner.nextInt();
        fenceHeight = scanner.nextInt();
        for(int i=0; i<numberOfPersons; i++){
            if(scanner.nextInt() > fenceHeight){
                minimumWidth +=2;
            }else{
                minimumWidth +=1;
            }
        }
        System.out.println(minimumWidth);



    }
}
