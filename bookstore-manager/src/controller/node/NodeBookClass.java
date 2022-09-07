package controller.node;


import model.BookClass;

public class NodeBookClass {
    private BookClass info;
    private NodeBookClass next;
    public NodeBookClass() {
        this.info = new BookClass();
        next = null;
    }
    public NodeBookClass(BookClass info) {
        this.info = info;
    }

    public BookClass getInfo() {
        return info;
    }

    public void setInfo(BookClass info) {
        this.info = info;
    }

    public NodeBookClass getNext() {
        return next;
    }

    public void setNext(NodeBookClass next) {
        this.next = next;
    }
}
