package client.librarian.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdminLogIn extends JFrame {
    private JLabel adminLabel;
    private JPanel leftPanel;
    private JButton logInButton;
    private JPasswordField passwordField;
    private JLabel paswwordLabel;
    private JPanel rightPanel;
    private JLabel serverIp;
    private JTextField serverIpTextField;
    private JTextField usernameField;
    private JLabel usernameLabel;;

    public AdminLogIn(){
        initComponents();
    }
    public void initComponents() {
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        usernameField = new JTextField();
        serverIp = new JLabel();
        usernameLabel = new JLabel();
        serverIpTextField = new JTextField();
        logInButton = new JButton();
        paswwordLabel = new JLabel();
        passwordField = new JPasswordField();
        adminLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setMaximumSize(new Dimension(720, 480));
        setMinimumSize(new Dimension(720, 480));
        setSize(new Dimension(720, 480));
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        leftPanel.setBackground(new Color(153, 153, 255));
        leftPanel.setLayout(null);
        getContentPane().add(leftPanel);
        leftPanel.setBounds(0, 0, 240, 480);

        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setLayout(null);

        usernameField.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        rightPanel.add(usernameField);
        usernameField.setBounds(20, 140, 420, 40);

        serverIp.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        serverIp.setText("SERVER IP");
        rightPanel.add(serverIp);
        serverIp.setBounds(20, 300, 140, 22);

        usernameLabel.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        usernameLabel.setText("USERNAME");
        rightPanel.add(usernameLabel);
        usernameLabel.setBounds(20, 100, 140, 29);

        serverIpTextField.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        rightPanel.add(serverIpTextField);
        serverIpTextField.setBounds(20, 330, 220, 40);

        logInButton.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        logInButton.setText("LOG IN");
        rightPanel.add(logInButton);
        logInButton.setBounds(310, 330, 130, 40);

        paswwordLabel.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        paswwordLabel.setText("PASSWORD");
        rightPanel.add(paswwordLabel);
        paswwordLabel.setBounds(20, 200, 140, 22);

        passwordField.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        rightPanel.add(passwordField);
        passwordField.setBounds(20, 230, 420, 40);

        adminLabel.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        adminLabel.setText("ADMIN LOGIN");
        rightPanel.add(adminLabel);
        adminLabel.setBounds(160, 20, 152, 29);

        getContentPane().add(rightPanel);
        rightPanel.setBounds(240, 0, 480, 480);
        setVisible(true);
    }

    public void setLogInButtonListener(ActionListener actionListener){
        logInButton.addActionListener(actionListener);
    }

    //Setters
    public void setUsernameField(String usernameField) {
        this.usernameField.setText(usernameField);
    }
    public void setPasswordField(String passwordField) {
        this.passwordField.setText(passwordField);
    }
    public void setServerIpTextField(String serverIpTextField) {
        this.serverIpTextField.setText(serverIpTextField);
    }

    //Getters
    public String getUsernameField() {
        return usernameField.getText();
    }
    public String getPasswordField() {
        return passwordField.getText();
    }
    public String getServerIpTextField() {
        return serverIpTextField.getText();
    }


}
