package projekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewMenu {
    public NewMenu() {
                System.out.println("Glowne menu:");
        System.out.println("Zaloguj - 1\nWyloguj - 2\nSprawdz stan - 3\nZakonczenie programu - 0");
        Scanner scanner1 = new Scanner(System.in);
        int s = scanner1.nextInt();
        do {
            //System.out.println("Zaloguj - 1\nWyloguj - 2\nSprawdz stan - 3\nZakonczenie programu - 0");

            switch (s) {
                case 1:
                    zaloguj();
                    break;
                case 2:
                    wyloguj();
                    break;
                case 3:
                    sprawdzStan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("złe dane");
            }
        } while (s != 0);
    }

    public void zaloguj(){
            User admin = new User("bbb", "aaa", Role.ADMIN);
            User user1 = new User("aaa", "bbb", Role.USER);
            User user2 = new User("ccc", "ddd", Role.USER);
            User user3 = new User("eee", "fff", Role.USER);

            List<User> lista = new ArrayList<User>();

            lista.add(admin);
            lista.add(user1);
            lista.add(user2);
            lista.add(user3);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj login!");
            String login = scanner.nextLine();
            System.out.println("Podaj hasło!");
            String pass = scanner.nextLine();

            boolean czyZalogowano = false;

            for (User user : lista) {

                if (user.getLogin().equals(login) && user.getPass().equals(pass)) {
                    System.out.println("dane poprawne");
                    czyZalogowano = true;
                    break;
                }
            }

            if(czyZalogowano){
                new NewMenu();
            }
            else {
                System.out.println("Bledne dane");
            }

    }

    public void wyloguj(){
        

    }

    public void sprawdzStan(){

    }

}
