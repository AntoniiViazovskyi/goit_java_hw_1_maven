package org.goit.mypackage;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Antonii","Viazovskyi");
        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
    }
}