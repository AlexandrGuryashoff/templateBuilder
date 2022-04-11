package com.company;

public class Main {

    public static void main(String[] args) {
	Person mom = new PersonBuilder()
            .setName("Anna")
            .setSurname("Volf")
            .setAge(31)
            .setAddress("Sidney")
            .build();
    Person son = mom.newChildBuilder()
            .setName("Antoshka")
            .build();
    System.out.println("U " + mom + " est syn, " + son);

    try{
        new PersonBuilder().build();
    } catch (IllegalStateException e){
        e.printStackTrace();
    }

    try {
        new PersonBuilder().setAge(-100).build();
    } catch (IllegalArgumentException e){
    e.printStackTrace();
    }
    }
}
