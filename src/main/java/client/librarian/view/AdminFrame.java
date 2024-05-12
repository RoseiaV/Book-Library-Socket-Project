package client.librarian.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdminFrame extends JFrame {
    private JLabel adminLabel;
    private JPanel adminPanel;
    private JPanel bodyPanel;
    private JLabel headerLabel;
    private JPanel headerPanel;
    private JButton issueBookButton;
    private JButton logOutButton;
    private JButton manageAccountsButton;
    private JButton manageAuthorButton;
    private JButton manageCategoryButton;
    private JButton manageLanguageButton;
    private JButton manageLibraryButton;
    private JButton manageRoleButton;
    private JPanel navigationPanel;

    private JLabel userNameLabel;
    private JLabel userPassWordLabel;

    public AdminFrame() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents() {
        headerPanel = new JPanel();
        headerLabel = new JLabel();
        adminPanel = new JPanel();
        adminLabel = new JLabel();
        logOutButton = new JButton();
        navigationPanel = new JPanel();
        issueBookButton = new JButton();
        manageLibraryButton = new JButton();
        manageAuthorButton = new JButton();
        manageCategoryButton = new JButton();
        manageLanguageButton = new JButton();
        manageRoleButton = new JButton();
        manageAccountsButton = new JButton();
        bodyPanel = new JPanel();
        bodyPanel = new JPanel();

        userNameLabel = new JLabel();
        userPassWordLabel = new JLabel();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new Dimension(1540, 860));
        setMinimumSize(new Dimension(1540, 860));
        setPreferredSize(new Dimension(1540, 860));
        setSize(new Dimension(1540, 860));
        getContentPane().setLayout(null);

        headerPanel.setBackground(new Color(204, 204, 255));
        headerPanel.setLayout(null);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 22));
        headerLabel.setText("LIBRARY ADMIN MANAGEMENT");
        headerPanel.add(headerLabel);
        headerLabel.setBounds(30, 10, 370, 50);

        adminPanel.setBackground(new Color(255, 255, 255));
        adminPanel.setLayout(null);

        adminLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14));
        adminLabel.setText("ADMIN NAME");
        adminPanel.add(adminLabel);
        adminLabel.setBounds(10, 10, 100, 30);

        logOutButton.setFont(new Font("Yu Gothic UI Semibold", 0, 14));
        logOutButton.setText("LOG OUT");
        logOutButton.setBorder(BorderFactory.createEtchedBorder());
        adminPanel.add(logOutButton);
        logOutButton.setBounds(120, 10, 100, 30);

        headerPanel.add(adminPanel);
        adminPanel.setBounds(1290, 10, 230, 50);

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 1540, 70);

        navigationPanel.setBackground(new Color(255, 255, 255));
        navigationPanel.setLayout(null);

        issueBookButton.setText("ISSUE BOOK");
        issueBookButton.setBorder(null);
        navigationPanel.add(issueBookButton);
        issueBookButton.setBounds(1200, 0, 140, 40);

        manageLibraryButton.setText("MANAGE LIBRARY");
        manageLibraryButton.setBorder(null);
        navigationPanel.add(manageLibraryButton);
        manageLibraryButton.setBounds(240, 0, 140, 40);

        manageAuthorButton.setText("MANAGE AUTHOR");
        manageAuthorButton.setBorder(null);
        navigationPanel.add(manageAuthorButton);
        manageAuthorButton.setBounds(400, 0, 140, 40);

        manageCategoryButton.setText("MANAGE CATEGORY");
        manageCategoryButton.setBorder(null);
        navigationPanel.add(manageCategoryButton);
        manageCategoryButton.setBounds(560, 0, 140, 40);

        manageLanguageButton.setText("MANAGE LANGUAGE");
        manageLanguageButton.setBorder(null);
        navigationPanel.add(manageLanguageButton);
        manageLanguageButton.setBounds(720, 0, 140, 40);

        manageRoleButton.setText("MANAGE ROLE");
        manageRoleButton.setBorder(null);
        navigationPanel.add(manageRoleButton);
        manageRoleButton.setBounds(1040, 0, 140, 40);

        manageAccountsButton.setText("MANAGE ACCOUNTS");
        manageAccountsButton.setBorder(null);
        navigationPanel.add(manageAccountsButton);
        manageAccountsButton.setBounds(880, 0, 140, 40);

        getContentPane().add(navigationPanel);
        navigationPanel.setBounds(0, 70, 1540, 40);

        bodyPanel.setBackground(new Color(255, 255, 255));
        bodyPanel.setMaximumSize(new Dimension(1540, 720));
        bodyPanel.setPreferredSize(new Dimension(1540, 720));
        bodyPanel.setLayout(null);
        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 110, 1540, 720);

        pack();
    }

    public JPanel getBodyPanel() {
        return bodyPanel;
    }

    public String getUserNameLabel() {
        return userNameLabel.getText();
    }
    public String getUserPassWordLabel() {
        return userPassWordLabel.getText();
    }
    public void setUserNameLabel(String s) {
        this.userNameLabel.setText(s);
    }
    public void setUserPassWordLabel(String s) {
        this.userPassWordLabel.setText(s);
    }

    public void setManageLibraryButtonListener(ActionListener actionListener){
        manageLibraryButton.addActionListener(actionListener);
    }
    public void setManageAuthorButtonListener(ActionListener actionListener){
        manageAuthorButton.addActionListener(actionListener);
    }
    public void setManageCategoryButtonListener(ActionListener actionListener){
        manageCategoryButton.addActionListener(actionListener);
    }
    public void setManageAccountsButtonListener(ActionListener actionListener){
        manageAccountsButton.addActionListener(actionListener);
    }
    public void setManageLanguageButtonListener(ActionListener actionListener){
        manageLanguageButton.addActionListener(actionListener);
    }
    public void setManageRoleButtonListener(ActionListener actionListener){
        manageRoleButton.addActionListener(actionListener);
    }
    public void setIssueBookButtonListener(ActionListener actionListener){
        issueBookButton.addActionListener(actionListener);
    }
    public void setLogOutButtonListener(ActionListener actionListener){
        logOutButton.addActionListener(actionListener);
    }
}
