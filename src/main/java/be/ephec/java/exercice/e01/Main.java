package be.ephec.java.exercice.e01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Person p1 = new Person();
                System.out.println("Veuillez entrer votre nom :");
                p1.firstName = sc.nextLine();
                System.out.println("Veuillez entrer votre prénom");
                p1.lastName = sc.nextLine();
                System.out.println("Veuillez entrer votre âge");
                p1.age = sc.nextInt();

                p1.display();
    }
}
