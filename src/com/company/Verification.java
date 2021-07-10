package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Verification {
   private static ArrayList<Integer> numbers= new ArrayList<>();

   static {
      numbers.add(15);
      numbers.add(8);
      numbers.add(1);
      numbers.add(23);
      numbers.add(18);
      numbers.add(2);
   }
   public static void checkNumber(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Ввведите число");
      int num=sc.nextInt();
      boolean y=true;
      for (int i: numbers){
         if(num==i){
            System.out.println("Такое число присутствует!");
            y=false;
            break;
         }
      }
      if(y)
         System.out.println("Такого числа нет!");
   }
}
