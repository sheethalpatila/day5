package com.avng;
import java.util.Scanner;
public class avenger {
    String name,power,weapon,planet;
    int age;
    Scanner sc=new Scanner(System.in);

    public void getDetails(){
        System.out.println("enter name of avenger");
        name=sc.nextLine();
        System.out.println(" enter age");
        age=sc.nextInt();
        System.out.println("enter weapon");
        weapon=sc.nextLine();
        System.out.println("enter power");
        power=sc.nextLine();
        System.out.println(" enter planet");
        planet=sc.nextLine();
    }
    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(power);
        System.out.println(weapon);
        System.out.println(planet);
    }
}
