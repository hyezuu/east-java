package weeklyquiz3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookShelf<T> implements BookManager<T> {
    private final List<Book<T>> books;

    public BookShelf(List<Book<T>> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book<T> book) {
        books.remove(book);
    }

    @Override
    public List<Book<T>> searchByTitle(String title) {
        return searchBooks(book ->
                book.getTitle().equalsIgnoreCase(title) ||
                        book.getTitle().toLowerCase().contains(title.toLowerCase())
        );
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        return searchBooks(book ->
                book.getAuthor().equalsIgnoreCase(author) ||
                        book.getAuthor().toLowerCase().contains(author.toLowerCase())
        );
    }

    public List<Book<T>> searchBooks(Predicate<Book<T>> condition) {
        return books.stream().filter(condition).toList();
    }
}
