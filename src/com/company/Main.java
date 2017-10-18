package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Person person = new Person();

        System.out.println("Enter person's first name:");
        person.setFirstName(keyboard.nextLine());
        System.out.print("You entered"+" "+person.getFirstName()+" "+"as the person's first name");
        System.out.println("");
        System.out.println("Enter person's last name:");
        person.setLastName(keyboard.nextLine());
        System.out.print("You entered" +" "+person.getLastName()+" "+"as the person's last name");
        System.out.println("");
        System.out.println("Enter the person's address:");
        person.setAddress(keyboard.nextLine());
        System.out.print("You entered"+ " " +person.getAddress()+" "+"as the person's address");
        System.out.println("");
        System.out.println("Enter the person's phone number:");
        person.setPhoneNumber(keyboard.nextLine());
        System.out.print("You entered"+ " "+person.getPhoneNumber()+" "+"as the person's phone number");
        System.out.println("");
        System.out.println("Enter the person's email address");
        person.setEmail(keyboard.nextLine());
        System.out.print("You entered"+ " "+person.getEmail()+" "+"as the person's email address");


    }
}
