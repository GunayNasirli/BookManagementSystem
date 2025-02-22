import login.LoginSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Admin giriş" + "\n2.İstifadəçi giriş" + "\n3.Menudan çıxış");
            System.out.print("Seçim edin: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> loginSystem.loginAdmin();
                case 2 -> loginSystem.loginUser();
                case 3 -> {
                    System.out.println("Menudan çıxıldı.");
                    return;
                }
                default -> System.out.println("Yanlış seçim!");

            }
        }
    }
}