package main.java.client.student.view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class logInForm extends JFrame {

    private JLabel ImageBackground;
    private JLabel LogoLabel;
    private JLabel applicationName;
    private JPanel leftPanel;
    private JButton logInButton;
    private JLabel logInLabel;
    private JPasswordField passwordField;
    private JLabel passwordIcon;
    private JLabel passwordLabel;
    private JTextField serverField;
    private JLabel serverIcon;
    private JLabel serverLabel;
    private JTextField studentField;
    private JLabel studentIcon;
    private JLabel studentMailLabel;


    public logInForm() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        logInLabel = new JLabel();
        serverIcon = new JLabel();
        serverLabel = new JLabel();
        serverField = new JTextField();
        studentIcon = new JLabel();
        studentMailLabel = new JLabel();
        passwordField = new JPasswordField();
        passwordIcon = new JLabel();
        passwordLabel = new JLabel();
        studentField = new JTextField();
        logInButton = new JButton();
        leftPanel = new JPanel();
        applicationName = new JLabel();
        LogoLabel = new JLabel();
        ImageBackground = new JLabel();
    }

    public void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(720, 500));
        setMinimumSize(new Dimension(720, 500));
        setPreferredSize(new Dimension(720, 500));
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setVisible(true);

        logInLabel.setFont(new Font("Swis721 BlkCn BT", 0, 48));
        logInLabel.setForeground(new Color(255, 255, 255));
        logInLabel.setHorizontalAlignment(SwingConstants.CENTER);
        logInLabel.setText("LOG IN");
        getContentPane().add(logInLabel);
        logInLabel.setBounds(370, 30, 200, 60);

        serverIcon.setBackground(new Color(255, 255, 255));
        serverIcon.setHorizontalAlignment(SwingConstants.CENTER);
        serverIcon.setIcon(new ImageIcon("src/main/java/client/res/database_2289329.png"));
        getContentPane().add(serverIcon);
        serverIcon.setBounds(240, 330, 60, 60);

        serverLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        serverLabel.setForeground(new Color(255, 255, 255));
        serverLabel.setText("SERVER IP");
        serverLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        getContentPane().add(serverLabel);
        serverLabel.setBounds(310, 320, 190, 16);

        serverField.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        serverField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        getContentPane().add(serverField);
        serverField.setBounds(310, 340, 190, 50);

        studentIcon.setBackground(new Color(255, 255, 255));
        studentIcon.setHorizontalAlignment(SwingConstants.CENTER);
        studentIcon.setIcon(new ImageIcon("src/main/java/client/res/programmer_560277.png"));
        getContentPane().add(studentIcon);
        studentIcon.setBounds(240, 140, 70, 70);

        studentMailLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        studentMailLabel.setForeground(new Color(255, 255, 255));
        studentMailLabel.setText("EMAIL");
        studentMailLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        getContentPane().add(studentMailLabel);
        studentMailLabel.setBounds(310, 130, 360, 24);

        passwordField.setFont(new Font("Swis721 BT", 0, 18));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        getContentPane().add(passwordField);
        passwordField.setBounds(310, 250, 360, 50);

        passwordIcon.setBackground(new Color(255, 255, 255));
        passwordIcon.setHorizontalAlignment(SwingConstants.CENTER);
        passwordIcon.setIcon(new ImageIcon("src/main/java/client/res/password_7939100.png"));
        getContentPane().add(passwordIcon);
        passwordIcon.setBounds(240, 240, 60, 60);

        passwordLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        passwordLabel.setForeground(new Color(255, 255, 255));
        passwordLabel.setText("PASSWORD");
        passwordLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(310, 230, 360, 16);

        studentField.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        studentField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        getContentPane().add(studentField);
        studentField.setBounds(310, 160, 360, 50);

        logInButton.setBackground(new Color(255, 255, 255));
        logInButton.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        logInButton.setText("LOG IN");
        logInButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
        getContentPane().add(logInButton);
        logInButton.setBounds(520, 340, 150, 50);

        leftPanel.setBackground(new Color(255, 255, 255));
        leftPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        leftPanel.setLayout(null);

        applicationName.setFont(new Font("Swis721 BlkCn BT", 0, 24));
        applicationName.setHorizontalAlignment(SwingConstants.CENTER);
        applicationName.setText("READ ME");
        leftPanel.add(applicationName);
        applicationName.setBounds(30, 170, 150, 30);

        LogoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LogoLabel.setIcon(new ImageIcon("src/main/java/client/res/book_3145765 (1).png"));
        leftPanel.add(LogoLabel);
        LogoLabel.setBounds(30, 20, 150, 140);

        getContentPane().add(leftPanel);
        leftPanel.setBounds(0, 0, 210, 480);

        ImageBackground.setHorizontalAlignment(SwingConstants.CENTER);
        ImageBackground.setIcon(new ImageIcon("src/main/java/client/res/pixlr-image-generator-6622ff433bac573be2d680d9.png"));
        getContentPane().add(ImageBackground);
        ImageBackground.setBounds(0, 0, 720, 480);

        pack();
    }

    public void setLogInButtonListener(ActionListener actionListener){
        logInButton.addActionListener(actionListener);
    }

    public String getStudentField() {
        return studentField.getText();
    }

    public String getPasswordField() {
        return passwordField.getText();
    }

    public String getServerField() {
        return serverField.getText();
    }

    public void setStudentField(String s) {
        this.studentField.setText(s);
    }

    public void setPasswordField(String s) {
        this.passwordField.setText(s);
    }

    public void setServerField(String s) {
        this.serverField.setText(s);
    }
}
