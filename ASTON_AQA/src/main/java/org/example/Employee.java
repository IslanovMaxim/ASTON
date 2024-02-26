package org.example;

public class Employee {
    public static void main(String[] args) {
        Person[] newPerson = new Person [5];
        newPerson[0] = new Person ("Ivanov Ivan", "Engineer", "ivanov@mailbox.com", "892312312",50000,41);
        newPerson[1] = new Person("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",50000,32);
        newPerson[2] = new Person("Maximov Maxim", "Guard", "maximov@mailbox.com", "892312315",10000,43);
        newPerson[3] = new Person("Sergeev Sergey", "Hacker", "sergeev@mailbox.com", "892312316",5000,18);
        newPerson[4] = new Person("Nadezhdina Nadezhda", "Manager", "nadezhdina@mailbox.com", "892312317",3000,21);
        for (Person Person : newPerson)
            System.out.println(Person);
    }
}

