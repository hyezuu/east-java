package weeklyquiz3;

import weeklyquiz3.book.Book;
import weeklyquiz3.book.BookShelf;
import weeklyquiz3.book.BookStack;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // BookShelf 객체 생성
        BookShelf<String> bookShelf = createBookShelfStub();

        // BookStack 객체 생성
        BookStack<Integer> bookStack = createBookStackStub();

        // 현재 도서 목록 출력
        displayBookShelf(bookShelf);
        displayBookStack(bookStack);

        // BookShelf에서 도서 제목과 저자로 검색하고 결과 출력
        String searchTitle = "Harry Potter"; // 검색할 도서 제목
        String searchAuthor = "J.K. Rowling"; // 검색할 저자 명

        System.out.println("\nBookShelf에서 도서 제목으로 '" + searchTitle + "' 검색 결과:");
        List<Book<String>> foundByTitle = bookShelf.searchByTitle(searchTitle);
        displayBooks(foundByTitle);

        System.out.println("\nBookShelf에서 저자로 '" + searchAuthor + "' 검색 결과:");
        List<Book<String>> foundByAuthor = bookShelf.searchByAuthor(searchAuthor);
        displayBooks(foundByAuthor);

        // BookStack에서 맨 위의 도서 확인하고 정보 출력 (peekBook)
        System.out.println("\nBookStack에서 맨 위의 도서 정보 확인:");
        Book<Integer> topBook = bookStack.peekBook();
        System.out.println("도서 제목: " + topBook.getTitle());
        System.out.println("도서 저자: " + topBook.getAuthor());
        System.out.println("도서 식별자: " + topBook.getIdentifier());

        // BookStack에서 도서를 꺼내고 정보 출력 (popBook)
        System.out.println("\nBookStack에서 도서를 꺼내서 정보 출력:");
        Book<Integer> poppedBook = bookStack.popBook();
        System.out.println("도서 제목: " + poppedBook.getTitle());
        System.out.println("도서 저자: " + poppedBook.getAuthor());
        System.out.println("도서 식별자: " + poppedBook.getIdentifier());

        // BookStack이 비어있는지 확인하고 결과 출력 (isEmpty)
        System.out.println("\nBookStack이 비어있는지 확인:");
        boolean isEmpty = bookStack.isEmpty();
        System.out.println("BookStack이 비어있습니까? " + (isEmpty ? "예" : "아니오"));
    }

    // BookShelf 스텁 데이터 생성 메서드
    private static BookShelf<String> createBookShelfStub() {
        List<Book<String>> books = new ArrayList<>();
        books.add(new Book<>("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "HP001"));
        books.add(new Book<>("The Hobbit", "J.R.R. Tolkien", "TH001"));
        books.add(new Book<>("To Kill a Mockingbird", "Harper Lee", "TK001"));

        return new BookShelf<>(books);
    }

    // BookStack 스텁 데이터 생성 메서드
    private static BookStack<Integer> createBookStackStub() {
        BookStack<Integer> bookStack = new BookStack<>();
        bookStack.pushBook(new Book<>("1984", "George Orwell", 1984));
        bookStack.pushBook(new Book<>("The Catcher in the Rye", "J.D. Salinger", 12345));
        bookStack.pushBook(new Book<>("Pride and Prejudice", "Jane Austen", 67890));

        return bookStack;
    }

    // BookShelf의 도서 목록을 출력하는 메서드
    private static void displayBookShelf(BookShelf<String> bookShelf) {
        System.out.println("-------------BookShelf-------------");
        for (Book<String> book : bookShelf.getBooks()) {
            System.out.println(book);
        }
    }

    // BookStack의 도서 목록을 출력하는 메서드
    private static void displayBookStack(BookStack<Integer> bookStack) {
        System.out.println("-------------BookStack-------------");
        for (Book<Integer> book : bookStack.getBooks()) {
            System.out.println(book);
        }
    }

    // 도서 목록을 출력하는 메서드
    private static void displayBooks(List<Book<String>> books) {
        for (Book<String> book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
}

