package main.java.client.student.model;

import main.java.common.Accounts;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class applicationModel {

    public void switchPanel(JPanel mainFrame, JPanel switchedPanel){
        mainFrame.removeAll();
        mainFrame.add(switchedPanel);
        mainFrame.repaint();
        mainFrame.revalidate();
    }

    public void logOut(Accounts account, Socket socket) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
