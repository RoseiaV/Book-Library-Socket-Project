package main.java.client.student.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.*;

public class application extends JFrame {

    private JLabel applicationNameAndLogo;
    private JPanel bodyPanel;
    private JButton bookShelfButton;
    private JButton homeButton;
    private JLabel imageLabel;
    private JPanel imagePanel;
    private JButton libraryButton;
    private JButton logOutButton;
    private JPanel navigationPanel;
    private JButton transcriptButton;
    private JLabel userIdLabel;
    private JLabel userMailLabel;
    private JLabel ip;
    private homePanel homePanel;

    public application() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        navigationPanel = new JPanel();
        applicationNameAndLogo = new JLabel();
        imagePanel = new JPanel();
        imageLabel = new JLabel();
        transcriptButton = new JButton();
        homeButton = new JButton();
        libraryButton = new JButton();
        bookShelfButton = new JButton();
        logOutButton = new JButton();
        userIdLabel = new JLabel();
        userMailLabel = new JLabel();
        ip = new JLabel();
        bodyPanel = new JPanel();
        homePanel = new homePanel();
    }
    public void initComponents() {
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new Dimension(1295, 740));
        setMinimumSize(new Dimension(1295, 740));
        setPreferredSize(new Dimension(1295, 740));
        setSize(new Dimension(1295, 740));
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        navigationPanel.setBackground(new Color(255, 255, 255));
        navigationPanel.setLayout(null);

        applicationNameAndLogo.setFont(new Font("Trebuchet MS", 0, 18));
        applicationNameAndLogo.setHorizontalAlignment(SwingConstants.CENTER);
        applicationNameAndLogo.setIcon(new ImageIcon("src/main/java/client/res/book_3145765.png"));
        applicationNameAndLogo.setText("READ ME");
        navigationPanel.add(applicationNameAndLogo);
        applicationNameAndLogo.setBounds(0, 0, 150, 60);

        imagePanel.setLayout(null);
        imagePanel.add(imageLabel);
        imageLabel.setBounds(-1, 0, 50, 50);

        navigationPanel.add(imagePanel);
        imagePanel.setBounds(1010, 5, 50, 50);

        transcriptButton.setBackground(new Color(255, 255, 255));
        transcriptButton.setIcon(new ImageIcon("src/main/java/client/res/art-design_1719913.png"));
        transcriptButton.setText("TRANSCRIPT");
        transcriptButton.setBorder(null);
        transcriptButton.setBorderPainted(false);
        transcriptButton.setFocusPainted(false);
        navigationPanel.add(transcriptButton);
        transcriptButton.setBounds(740, 10, 150, 50);

        homeButton.setBackground(new Color(255, 255, 255));
        homeButton.setIcon(new ImageIcon("src/main/java/client/res/home_13317503 (1).png"));
        homeButton.setText("HOME");
        homeButton.setBorder(null);
        homeButton.setFocusPainted(false);
        homeButton.setMargin(new Insets(2, 16, 2, 16));
        homeButton.setName("");
        navigationPanel.add(homeButton);
        homeButton.setBounds(230, 10, 150, 50);

        libraryButton.setBackground(new Color(255, 255, 255));
        libraryButton.setIcon(new ImageIcon("src/main/java/client/res/archive_4983589.png"));
        libraryButton.setText("LIBRARY");
        libraryButton.setBorder(null);
        libraryButton.setBorderPainted(false);
        libraryButton.setContentAreaFilled(false);
        libraryButton.setFocusPainted(false);
        libraryButton.setOpaque(true);
        navigationPanel.add(libraryButton);
        libraryButton.setBounds(400, 10, 150, 50);

        bookShelfButton.setBackground(new Color(255, 255, 255));
        bookShelfButton.setIcon(new ImageIcon("src/main/java/client/res/book-shelf_4288026.png"));
        bookShelfButton.setText("BOOKSHELF");
        bookShelfButton.setBorder(null);
        bookShelfButton.setBorderPainted(false);
        bookShelfButton.setFocusPainted(false);
        navigationPanel.add(bookShelfButton);
        bookShelfButton.setBounds(570, 10, 150, 50);

        logOutButton.setBackground(new Color(255, 255, 255));
        logOutButton.setIcon(new ImageIcon("src/main/java/client/res/logout_1828427 (1).png"));
        logOutButton.setBorder(null);
        navigationPanel.add(logOutButton);
        logOutButton.setBounds(1210, 0, 50, 60);

        userIdLabel.setFont(new Font("Trebuchet MS", 0, 14));
        userIdLabel.setText("id");
        navigationPanel.add(userIdLabel);
        userIdLabel.setBounds(1070, 30, 130, 16);

        userMailLabel.setFont(new Font("Trebuchet MS", 0, 14));
        userMailLabel.setText("USERMAIL");
        userMailLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        navigationPanel.add(userMailLabel);
        userMailLabel.setBounds(1070, 10, 130, 16);

        getContentPane().add(navigationPanel);
        navigationPanel.setBounds(0, 0, 1280, 60);

        bodyPanel.setBackground(new Color(255, 255, 255));
        bodyPanel.setLayout(null);
        homePanel.setBounds(0,0, 1280, 650);
        bodyPanel.add(homePanel); //Adds the homepanel as default
        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 70, 1280, 650);
        pack();
    }

    public void setHomeButtonListener(ActionListener actionListener){
        homeButton.addActionListener(actionListener);
    }

    public void setLibraryButtonListener(ActionListener actionListener){
        libraryButton.addActionListener(actionListener);
    }

    public void setBookShelfButtonListener(ActionListener actionListener){
        bookShelfButton.addActionListener(actionListener);
    }

    public void setTranscriptButtonListener(ActionListener actionListener){
        transcriptButton.addActionListener(actionListener);
    }

    public void setLogOutButtonListener(ActionListener actionListener){
        logOutButton.addActionListener(actionListener);
    }


    public void setUserIdLabel(String s) {
        this.userIdLabel.setText(s);
    }

    public void setUserMailLabel(String s) {
        this.userMailLabel.setText(s);
    }

    public JLabel getUserMailLabel() {
        return userMailLabel;
    }

    public JLabel getUserIdLabel() {
        return userIdLabel;
    }

    public JPanel getBodyPanel() {
        return bodyPanel;
    }

    public JLabel getIp() {
        return ip;
    }

    public void setIp(JLabel ip) {
        this.ip = ip;
    }
}
