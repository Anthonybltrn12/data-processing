package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porgram {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Jane", "Smith", 30));
        people.add(new Person("Michael", "Johnson", 28));
        people.add(new Person("Emily", "Davis", 22));
        people.add(new Person("Chris", "Brown", 35));
        people.add(new Person("Sarah", "Wilson", 27));
        people.add(new Person("Daniel", "Miller", 40));
        people.add(new Person("Laura", "Taylor", 19));
        people.add(new Person("Daniel", "Anderson", 33));
        people.add(new Person("Sophia", "Thomas", 24));

        Scanner theScanner = new Scanner(System.in);
        System.out.println("Search for a first name:");
        String userName = theScanner.nextLine();
        //instaniating new list
        List<Person> newList = new ArrayList<>();
        //going through oiriginal list to see if any of them match user input
        for(Person person : people){
            if(userName.equalsIgnoreCase(person.getFirstName())){
                //adding the person that matches to a new list
                newList.add(person);
            }
        }
        //displaying names of new list
        for(Person person : newList){
            System.out.println(person.getFirstName());
        }
        //loop through list to get the ages and average them out
        int sum = 0;
        for(Person person : people){
            sum += person.getAge();
        }
        int average = sum / people.size();
        System.out.println(average);

        //finding oldest person
        Person oldestPerson = people.get(0);
        for(Person person : people){

            if(person.getAge() > oldestPerson.getAge()){
                oldestPerson = person;
            }
        }
        System.out.println(oldestPerson.getFirstName());

        //finding the youngest person on the list
        Person youngestPerson = people.get(0);
        for(Person person : people){

            if(person.getAge() < youngestPerson.getAge()){
                youngestPerson = person;
            }
        }
        System.out.println(youngestPerson.getFirstName());

    }
}
