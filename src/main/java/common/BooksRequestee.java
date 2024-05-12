package main.java.common;

import java.io.Serializable;

public class BooksRequestee implements Serializable {
    private String accountId;
    private String bookISBN;
    private String dateWasRequested;
    private String requestDate;
    private String reason;
    private Boolean status;

    public BooksRequestee(String accountId, String bookISBN, String dateWasRequested, String reason, String requestDate, Boolean status){
        this.accountId = accountId;
        this.bookISBN = bookISBN;
        this.dateWasRequested = dateWasRequested;
        this.reason = reason;
        this.requestDate = requestDate;
        this.status = status;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
    public void setDateWasRequested(String dateWasRequested) {
        this.dateWasRequested = dateWasRequested;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
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
    public String getDateWasRequested() {
        return dateWasRequested;
    }

    public String getReason() {
        return reason;
    }

    public String getRequestDate() {
        return requestDate;
    }
    public Boolean getStatus() {
        return status;
    }
}
