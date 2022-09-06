package controller.controller;

import controller.node.NodeBook;
import model.Book;

public class BookController {
    NodeBook head,tail;

    public BookController() {
        this.head = null;
        this.tail = null;
    }

    public NodeBook getHead() {
        return head;
    }

    public NodeBook getTail() {
        return tail;
    }

    public void insertHead(Book book) {
        NodeBook newNode = new NodeBook(book);
        if (head == null) {
            head = tail = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void insertTail(Book book) {
        NodeBook newNode = new NodeBook(book);
        if (head == null) {
            head = tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public void removeNode(NodeBook nodeBook) {
        NodeBook intermediary = head;
        NodeBook input = intermediary;
        while (intermediary != null) {
            if (intermediary == nodeBook) {
                break;
            } else {
                input = intermediary;
                intermediary = intermediary.getNext();
            }
        }
        // Nếu node ở đầu danh sách.
        if (intermediary == head) {
            head = head.getNext();
        }
        //Nếu node ở cuối danh sách.
        else {
            if (intermediary.getNext() == null) {
                input = null;
            } else {
                input.setNext(input.getNext());
            }
        }
    }
    public void sortByName() {
        Book book;
        String name1;
        String name2;
        if (head == null) {return;}
        NodeBook intermediary = head;
        NodeBook point;
        while (intermediary.getNext() != null) {
            point = intermediary.getNext();
            name1 = intermediary.getInfo().getBookName().split(" ")[intermediary.getInfo().getBookName().split(" ").length-1];
            while (point != null) {
                name2 = point.getInfo().getBookName().split(" ")[intermediary.getInfo().getBookName().split(" ").length-1];
                if (name1.compareToIgnoreCase(name2) > 0) {
                    name1 = name2;
                    book = intermediary.getInfo();
                    intermediary.setInfo(point.getInfo());
                    point.setInfo(book);
                }
                point = point.getNext();
            }
        }
    }
}
