package weeklyquiz3;

import weeklyquiz3.book.Book;
import weeklyquiz3.book.BookShelf;
import weeklyquiz3.book.BookStack;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String 타입의 식별자를 사용하는 BookShelf 객체 생성
        BookShelf<String> bookShelf = new BookShelf<>(new ArrayList<>());

        // Integer 타입의 식별자를 사용하는 BookStack 객체 생성
        BookStack<Integer> bookStack = new BookStack<>();

        // 사용자로부터 도서 정보 입력 받기
        System.out.println("입력 할 도서 갯수를 입력하세요");
        System.out.print("도서 갯수: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            addBook(scanner, bookStack, bookShelf);
        }

        //현재 도서 목록
        System.out.println("-------------BookShelf-------------");
        for(Book book : bookShelf.getBooks()){
            System.out.println(book);
        }

        System.out.println("-------------BookStack-------------");
        for(Book book : bookStack.getBooks()){
            System.out.println(book);
        }




        // BookShelf에서 도서 제목과 저자로 검색하고 결과 출력
        System.out.println("검색할 도서 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("\nBookShelf에서 도서 제목과 저자로 검색 결과:");
        System.out.println("------------------------------------");
        for (Book<String> book : bookShelf.searchByTitle(title)) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }

        // BookStack에서 맨 위의 도서 확인하고 정보 출력 (peekBook)
        System.out.println("\nBookStack에서 맨 위의 도서 정보 확인:");
        System.out.println("------------------------------------");
        Book<Integer> topBook = bookStack.peekBook();
        System.out.println("도서 제목: " + topBook.getTitle());
        System.out.println("도서 저자: " + topBook.getAuthor());
        System.out.println("도서 식별자: " + topBook.getIdentifier());


        // BookStack에서 도서를 꺼내고 정보 출력 (popBook)
        System.out.println("\nBookStack에서 도서를 꺼내서 정보 출력:");
        System.out.println("------------------------------------");
        Book<Integer> poppedBook = bookStack.popBook();
        if (poppedBook != null) {
            System.out.println("도서 제목: " + poppedBook.getTitle());
            System.out.println("도서 저자: " + poppedBook.getAuthor());
            System.out.println("도서 식별자: " + poppedBook.getIdentifier());
        } else {
            System.out.println("BookStack이 비어있습니다.");
        }

        // BookStack이 비어있는지 확인하고 결과 출력 (isEmpty)
        System.out.println("\nBookStack이 비어있는지 확인:");
        System.out.println("------------------------------------");
        boolean isEmpty = bookStack.isEmpty();
        System.out.println("BookStack이 비어있습니까? " + (isEmpty ? "예" : "아니오"));

        scanner.close();
    }

    // 문자열이 정수로 변환 가능한지 확인하는 유틸리티 메서드
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void addBook(Scanner scanner, BookStack<Integer> bookStack, BookShelf<String> bookShelf) {
        System.out.println("도서 정보를 입력하세요.");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("식별자 (String 타입 - BookShelf, Integer 타입 - BookStack): ");
        String identifierInput = scanner.nextLine();

        // Book 객체 생성
        if (isInteger(identifierInput)) {
            // BookStack에 Integer 타입의 식별자로 추가
            Integer identifier = Integer.parseInt(identifierInput);
            Book<Integer> book = new Book<>(title, author, identifier);
            bookStack.pushBook(book);
        } else {
            // BookShelf에 String 타입의 식별자로 추가
            String identifier = identifierInput;
            Book<String> book = new Book<>(title, author, identifier);
            bookShelf.addBook(book);
        }
    }
}
