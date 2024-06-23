package weeklyquiz3;

import java.util.Stack;

public class BookStack<T> {
    final private Stack<Book<T>> books;

    public BookStack() {
        this.books = new Stack<>();
    }

    public void pushBook(Book<T> book) {
        this.books.push(book);
    }

    public Book<T> popBook() {
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
