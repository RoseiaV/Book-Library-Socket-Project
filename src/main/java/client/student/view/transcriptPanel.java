package main.java.client.student.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class transcriptPanel extends JPanel {
    private JPanel accountImagePanel;
    private JPanel accountPanel;
    private JLabel accountPanelBackgroundImage;
    private JLabel bookmarkBackgroundImage;
    private JPanel bookmarkContainer;
    private JPanel bookmarkPanel;
    private JScrollPane bookmarkScrollPane;
    private JButton changePasswordlabel;
    private JLabel courselabel;
    private JLabel emailLabel;
    private JButton fileButton;
    private JLabel idLabel;
    private JLabel accountImage;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JPasswordField rePasswordField;
    private JButton removeButton;
    private JLabel repasswordLabel;
    private JLabel role;
    private JLabel roleLabel;
    private JLabel studentCourse;
    private JLabel studentEmail;
    private JLabel studentId;
    private JLabel myBookMarkLabel;

    public transcriptPanel() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        accountPanel = new JPanel();
        removeButton = new JButton();
        fileButton = new JButton();
        accountImagePanel = new JPanel();
        accountImage = new JLabel();
        role = new JLabel();
        roleLabel = new JLabel();
        emailLabel = new JLabel();
        idLabel = new JLabel();
        courselabel = new JLabel();
        studentEmail = new JLabel();
        studentId = new JLabel();
        studentCourse = new JLabel();
        passwordLabel = new JLabel();
        rePasswordField = new JPasswordField();
        repasswordLabel = new JLabel();
        passwordField = new JPasswordField();
        changePasswordlabel = new JButton();
        accountPanelBackgroundImage = new JLabel();
        bookmarkContainer = new JPanel();
        bookmarkScrollPane = new JScrollPane();
        bookmarkPanel = new JPanel();
        bookmarkBackgroundImage = new JLabel();
        myBookMarkLabel = new JLabel();
    }
    public void initComponents() {
        setMaximumSize(new Dimension(1280, 650));
        setMinimumSize(new Dimension(1280, 650));
        setPreferredSize(new Dimension(1280, 650));
        setSize(1280, 650);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        accountPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.setLayout(null);

        removeButton.setBackground(new Color(255, 255, 255));
        removeButton.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        removeButton.setText("REMOVE");
        removeButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.add(removeButton);
        removeButton.setBounds(200, 250, 90, 30);

        fileButton.setBackground(new Color(255, 255, 255));
        fileButton.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        fileButton.setText("FILE");
        fileButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.add(fileButton);
        fileButton.setBounds(93, 250, 100, 30);

        accountImagePanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountImagePanel.setLayout(null);

        accountImage.setHorizontalAlignment(SwingConstants.CENTER);
        accountImagePanel.add(accountImage);
        accountImage.setBounds(3, 3, 195, 195);

        accountPanel.add(accountImagePanel);
        accountImagePanel.setBounds(90, 40, 200, 200);

        role.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        role.setForeground(new Color(255, 255, 255));
        //role.setText("STUDENT_ROLE");
        accountPanel.add(role);
        role.setBounds(140, 430, 200, 18);

        roleLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        roleLabel.setForeground(new Color(255, 255, 255));
        roleLabel.setText("ROLE             :");
        accountPanel.add(roleLabel);
        roleLabel.setBounds(30, 430, 90, 18);

        emailLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        emailLabel.setForeground(new Color(255, 255, 255));
        emailLabel.setText("EMAIL            :");
        accountPanel.add(emailLabel);
        emailLabel.setBounds(30, 310, 90, 18);

        idLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        idLabel.setForeground(new Color(255, 255, 255));
        idLabel.setText("STUDENT ID    :");
        accountPanel.add(idLabel);
        idLabel.setBounds(30, 350, 90, 18);

        courselabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        courselabel.setForeground(new Color(255, 255, 255));
        courselabel.setText("COURSE         :");
        accountPanel.add(courselabel);
        courselabel.setBounds(30, 390, 90, 18);

        studentEmail.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        studentEmail.setForeground(new Color(255, 255, 255));
        //studentEmail.setText("STUDENT_EMAIL");
        accountPanel.add(studentEmail);
        studentEmail.setBounds(140, 310, 200, 18);

        studentId.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        studentId.setForeground(new Color(255, 255, 255));
        //studentId.setText("STUDENT_ID");
        accountPanel.add(studentId);
        studentId.setBounds(140, 350, 200, 18);

        studentCourse.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        studentCourse.setForeground(new Color(255, 255, 255));
        //studentCourse.setText("STUDENT_COURSE");
        accountPanel.add(studentCourse);
        studentCourse.setBounds(140, 390, 200, 18);

        passwordLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        passwordLabel.setForeground(new Color(255, 255, 255));
        passwordLabel.setText("PASSWORD    :");
        accountPanel.add(passwordLabel);
        passwordLabel.setBounds(30, 470, 90, 30);

        rePasswordField.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        rePasswordField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.add(rePasswordField);
        rePasswordField.setBounds(140, 510, 200, 30);

        repasswordLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        repasswordLabel.setForeground(new Color(255, 255, 255));
        repasswordLabel.setText("RE-EN PASS   :");
        accountPanel.add(repasswordLabel);
        repasswordLabel.setBounds(30, 510, 90, 30);

        passwordField.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.add(passwordField);
        passwordField.setBounds(140, 470, 200, 30);

        changePasswordlabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        changePasswordlabel.setText("SAVE CHANGES");
        changePasswordlabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.add(changePasswordlabel);
        changePasswordlabel.setBounds(160, 550, 160, 30);

        accountPanelBackgroundImage.setIcon(new ImageIcon("src/main/java/client/res/pixlr-image-generator-6622ff433bac573be2d680d7.png"));
        accountPanelBackgroundImage.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        accountPanel.add(accountPanelBackgroundImage);
        accountPanelBackgroundImage.setBounds(0, 0, 380, 600);

        add(accountPanel);
        accountPanel.setBounds(20, 20, 380, 600);

        bookmarkContainer.setLayout(null);

        bookmarkScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        bookmarkPanel.setBackground(new Color(221, 189, 113));
        bookmarkPanel.setMaximumSize(new Dimension(745, 1500));
        bookmarkPanel.setMinimumSize(new Dimension(745, 1500));
        bookmarkPanel.setPreferredSize(new Dimension(745, 1500));
        bookmarkPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        bookmarkScrollPane.setViewportView(bookmarkPanel);

        bookmarkContainer.add(bookmarkScrollPane);
        bookmarkScrollPane.setBounds(20, 60, 770, 520);

        myBookMarkLabel.setFont(new Font("Swis721 BlkCn BT", 0, 24)); // NOI18N
        myBookMarkLabel.setForeground(new Color(255, 255, 255));
        myBookMarkLabel.setText("MY BOOKMARKS");
        myBookMarkLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bookmarkContainer.add(myBookMarkLabel);
        myBookMarkLabel.setBounds(20, 10, 770, 40);

        bookmarkBackgroundImage.setIcon(new ImageIcon("src/main/java/client/res/pixlr-image-generator-662301b98e23faacb9bdd136.png"));
        bookmarkContainer.add(bookmarkBackgroundImage);
        bookmarkBackgroundImage.setBounds(0, 0, 810, 600);
        add(bookmarkContainer);
        bookmarkContainer.setBounds(440, 20, 810, 600);
    }

    public JLabel getStudentEmail() {
        return studentEmail;
    }

    public JLabel getStudentId() {
        return studentId;
    }

    public JLabel getStudentCourse() {
        return studentCourse;
    }

    public JLabel getRole() {
        return role;
    }

    public JLabel getAccountImage() {
        return accountImage;
    }

    //getter for the passwordfield
    public JPasswordField getPasswordField() {
        return passwordField;
    }
    public JPasswordField getRePasswordField() {
        return rePasswordField;
    }

    public JPanel getBookmarkPanel() {
        return bookmarkPanel;
    }


    public void setFileButtonListener(ActionListener actionListener){
        fileButton.addActionListener(actionListener);
    }
    public void setRemoveButtonListener(ActionListener actionListener){
        removeButton.addActionListener(actionListener);
    }
}
