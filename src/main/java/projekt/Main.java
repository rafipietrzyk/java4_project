package projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                int s=1;
        switch(s){
            case 1:
                System.out.println(0000);
                break;
            case 2:

        }

        logowanie();
    }

    private static void logowanie() {
        User admin = new User("bbb", "aaa",Role.ADMIN);
        User user1 = new User("aaa", "bbb",Role.USER);
        User user2 = new User("ccc", "ddd",Role.USER);
        User user3 = new User("eee", "fff",Role.USER);
        for(int i = 0; i < 1;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj login!");
            String login = scanner.nextLine();
            System.out.println("Podaj hasło!");
            String pass = scanner.nextLine();
            if (user1.getLogin().equals(login) && user1.getPass().equals(pass)) {
                System.out.println("Witaj, użytkowniku 1, jaką walutę chciałbyś kupić?");
            // kupno walut!

            } else if (user2.getLogin().equals(login) && user2.getPass().equals(pass)) {
                System.out.println("Witaj, użytkowniku 2, jaką walutę chciałbyś kupić?");
            // kupno walut
            } else if (user3.getLogin().equals(login) && user3.getPass().equals(pass)) {
                System.out.println("Witaj, użytkowniku 3, jaką walutę chciałbyś kupić?");
            // kupno walut
            } else if (admin.getLogin().equals(login) && admin.getPass().equals(pass)) {
                System.out.printf("Witaj Administratorze %s ! Oto rodzaje walut i ich kursy!", Role.ADMIN);
                // wszystkie kursy i waluty
            } else {
                System.out.println("Złe hasło lub login! Podaj jeszcze raz!");
            }
            i++;
        }
    }
}
