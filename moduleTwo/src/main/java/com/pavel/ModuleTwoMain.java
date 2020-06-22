package com.pavel;

import java.util.List;

public class ModuleTwoMain {
    public static void main(String[] args) {
        System.out.println("Start...");
        PersonService personService = new PersonService();
        List<Person> persons = personService.getPersons();
    }
}
