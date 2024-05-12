package main.java.common;

import java.io.Serializable;

public class BooksBorrower implements Serializable {
    private String accountId;
    private String bookISBN;
    private String dateBorrowed;
    private String returnDate;
    private Boolean status;

    public BooksBorrower(String accountId, String bookISBN, String dateBorrowed, String returnDate, Boolean status){
        this.accountId = accountId;
        this.bookISBN = bookISBN;
        this.dateBorrowed = dateBorrowed;
        this.returnDate = returnDate;
        this.status = status;
    }

    public BooksBorrower(String accountId, String bookISBN){
        this.accountId = accountId;
        this.bookISBN = bookISBN;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAccountId() {
        return accountId;
    }
    public String getBookISBN() {
        return bookISBN;
    }
    public String getDateBorrowed() {
        return dateBorrowed;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public Boolean getStatus() {
        return status;
    }
}
