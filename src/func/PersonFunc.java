package func;

import library.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonFunc {
    private List<Library.Book> books = new ArrayList<>();

    public void addBook(Scanner scan) {
        System.out.println("Yazıçı adını daxil edin:");
        String authorName = scan.nextLine();
        System.out.println("Kitab adını daxil edin:");
        String bookName = scan.nextLine();
        System.out.println("Janrı daxil edin:");
        String genre = scan.nextLine();

        Library.Book book = new Library.Book(bookName, authorName, genre);
        books.add(book);


        System.out.println("Kitab əlavə olundu: " + book);
    }

    public void searchBookTitle(Scanner scan) {
        System.out.println("Axtarılacaq kitabın adını daxil edin:");
        String title = scan.nextLine();
        System.out.println("Axtarılacaq kitabın ID-sini daxil edin");
        String idInput = scan.nextLine();

        boolean found = false;

        Integer id = null;
        if (!idInput.isEmpty()) {

            try {
                id = Integer.parseInt(idInput);
            } catch (NumberFormatException e) {
                System.out.println("ID-ni rəqəmlə daxil edin!");
                return;
            }
        }
        for (Library.Book book : books) {
            boolean bookTitle = title.isEmpty() || book.getBookTitle().equalsIgnoreCase(title);
            boolean bookId = id == null || book.getId() == id;

            if (bookTitle && bookId) {
                System.out.println("Axtardığınız kitab tapıldı: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Axtardığınız kitab mövcud deyil.");
        }
    }

    public void searchAuthor(Scanner scan) {
        System.out.println("Axtarılacaq yazıçının adını daxil edin:");
        String author = scan.nextLine();
        boolean found = false;

        for (Library.Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Axtardığınız yazıçı tapıldı: " + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Axtardığınız yazıçı mövcud deyil.");
        }
    }

    public void searchGenre(Scanner scan) {
        System.out.println("Axtarılacaq janrı daxil edin:");
        String genre = scan.nextLine();
        boolean found = false;

        for (Library.Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("Axtardığınız janrda kitab tapıldı: " + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Axtardığınız janrda kitab mövcud deyil.");
        }
    }
}
