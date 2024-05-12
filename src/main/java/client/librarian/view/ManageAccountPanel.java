package client.librarian.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class ManageAccountPanel extends JPanel {
    private JComboBox<String> roleComboBox;
    private JLabel roleLabel;
    private JPanel accountPanel;
    private JScrollPane accountScrollPane;
    private JTable accountTable;
    private JPanel announcementPanel;
    private JScrollPane announcementScrollPane;
    private JButton announcementSendButton;
    private JButton announcementClearButton;
    private JLabel announcementLabel;
    private JTextArea announcementTextArea;
    private JButton createButton;
    private JButton deleteButton;
    private JButton fileButton;
    private JLabel headerLabel;
    private JTextField idField;
    private JLabel idLabel;
    private JTextField idMailField;
    private JPanel imagePanel;
    private JLabel isNumberLabel;
    private JButton mailClearButton;
    private JLabel mailLabel;
    private JPanel mailPanel;
    private JScrollPane mailScrollPane;
    private JButton mailSendButton;
    private JTextArea mailTextArea;
    private JTextField nameField;
    private JLabel nameLabel;
    private JTextField passwordField;
    private JLabel passwordLabel1;
    private JButton removeButton;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;
    private JButton updateButton;
    private JTextField usernameField;
    private JLabel usernameLabel;
    private imageContainer imageContainer;

    public ManageAccountPanel(){
        instanceComponents();
        initComponents();
    }
    public void instanceComponents(){
        roleComboBox = new JComboBox<>();
        roleLabel = new JLabel();
        accountPanel = new JPanel();
        statusLabel = new JLabel();
        usernameField = new JTextField();
        idField = new JTextField();
        idLabel = new JLabel();
        updateButton = new JButton();
        deleteButton = new JButton();
        createButton = new JButton();
        imagePanel = new JPanel();
        fileButton = new JButton();
        removeButton = new JButton();
        usernameLabel = new JLabel();
        nameField = new JTextField();
        nameLabel = new JLabel();
        passwordField = new JTextField();
        passwordLabel1 = new JLabel();
        statusComboBox = new JComboBox<>();
        headerLabel = new JLabel();
        accountScrollPane = new JScrollPane();
        accountTable = new JTable();
        mailPanel = new JPanel();
        idMailField = new JTextField();
        mailLabel = new JLabel();
        isNumberLabel = new JLabel();
        mailScrollPane = new JScrollPane();
        mailTextArea = new JTextArea();
        mailClearButton = new JButton();
        mailSendButton = new JButton();
        announcementPanel = new JPanel();
        announcementLabel = new JLabel();
        announcementScrollPane = new JScrollPane();
        announcementTextArea = new JTextArea();
        announcementSendButton = new JButton();
        announcementClearButton = new JButton();
        imageContainer = new imageContainer();
    }
    private void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1540, 720));
        setMinimumSize(new Dimension(1540, 720));
        setPreferredSize(new Dimension(1540, 720));
        setSize(1540, 720);
        setLayout(null);

        accountPanel.setBackground(new Color(204, 204, 255));
        accountPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        accountPanel.setLayout(null);

        roleLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        roleLabel.setText("ROLE");
        accountPanel.add(roleLabel);
        roleLabel.setBounds(10, 480, 90, 20);

        statusLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        statusLabel.setText("STATUS");
        accountPanel.add(statusLabel);
        statusLabel.setBounds(10, 450, 90, 20);

        usernameField.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        usernameField.setHorizontalAlignment(JTextField.LEFT);
        usernameField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        accountPanel.add(usernameField);
        usernameField.setBounds(110, 390, 170, 20);

        idField.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        idField.setHorizontalAlignment(JTextField.LEFT);
        idField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        accountPanel.add(idField);
        idField.setBounds(110, 330, 170, 20);

        idLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idLabel.setText("ID ");
        accountPanel.add(idLabel);
        idLabel.setBounds(10, 330, 90, 20);

        updateButton.setText("UPDATE");
        accountPanel.add(updateButton);
        updateButton.setBounds(30, 525, 250, 25);

        deleteButton.setText("DELETE");
        accountPanel.add(deleteButton);
        deleteButton.setBounds(30, 555, 250, 25);

        createButton.setText("CREATE");
        accountPanel.add(createButton);
        createButton.setBounds(30, 585, 250, 25);

        imagePanel.setBackground(new Color(255, 255, 255));
        imagePanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        imagePanel.setLayout(null);
        accountPanel.add(imagePanel);
        imagePanel.setBounds(20, 20, 260, 260);

        imagePanel.add(imageContainer);
        imageContainer.setBounds(20, 20, 220, 220);

        fileButton.setText("FILE");
        accountPanel.add(fileButton);
        fileButton.setBounds(50, 290, 90, 23);

        removeButton.setText("REMOVE");
        accountPanel.add(removeButton);
        removeButton.setBounds(160, 290, 90, 23);

        usernameLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        usernameLabel.setText("USERNAME");
        accountPanel.add(usernameLabel);
        usernameLabel.setBounds(10, 390, 90, 20);

        nameField.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        nameField.setHorizontalAlignment(JTextField.LEFT);
        nameField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        accountPanel.add(nameField);
        nameField.setBounds(110, 360, 170, 20);

        nameLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nameLabel.setText("NAME");
        accountPanel.add(nameLabel);
        nameLabel.setBounds(10, 360, 90, 20);

        passwordField.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        passwordField.setHorizontalAlignment(JTextField.LEFT);
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        accountPanel.add(passwordField);
        passwordField.setBounds(110, 420, 170, 20);

        passwordLabel1.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        passwordLabel1.setText("PASSWORD");
        accountPanel.add(passwordLabel1);
        passwordLabel1.setBounds(10, 420, 90, 20);

        //Role Combo Box
        //roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        accountPanel.add(roleComboBox);
        roleComboBox.setBounds(110, 480, 170, 22);

        //Status Combo Box
        //statusComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        accountPanel.add(statusComboBox);
        statusComboBox.setBounds(110, 450, 170, 22);

        add(accountPanel);
        accountPanel.setBounds(30, 80, 310, 620);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("ACCOUNT MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 230, 25);

        //Account table
        accountTable.getTableHeader().setReorderingAllowed(false);
        accountScrollPane.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setMinWidth(50);
            accountTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            accountTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(accountScrollPane);
        accountScrollPane.setBounds(370, 80, 670, 620);

        mailPanel.setBackground(new Color(204, 204, 255));
        mailPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        mailPanel.setLayout(null);
        mailPanel.add(idMailField);
        idMailField.setBounds(130, 20, 150, 22);

        mailLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        mailLabel.setText("MAIL");
        mailPanel.add(mailLabel);
        mailLabel.setBounds(30, 80, 80, 20);

        isNumberLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        isNumberLabel.setText("ID NUMBER");
        mailPanel.add(isNumberLabel);
        isNumberLabel.setBounds(30, 20, 80, 20);

        mailTextArea.setColumns(20);
        mailTextArea.setRows(5);
        mailScrollPane.setViewportView(mailTextArea);

        mailPanel.add(mailScrollPane);
        mailScrollPane.setBounds(30, 110, 400, 120);

        mailClearButton.setText("CLEAR");
        mailPanel.add(mailClearButton);
        mailClearButton.setBounds(290, 260, 120, 30);

        mailSendButton.setText("SEND");
        mailPanel.add(mailSendButton);
        mailSendButton.setBounds(70, 260, 120, 30);

        add(mailPanel);
        mailPanel.setBounds(1060, 80, 460, 320);

        announcementPanel.setBackground(new Color(204, 204, 255));
        announcementPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        announcementPanel.setLayout(null);

        announcementLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        announcementLabel.setText("ANNOUNCEMENT");
        announcementPanel.add(announcementLabel);
        announcementLabel.setBounds(30, 20, 130, 20);

        announcementTextArea.setColumns(20);
        announcementTextArea.setRows(5);
        announcementScrollPane.setViewportView(announcementTextArea);

        announcementPanel.add(announcementScrollPane);
        announcementScrollPane.setBounds(30, 50, 400, 150);

        announcementSendButton.setText("SEND");
        announcementPanel.add(announcementSendButton);
        announcementSendButton.setBounds(60, 220, 120, 30);

        announcementClearButton.setText("CLEAR");
        announcementPanel.add(announcementClearButton);
        announcementClearButton.setBounds(290, 220, 120, 30);

        add(announcementPanel);
        announcementPanel.setBounds(1060, 420, 460, 280);
    }

    static class imageContainer extends JPanel{
        private BufferedImage image;
        public imageContainer(){

        }
        public void paint(Graphics graphics){
            super.paint(graphics);
            Graphics2D graphics2D = (Graphics2D) graphics;
            if(image != null){
                graphics2D.drawImage(image, 0,0,getWidth(), getHeight(), null);
            }
        }
        public void updateImage(File file){
            try {
                image = ImageIO.read(file);
                repaint();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setAccountImage(File file){
        imageContainer.updateImage(file);
    }

    public JTable getAccountTable() {
        return accountTable;
    }
    public JComboBox<String> getRoleComboBox() {
        return roleComboBox;
    }
    public JComboBox<String> getStatusComboBox() {
        return statusComboBox;
    }


    //getters
    public String getIdField() {
        return idField.getText();
    }
    public String getNameField() {
        return nameField.getText();
    }
    public String getUsernameField() {
        return usernameField.getText();
    }
    public String getPasswordField() {
        return passwordField.getText();
    }


    //Setters
    public void setIdField(String s) {
        this.idField.setText(s);
    }
    public void setNameField(String s) {
        this.nameField.setText(s);
    }
    public void setUsernameField(String s) {
        this.usernameField.setText(s);
    }
    public void setPasswordField(String s) {
        this.passwordField.setText(s);
    }

    public void setUpdateButtonListener(ActionListener actionListener){
        updateButton.addActionListener(actionListener);
    }
    public void setDeleteButtonListener(ActionListener actionListener){
        deleteButton.addActionListener(actionListener);
    }
    public void setCreateButtonListener(ActionListener actionListener){
        createButton.addActionListener(actionListener);
    }
}
