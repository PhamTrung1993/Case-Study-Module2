package controller.node;

import model.BookBorrower;

public class NodeBorrower {
    private BookBorrower info;
    private NodeBorrower next;

    public NodeBorrower() {
        this.info = new BookBorrower();
        next = null;
    }
    public NodeBorrower(BookBorrower info) {
        this.info = info;
    }

    public BookBorrower getInfo() {
        return info;
    }

    public void setInfo(BookBorrower info) {
        this.info = info;
    }

    public NodeBorrower getNext() {
        return next;
    }

    public void setNext(NodeBorrower next) {
        this.next = next;
    }
}
