package weeklyquiz3;

import weeklyquiz3.book.Book;
import weeklyquiz3.book.BookShelf;
import weeklyquiz3.book.BookStack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String 타입의 식별자를 사용하는 BookShelf 객체 생성
        BookShelf<String> bookShelf = new BookShelf<>(new ArrayList<>());

        // Integer 타입의 식별자를 사용하는 BookStack 객체 생성
        BookStack<Integer> bookStack = new BookStack<>();

        // 사용자로부터 도서 정보 입력 받기
        int n = getValidBookCount(scanner);

        for (int i = 0; i < n; i++) {
            //입력 받은 값들로 새로운 book 객체를 bookShelf 또는 bookStack 에 담는 메서드
            addBook(scanner, bookStack, bookShelf);
        }
        System.out.println();

        //bookShelf 의 현재 도서 목록
        BookShelfProcessor.printBookShelf(bookShelf);
        System.out.println();

        //bookStack 의 현재 도서 목록
        BookStackProcessor.printBookStack(bookStack);
        System.out.println();

        // BookShelf에서 도서 제목과 저자로 검색하고 결과 출력
        BookShelfProcessor.searchBooks(scanner, bookShelf);

        // BookStack에서 맨 위의 도서 확인하고 정보 출력 (peekBook)
        BookStackProcessor.printPeekedBook(bookStack);

        // BookStack에서 도서를 꺼내고 정보 출력 (popBook)
        BookStackProcessor.printPoppedBook(bookStack);

        // BookStack이 비어있는지 확인하고 결과 출력 (isEmpty)
        BookStackProcessor.printStackIsEmpty(bookStack);


        scanner.close();
    }

    private static int getValidBookCount(Scanner scanner) {
        while(true){
            System.out.println("입력 할 도서 갯수를 입력하세요");
            System.out.print("도서 갯수");
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("유효한 숫자를 입력하세요");
            }
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
            Book<String> book = new Book<>(title, author, identifierInput);
            bookShelf.addBook(book);
        }
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

    private static class BookStackProcessor {
        static void printBookStack(BookStack<Integer> bookStack) {
            System.out.println("-------------BookStack-------------");
            for (Book book : bookStack.getBooks()) {
                System.out.println(book);
            }
        }

        static void printPeekedBook(BookStack<Integer> bookStack) {
            System.out.println("\nBookStack에서 맨 위의 도서 정보 확인:");
            System.out.println("------------------------------------");
            Book<Integer> topBook = bookStack.peekBook();
            System.out.println("도서 제목: " + topBook.getTitle());
            System.out.println("도서 저자: " + topBook.getAuthor());
            System.out.println("도서 식별자: " + topBook.getIdentifier());
        }

        static void printPoppedBook(BookStack<Integer> bookStack) {
            System.out.println("\nBookStack에서 도서를 꺼내서 정보 출력:");
            System.out.println("------------------------------------");
            Book<Integer> poppedBook = bookStack.popBook();
            System.out.println("도서 제목: " + poppedBook.getTitle());
            System.out.println("도서 저자: " + poppedBook.getAuthor());
            System.out.println("도서 식별자: " + poppedBook.getIdentifier());
        }

        static void printStackIsEmpty(BookStack<Integer> bookStack) {
            System.out.println("\nBookStack이 비어있는지 확인:");
            System.out.println("------------------------------------");
            boolean isEmpty = bookStack.isEmpty();
            System.out.println("BookStack이 비어있습니까? " + (isEmpty ? "예" : "아니오"));
        }
    }

    private static class BookShelfProcessor {
        static void printBookShelf(BookShelf<String> bookShelf) {
            System.out.println("-------------BookShelf-------------");
            for (Book book : bookShelf.getBooks()) {
                System.out.println(book);
            }
        }
        static void searchBooks(Scanner scanner, BookShelf<String> bookShelf) {
            System.out.println("제목으로 검색 하시려면 1 , 저자로 검색하시려면 2를 입력해주세요. (기본값 : 제목)");
            String type = scanner.nextLine();

            if (type.equals("2")) {
                searchByAuthor(scanner, bookShelf);
            }
            else searchByTitle(scanner, bookShelf);
        }

        private static void searchByTitle(Scanner scanner, BookShelf<String> bookShelf) {
            System.out.println("검색할 도서 제목을 입력하세요");
            String title = scanner.nextLine();
            System.out.println("\nBookShelf에서 도서 제목과 저자로 검색 결과:");
            System.out.println("------------------------------------");
            for (Book<String> book : bookShelf.searchByTitle(title)) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }
        }

        private static void searchByAuthor(Scanner scanner, BookShelf<String> bookShelf) {
            System.out.println("검색할 저자 명을 입력하세요");
            String author = scanner.nextLine();
            System.out.println("\nBookShelf에서 저자로 검색 결과:");
            System.out.println("------------------------------------");
            for (Book<String> book : bookShelf.searchByAuthor(author)) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }
        }
    }
}
