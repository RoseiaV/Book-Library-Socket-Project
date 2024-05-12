package main.java.client.student.model;

import main.java.client.socketConnector;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import main.java.common.*;

import javax.swing.*;

public class logInModel {

    public logInModel(){}

    public logInModel(String ip, Accounts accounts, Operation operation, JFrame mainFrame, JFrame logFrame){
        try (
                Socket socket = new Socket(ip, 10000);
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ) {
            System.out.println("Bypass the Try-Catch");

            objectOutputStream.writeObject("client");
            //objectOutputStream.writeObject(operation); //Send the Instructions to the Server
            System.out.println("Operation has been sent");
            objectOutputStream.writeObject(accounts); //Send the Account to the Server
            System.out.println("Account has been sent");

            String logInResponse = (String) objectInputStream.readObject();
            System.out.println("Server response has been received -> " + logInResponse);

            switch (logInResponse) {
                case "valid":
                    System.out.println("Logging in as " + accounts.getUsername());
                    JOptionPane.showMessageDialog(null, "Welcome " + accounts.getUsername());
                    break;
                case "accountIsUsed":
                    System.out.println(accounts.getUsername() + " is currently in used!");
                    JOptionPane.showMessageDialog(null, "Account is currently used", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                case "accountNotExist":
                    JOptionPane.showMessageDialog(null, "Account does not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Account does not exists");
                    break;
                default:
                    System.out.println("Application Error");
            }
        } catch (ClassNotFoundException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
