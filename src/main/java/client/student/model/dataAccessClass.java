package main.java.client.student.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import main.java.client.socketConnector;
import main.java.common.*;

import javax.swing.*;

public class dataAccessClass {
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    private socketConnector socketConnector;

    public dataAccessClass(){}

    public dataAccessClass(socketConnector socketConnector){
        this.socketConnector = socketConnector;
    }

    public void switchPanel(JPanel mainPanel, JPanel switchedPanel){
        mainPanel.removeAll();
        mainPanel.add(switchedPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public static void staticSwitchPanel(JPanel mainPanel, JPanel switchedPanel){
        mainPanel.removeAll();
        mainPanel.add(switchedPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public void logIn(String ip, int port, Accounts accounts, JFrame mainFrame, JFrame logFrame, Operation operation){
        try {
            socketConnector socket = new socketConnector(ip, port);
            this.objectOutputStream = socket.getObjectOutputStream();
            objectOutputStream.writeObject(accounts); //Send the Account to the Server
            objectOutputStream.writeObject(operation); //Send the Instructions to the Server


            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendBookRequest(socketConnector socketConnector, BooksRequestee booksRequestee, Operation operation){

    }

    public void sendRemoveBookRequest(socketConnector socketConnector, BooksRequestee booksRequestee, Operation operation){

    }
}
