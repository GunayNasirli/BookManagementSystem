package library;

public class Library {

    public static class Book {
        private static int idCounter=1;
        private int id;
        private String bookTitle;
        private String author;
        private String genre;

        public Book(String title, String author, String genre) {
            this.id = idCounter++;
            this.bookTitle = title;
            this.author = author;
            this.genre = genre;
        }

        public int getId() {
            return id;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public String getAuthor() {
            return author;
        }

        public String getGenre() {
            return genre;
        }

        @Override
        public String toString() {
            return "Kitab ID: " + id + " | Kitab: " + bookTitle + " | Müəllif: " + author + " | Janr: " + genre;
        }
    }
}

