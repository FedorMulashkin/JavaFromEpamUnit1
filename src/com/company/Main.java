package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        String name = scan.nextLine();
        User user = new User(name);
        user.setPassword("qwerty");

        String password = scan.next();
        if(user.login(name, password)){
            user.greetings();
        } else {
            System.out.println("Invalid username or password");
        }
        */
        int len = scan.nextInt();
        RandomNumbers numbers = new RandomNumbers(len);
        numbers.writeNumbersInRow();
        //numbers.writeInColumn();
        System.out.println(numbers.countSum());
        System.out.println(numbers.countMultiplicity());
    }
}
