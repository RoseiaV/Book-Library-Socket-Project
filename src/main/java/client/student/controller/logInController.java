package main.java.client.student.controller;

import main.java.client.student.view.*;

import main.java.client.student.model.*;
import main.java.common.Accounts;
import main.java.common.Operation;

public class logInController {
    private application application;
    private logInForm logInForm;

    public logInController( logInForm logInForm, application application){
        this.logInForm = logInForm;
        this.application = application;
        logInControl();
    }
    public void logInControl(){
        System.out.println("logInController has been Activated");
        this.logInForm.setLogInButtonListener( e -> {
            System.out.println("LogIn Button is Clicked");
            String username = logInForm.getStudentField();
            String password = logInForm.getPasswordField();
            String serverIp = logInForm.getServerField();

            System.out.println("Accounts");
            Accounts accounts = new Accounts(null, username, password);

            System.out.println("Operations");
            Operation operation = new Operation("client","login");

            System.out.println("LogInModel");
            new logInModel(serverIp, accounts, operation, logInForm, application);
            //model.logIn(serverIp, 10000, accounts, application, logInForm, operation);
        });
    }
}
