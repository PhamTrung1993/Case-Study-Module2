package view;

import controller.display.DisplayBook;
import controller.function.BookFunction;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> newbook = new ArrayList<>();
        DisplayBook displayBook = new DisplayBook();
        BookFunction bookFunction = new BookFunction();
        Book book = new Book("A0001","Science","Lion","Animal","Trung","New",15000,200000);
        newbook.add(book);
        System.out.println(newbook);
    }
    public static void mainMenu() {

    }
}
