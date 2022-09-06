package controller.node;

import model.Book;

public class NodeBook {
    private Book info;
    private NodeBook next;

    public NodeBook(Book book) {
        this.info = new Book();
        next = null;
    }

    public Book getInfo() {
        return info;
    }

    public void setInfo(Book info) {
        this.info = info;
    }

    public NodeBook getNext() {
        return next;
    }

    public void setNext(NodeBook next) {
        this.next = next;
    }
}
