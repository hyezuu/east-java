package weeklyquiz3.book;

import weeklyquiz3.exception.EmptyStackException;

import java.util.Stack;

public class BookStack<T> {
    final private Stack<Book<T>> books;

    public BookStack() {
        this.books = new Stack<>();
    }

    public Stack<Book<T>> getBooks() {
        return books;
    }

    public void pushBook(Book<T> book) {
        this.books.push(book);
    }

    public Book<T> popBook() {
        if(this.books.isEmpty()) {
            throw new EmptyStackException("BookStack is empty");
        }
        return this.books.pop();
    }

    public Book<T> peekBook() {
        if(this.books.isEmpty()) {
            throw new EmptyStackException("BookStack is empty");
        }
        return this.books.peek();
    }

    public boolean isEmpty() {
        return this.books.isEmpty();
    }
}
