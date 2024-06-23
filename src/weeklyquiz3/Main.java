package weeklyquiz3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Book 객체 리스트 생성
        List<Book<String>> books = new ArrayList<>();
        books.add(new Book<>("Java Programming", "John Doe", "ISBN-1234"));
        books.add(new Book<>("Python Basics", "Jane Smith", "ISBN-5678"));
        books.add(new Book<>("JavaScript Essentials", "John Doe", "ISBN-9012"));

        // BookShelf 객체 생성
        BookShelf<String> bookShelf = new BookShelf<>(books);

        // 책 추가 예제
        Book<String> newBook = new Book<>("C++ Programming", "Alice Johnson", "ISBN-3456");
        bookShelf.addBook(newBook);
        System.out.println("Added book: " + newBook);

        // 책 검색 예제 - 제목으로 검색
        String searchTitle = "java";
        List<Book<String>> foundByTitle = bookShelf.searchByTitle(searchTitle);
        System.out.println("Books found by title '" + searchTitle + "':");
        printBooks(foundByTitle);

        // 책 검색 예제 - 저자로 검색
        String searchAuthor = "john";
        List<Book<String>> foundByAuthor = bookShelf.searchByAuthor(searchAuthor);
        System.out.println("Books found by author '" + searchAuthor + "':");
        printBooks(foundByAuthor);

        // 책 제거 예제
        bookShelf.removeBook(newBook);
        System.out.println("Removed book: " + newBook);
    }

    // 책 리스트 출력 메서드
    private static void printBooks(List<Book<String>> books) {
        for (Book<String> book : books) {
            System.out.println(book);
        }
        System.out.println(); // 빈 줄 추가
    }
}

