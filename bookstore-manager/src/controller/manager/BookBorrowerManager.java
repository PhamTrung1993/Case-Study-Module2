package controller.manager;


import storage.book.ReadWriteFileBook;
import storage.bookborrower.IReadWriteBorrower;
import storage.bookborrower.ReadWriteFileBorrower;

public class BookBorrowerManager {
    private static IReadWriteBorrower readfile = ReadWriteFileBorrower.getInstance();

}
