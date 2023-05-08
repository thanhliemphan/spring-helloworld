package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account acc1 = (Account) context.getBean("account1");
        Account acc2 = (Account) context.getBean("account2");
        System.out.println("Data of Account 1: ");
        System.out.println("Id: "+acc1.getId());
        System.out.println("Name: "+acc1.getOwnerName());
        System.out.println("Balance: "+acc1.getBalance());
        System.out.println("Data of Account 2: ");
        System.out.println("Id: "+acc2.getId());
        System.out.println("Name: "+acc2.getOwnerName());
        System.out.println("Balance: "+acc2.getBalance());
    }
}