package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> terry = new ArrayList<>();


        Person tank = new Person();
        System.out.println("What is your First name ? : ");
        tank.setFirstName(keyboard.nextLine());

        System.out.println("What is your Last Name ? : ");
        tank.setLastName(keyboard.nextLine());

        System.out.println("What is your Phone Number ? : ");
        tank.setPhoneNumber(keyboard.nextLine());

        System.out.println("What is you Email Address ? : ");
        tank.setEmailAddress(keyboard.nextLine());
        terry.add(tank);

//        for (Person eachterry :terry){

            System.out.println("////FIRST NAME AND LAST NAME////");
            System.out.println("It is great to meet you : "+" "+tank.getFirstName()+" "+tank.getLastName());
            System.out.println("///FIRST NAME///");
            System.out.println("Can I call you "+" "+tank.getFirstName()+ "?");
            System.out.println("//PHONE NUMBER AND EMAIL ADDRESS//");
            System.out.println("This is your Phone Number : "+" "+tank.getPhoneNumber()+" "+"; And this is your Email Address: "+" "+tank.getEmailAddress());

//        }




    }
}
