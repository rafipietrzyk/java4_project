package projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        display();
    }

    private static void display() {
        User admin = new User("bbb", "aaa",Role.ADMIN);
        User user1 = new User("aaa", "bbb",Role.USER);
        User user2 = new User("ccc", "ddd",Role.USER);
        User user3 = new User("eee", "fff",Role.USER);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login!");
        String login = scanner.nextLine();
        System.out.println("Podaj hasło!");
        String pass = scanner.nextLine();
        if(user1.getLogin().equals(login) && user1.getPass().equals(pass)){
            System.out.println("Witaj, użytkowniku 1");
        }
    }
}
