package controller.node;

import model.BookLoanVoucher;

public class NodeBookLoanVoucher {
   private BookLoanVoucher info;
   private NodeBookLoanVoucher next;

   public NodeBookLoanVoucher() {
       this.info = new BookLoanVoucher();
       next = null;
   }
   public NodeBookLoanVoucher(BookLoanVoucher info) {
       this.info = info;
   }
    public BookLoanVoucher getInfo() {
        return info;
    }

    public NodeBookLoanVoucher getNext() {
        return next;
    }

    public void setInfo(BookLoanVoucher info) {
        this.info = info;
    }

    public void setNext(NodeBookLoanVoucher next) {
        this.next = next;
    }
}
