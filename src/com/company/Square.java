package com.company;

import java.util.Scanner;

public class Square {
    public static void perimeter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ведите длину");
        int x=sc.nextInt();
        System.out.println("Введите ширину");
        int y= sc.nextInt();
        System.out.println("Периметр равен "+ (x+y)*2);
    }
}
