package main.java.client.student.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import main.java.common.*;

import javax.swing.*;

public class dataAccessClass {
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    private Socket socket;

    public dataAccessClass(){}
    public dataAccessClass(String ip){
        try {
            socket = new Socket(ip, 10000);
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

    public void logOut(Accounts accounts){
        Operation operation = new Operation("client", "logout");
        try {
            objectOutputStream.writeObject(operation);
            objectOutputStream.writeObject(accounts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
