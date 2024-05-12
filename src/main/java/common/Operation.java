package main.java.common;

import java.io.Serializable;

public class Operation implements Serializable {
    private String user;
    private String mainOperation;
    private String subOperation;

    public Operation(String user, String mainOperation, String subOperation){
        this.user = user;
        this.mainOperation = mainOperation;
        this.subOperation = subOperation;
    }

    public Operation(String user, String mainOperation){
        this.user = user;
        this.mainOperation = mainOperation;
    }

    public Operation(String mainOperation){
        this.mainOperation = mainOperation;
    }

    public String getMainOperation() {
        return mainOperation;
    }

    public String getSubOperation() {
        return subOperation;
    }

    public String getUser() {
        return user;
    }
}
