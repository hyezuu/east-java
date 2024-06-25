package weeklyquiz3;

import weeklyquiz3.book.Book;
import weeklyquiz3.book.BookShelf;
import weeklyquiz3.book.BookStack;

import java.util.ArrayList;
import java.util.EmptyStackException;
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

        //BookShelf 에서 도서 제목으로 검색하고 결과 출력
        BookShelfProcessor.searchByTitle(scanner, bookShelf);

        //BookShelf 에서 저자 명으로 검색하고 결과 출력
        BookShelfProcessor.searchByAuthor(scanner, bookShelf);

        // BookShelf 에서 도서를 검색 후 삭제(추가 구현)
        BookShelfProcessor.deleteBookByTitle(scanner, bookShelf);

        // BookStack 에서 도서를 꺼내고 정보 출력 (popBook)
        BookStackProcessor.printPoppedBook(bookStack);

        // BookStack 에서 맨 위의 도서 확인하고 정보 출력 (peekBook)
        BookStackProcessor.printPeekedBook(bookStack);

        // BookStack 이 비어있는지 확인하고 결과 출력 (isEmpty)
        BookStackProcessor.printStackIsEmpty(bookStack);

        scanner.close();
    }

    //도서 갯수 입력값이 유효한지 확인
    private static int getValidBookCount(Scanner scanner) {
        while (true) {
            System.out.println("입력 할 도서 갯수를 입력하세요");
            System.out.print("도서 갯수: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요");
            }
        }
    }

    //도서 정보를 입력받아 BookStack 또는 BookShelf 에 추가
    private static void addBook(Scanner scanner, BookStack<Integer> bookStack, BookShelf<String> bookShelf) {
        System.out.println("도서 정보를 입력하세요.");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("식별자 (String 타입 - BookShelf, Integer 타입 - BookStack): ");
        String identifierInput = scanner.nextLine();

        // Book 인스턴스 생성 및 추가
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
    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // BookStack 의 기능을 담은 이너클래스
    private static class BookStackProcessor {
        static void printBookStack(BookStack<Integer> bookStack) {
            System.out.println("-------------BookStack-------------");
            for (Book<Integer> book : bookStack.getBooks()) {
                System.out.println(book);
            }
        }

        static void printPeekedBook(BookStack<Integer> bookStack) {
            System.out.println("\nBookStack 에서 맨 위의 도서 정보 확인:");
            System.out.println("------------------------------------");
            try {
                Book<Integer> topBook = bookStack.peekBook();
                printBookInformation(topBook);
            } catch (EmptyStackException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }

        static void printPoppedBook(BookStack<Integer> bookStack) {
            System.out.println("\nBookStack 에서 도서를 꺼내서 정보 출력:");
            System.out.println("------------------------------------");
            try {
                Book<Integer> poppedBook = bookStack.popBook();
                printBookInformation(poppedBook);
            } catch (EmptyStackException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }

        private static void printBookInformation(Book<Integer> book) {
            System.out.println("도서 제목: " + book.getTitle());
            System.out.println("도서 저자: " + book.getAuthor());
            System.out.println("도서 식별자: " + book.getIdentifier());
        }

        static void printStackIsEmpty(BookStack<Integer> bookStack) {
            System.out.println("\nBookStack 이 비어있는지 확인:");
            System.out.println("------------------------------------");
            boolean isEmpty = bookStack.isEmpty();
            System.out.println("BookStack 이 비어있습니까? " + (isEmpty ? "예" : "아니오"));
            System.out.println();
        }
    }

    // BookShelf 의 기능을 담은 이너클래스
    private static class BookShelfProcessor {
        static void printBookShelf(BookShelf<String> bookShelf) {
            System.out.println("-------------BookShelf-------------");
            for (Book<String> book : bookShelf.getBooks()) {
                System.out.println(book);
            }
        }

        //제목 또는 저자 검색 선택지 제공 (추가 구현)
        static void searchBooks(Scanner scanner, BookShelf<String> bookShelf) {
            System.out.println("제목으로 검색 하시려면 1 , 저자로 검색하시려면 2를 입력해주세요. (기본값 : 제목)");
            String type = scanner.nextLine();

            if (type.equals("2")) {
                searchByAuthor(scanner, bookShelf);
            } else {
                searchByTitle(scanner, bookShelf);
            }
            System.out.println();
        }

        private static void searchByTitle(Scanner scanner, BookShelf<String> bookShelf) {
            String title = printPromptToSearch(scanner, "도서 제목", "검색");
            for (Book<String> book : bookShelf.searchByTitle(title)) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }
            System.out.println();
        }

        private static void searchByAuthor(Scanner scanner, BookShelf<String> bookShelf) {
            String author = printPromptToSearch(scanner, "저자 명", "검색");
            for (Book<String> book : bookShelf.searchByAuthor(author)) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }
            System.out.println();
        }

        // 도서를 제목으로 검색하고 삭제하는 메서드
        static void deleteBookByTitle(Scanner scanner, BookShelf<String> bookShelf) {
            String title = printPromptToSearch(scanner, "도서 제목", "삭제");
            int idx = 0;
            ArrayList<Book<String>> booksToDelete = new ArrayList<>();
            for (Book<String> book : bookShelf.searchByTitle(title)) {
                System.out.printf("%d. ", idx++);
                System.out.println(book);
                booksToDelete.add(book);
            }

            if (!booksToDelete.isEmpty()) {
                System.out.println("삭제할 도서의 인덱스를 입력하세요 (0부터 시작)");
                int index = Integer.parseInt(scanner.nextLine());
                if (index >= 0 && index < booksToDelete.size()) {
                    Book<String> bookToDelete = booksToDelete.get(index);
                    bookShelf.removeBook(bookToDelete);
                    System.out.println("도서가 삭제되었습니다: " + bookToDelete);
                } else {
                    System.out.println("유효한 인덱스를 입력하세요.");
                }
            } else {
                System.out.println("삭제할 도서를 찾을 수 없습니다.");
            }
            System.out.println();
        }

        private static String printPromptToSearch(Scanner scanner, String searchType, String purpose) {
            System.out.print(purpose + "할 " + searchType + "을 입력해 주세요 : ");
            String word = scanner.nextLine();
            System.out.println("\nBookShelf 에서 " + searchType + "으로 검색 결과:");
            System.out.println("------------------------------------");
            return word;
        }
    }
}
