package main.java.client.student.controller;

import main.java.client.student.model.applicationModel;
import main.java.client.student.model.dataAccessClass;
import main.java.client.student.view.*;
import main.java.common.Accounts;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class applicationController {
    private application application;
    private homePanel homePanel;
    private libraryPanel libraryPanel;
    private bookShelfPanel bookShelfPanel;
    private transcriptPanel transcriptPanel;
    public applicationController(application application, homePanel homePanel, libraryPanel libraryPanel, bookShelfPanel bookShelfPanel,
                                 transcriptPanel transcriptPanel){
        this.application = application;
        this.homePanel = homePanel;
        this.libraryPanel = libraryPanel;
        this.bookShelfPanel = bookShelfPanel;
        this.transcriptPanel = transcriptPanel;

        homePanel.getWelcomingLabel().setText("WELCOME " + application.getUserMailLabel().getText());
        setApplicationController();
    }

    public void setApplicationController() {
//        applicationModel applicationModel = new applicationModel();
        dataAccessClass model = new dataAccessClass(application.getIp().getText());
        this.application.setHomeButtonListener(e -> {
            System.out.println("Home Button");
            homePanel.getWelcomingLabel().setText("WELCOME TO README.");
            model.switchPanel(application.getBodyPanel(), homePanel);
        });
        this.application.setLibraryButtonListener(e -> {
            System.out.println("Library Button");
            model.switchPanel(application.getBodyPanel(), libraryPanel);
        });
        this.application.setBookShelfButtonListener(e -> {
            System.out.println("Book Shelf Button");
            model.switchPanel(application.getBodyPanel(), bookShelfPanel);
        });
        this.application.setTranscriptButtonListener(e -> {
            System.out.println("Transcript Button");
            model.switchPanel(application.getBodyPanel(), transcriptPanel);
        });

        this.application.setLogOutButtonListener(e -> {
            System.out.println("Log Out Button");
            application.dispose();
            String username = application.getUserMailLabel().getText();
            String id = application.getUserIdLabel().getText();
            Accounts accounts = new Accounts(username, id);
            model.logOut(accounts);
            System.out.println("Logged Out");
//            model.logOut(username, id);
        });

        this.application.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?\n" +
                        "You will be logged out.", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                if (answer == JOptionPane.YES_OPTION) {
                    //Log out the User
                    application.dispose();
                    String username = application.getUserMailLabel().getText();
                    String id = application.getUserIdLabel().getText();
                    Accounts accounts = new Accounts(username, id);
                    model.logOut(accounts);
                    System.out.println("Logged Out");
//                    model.logOut(username, id);
                }
            }
        });
    }
}
