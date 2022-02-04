package com.company.Uppgift1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {

    private String name;
    private String gender;
    private double salary;

    public Person(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return
                "Name = " + name +
                ", Gender = " + gender +
                ", salary = " + salary;
    }

}

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(
                List.of(new Person("Greta", "Kvinna", 33000 ),
                        new Person("Kevin", "Man", 36000 ),
                        new Person("Göran", "Man", 43000 ),
                        new Person("Bertil", "Man", 23050 ),
                        new Person("Alexandra", "Kvinna", 63000 ),
                        new Person("Hjalmar", "Man", 53500 ),
                        new Person("Sigurd", "Kvinna", 18900 ),
                        new Person("Freja", "Kvinna", 45000 ),
                        new Person("Hera", "Kvinna", 91000 ),
                        new Person("Oden", "Man", 84000 ))
        );

        System.out.println(
            personList
                .stream()
                .filter(gen -> gen.getGender().equals("Kvinna"))
                .mapToDouble(Person::getSalary)
                .summaryStatistics()
                .getAverage()
        );

        System.out.println(
                personList
                        .stream()
                        .filter(gen -> gen.getGender().equals("Man"))
                        .mapToDouble(Person::getSalary)
                        .summaryStatistics()
                        .getAverage()
        );

        System.out.println(
                personList
                        .stream()
                        .max(Comparator.comparing(Person::getSalary))
                        .orElseThrow()
        );

        System.out.println(
                personList
                        .stream()
                        .min(Comparator.comparing(Person::getSalary))
                        .orElseThrow()
        );
    }
}
