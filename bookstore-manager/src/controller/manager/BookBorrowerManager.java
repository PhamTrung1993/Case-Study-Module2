package controller.manager;

import storage.book.IReadWriteBook;
import storage.book.ReadWriteFileBook;

public class BookBorrowerManager {
    private static IReadWriteBook readfile = ReadWriteFileBook.getInstance();
}
