package login;

import func.PersonFunc;

import java.util.Scanner;

public class LoginSystem {
    private Scanner scan = new Scanner(System.in);

    PersonFunc personFunc = new PersonFunc();

    public void loginAdmin() {
        while (true) {
            System.out.println("İstifadəçi adı: ");
            String username = scan.nextLine();

            System.out.println("Parol: ");
            String password = scan.nextLine();

            if ("Gunay".equalsIgnoreCase(username) && "Gunay0221".equalsIgnoreCase(password)) {
                System.out.println("Admin səhifəsinə xoş gəlmisiniz!");

                class Admin {
                    public void accessAdmin() {
                        personFunc.addBook(scan);
                    }
                }
                Admin admin = new Admin();
                admin.accessAdmin();
                break;
            } else {
                System.out.println("Məlumatları düzgün daxil edin! Yenidən cəhd edin.");
            }
        }
    }
    public void loginUser() {
        class User {
            public void accessUser() {
                System.out.println("İstifadəçi səhifəsinə xoş gəlmisiniz!");

                while (true) {
                    System.out.println("1.Kitab axtar:" + "\n2.Yazıçıya görə axtar:" + "\n3.Janrına görə axtar:" + "\n4.Sistemdən çıxış..");
                    System.out.println("Seçiminizi daxil edin:");
                    int choice = scan.nextInt();
                    scan.nextLine();

                    switch (choice) {
                        case 1 -> personFunc.searchBookTitle(scan);
                        case 2 -> personFunc.searchAuthor(scan);
                        case 3 -> personFunc.searchGenre(scan);
                        case 4 -> {
                            System.out.println("Sistemdən çıxıldı...");
                            return;
                        }
                        default -> System.out.println("Yanlış əməliyyat..Təkrar sınayın!");
                    }
                }
            }
        }
        User user = new User();
        user.accessUser();
    }
}

