package main.java.client;

import main.java.client.student.controller.*;
import main.java.client.student.model.dataAccessClass;
import main.java.client.student.view.*;
import main.java.common.*;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Application {

    protected static ObjectInputStream objectInputStream;
    protected static ObjectOutputStream objectOutputStream;
    public static void main(String[] args) {
        logInAuthenticate();
    }

//    public static void logInAuthenticate(){
//        logInForm logInForm = new logInForm();
//        application application = new application();
//        logInController logInController = new logInController(logInForm, application);
//    }
    public static void logInAuthenticate(){
        logInForm logInForm = new logInForm();
        logInForm.setVisible(true);

        logInForm.setLogInButtonListener( e -> {
            System.out.println("LogIn Button is Clicked");
            String username = logInForm.getStudentField();
            String password = logInForm.getPasswordField();
            String serverIp = logInForm.getServerField();

            Operation operation = new Operation("client","login");
            System.out.println("Populating the Operations -> " + operation);

            Accounts accounts = new Accounts(null, username, password);
            System.out.println(username);
            System.out.println(password);
            System.out.println("Populating the Accounts -> " + accounts);

            //socketConnector socket = new socketConnector(serverIp, 10000);
            try (
                    Socket socket = new Socket(serverIp, 10000);
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    ){
                System.out.println("Bypass the Try-Catch");

                objectOutputStream.writeObject(operation); //Send the Instructions to the Server
                System.out.println("Operation has been sent");
                objectOutputStream.writeObject(accounts); //Send the Account to the Server
                System.out.println("Account has been sent");

                System.out.println("Waiting for server response");
                String logInResponse = (String) objectInputStream.readObject();
                System.out.println("Server response has been received -> " + logInResponse);

                switch(logInResponse){
                    case "valid" :
                        System.out.println("Logging in as " + username);
                        JOptionPane.showMessageDialog(null, "Welcome " + username);
                        break;
                    case "accountIsUsed" :
                        System.out.println(username + " is currently in used!");
                        JOptionPane.showMessageDialog(null, "Account is currently used", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    case "accountNotExist" :
                        JOptionPane.showMessageDialog(null, "Account does not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                        System.out.println("Account does not exists");
                        break;
                    default: System.out.println("Application Error");
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public static void studentRun(){
        application application = new application();

    }
    public static void librarianRun(){

    }

}
