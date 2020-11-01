package com.avng;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sum;
        Scanner sc = new Scanner(System.in);

        int[] no = new int[5];

        System.out.println("enter the no");
        no[0] = sc.nextInt();

        System.out.println("enter the no");
        no[1] = sc.nextInt();

        System.out.println("enter the no");
        no[2] = sc.nextInt();

        System.out.println("enter the no");
        no[3] = sc.nextInt();

        System.out.println("enter the no");
        no[4] = sc.nextInt();

        sum=no[0]+no[1]+no[2]+no[3]+no[4];

        System.out.println("the sum of the all the numbers is:- "+sum);
    }
}