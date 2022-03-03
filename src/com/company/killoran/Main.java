package com.company.killoran;

import java.util.HashMap;
import java.util.Scanner;

class AddressBook {
    static Scanner input = new Scanner(System.in);
    private static String email;
    private static HashMap<Integer, Person> adresses = new HashMap<>();
    private static int i = 0;
    private static String inputs = "";

    public static void main(String[] args) {
        while (!inputs.equals("exit")) {
            System.out.println("1 to add a person 2 to find email");
            inputs = input.nextLine();
            if (inputs.equals("1")) {
                add_person();
            }
            if (inputs.equals("2")) {
                find_person();
                //new commentafsdasdfsdfsd
            }
        }
    }

    static void add_person() {
        i = i + 1;
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        System.out.println("Enter a email for " + name + " or end to exit: ");
        email = input.nextLine();
        Person person = new Person(name, email);
        adresses.put(i, person);
    }

    static void find_person() {
        System.out.println("Enter a name");
        String name = input.nextLine();
        for (int j = 1; j < adresses.size() + 1; j++) {
            Person person_test = adresses.get(j);
            if (name.equals(person_test.getName())) {
                System.out.println("The email of " + person_test.getName() + " Is " + person_test.getEmail());
            }
        }
    }
}
