package main.java.common;
import java.io.Serializable;
import java.util.List;

public class Bookmarks implements Serializable {

    private String bookid;
    private String accId;
    private List<String> accountId;

    public Bookmarks(String bookid, String accId){
        this.bookid = bookid;
        this.accId = accId;
    }

    public Bookmarks(String bookid, List<String> accountId){
        this.bookid = bookid;
        this.accountId = accountId;
    }

    public String getAccId() {
        return accId;
    }

    public String getBookId() {
        return bookid;
    }

    public List<String> getAccountId() {
        return accountId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public void setAccountId(List<String> accountId) {
        this.accountId = accountId;
    }

    public void setBookId(String bookid) {
        this.bookid = bookid;
    }


}
