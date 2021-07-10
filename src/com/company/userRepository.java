package com.company;

import java.util.ArrayList;

public class userRepository {
    static ArrayList<User> list=new ArrayList<>();

    public  static ArrayList<User> dataBase(){
        return list;
    }
    static {
        list.add(new User(111, "Alex"));
        list.add(new User(112, "Nick"));
        list.add(new User(113, "Brad"));
        list.add(new User(114, "Mike"));
        list.add(new User(115, "David"));
    }
}
