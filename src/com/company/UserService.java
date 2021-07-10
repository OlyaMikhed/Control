package com.company;

import java.util.Scanner;

public class UserService {

    public static void checkUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите имя");
        String nameUser=sc.next();
        boolean y=true;
        for(User i: userRepository.dataBase()){
            if(nameUser.equals(i.getName())){
                System.out.println("Такой пользователь существует");
                System.out.println(i);
                y=false;
                break;
            }
        }
        if(y)
            System.out.println("Такого пользователя нет");
    }
}
