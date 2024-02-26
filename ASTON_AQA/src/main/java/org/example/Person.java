package org.example;

class Person extends Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age);
    }
}