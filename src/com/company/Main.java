package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Person person = new Person();

        System.out.println("Enter person's first name:");
        person.setFirstName(keyboard.nextLine());
        System.out.print("You entered"+" "+person.getFirstName()+" "+"as the person's name");



    }
}
