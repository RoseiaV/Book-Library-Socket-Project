package client.librarian.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class IssueBookPanel extends JPanel {
    private JButton acceptButton1;
    private JTextField rDField;
    private JLabel rDLabel;
    private JTextField statusField;
    private JLabel statusLabel;
    private JLabel headerLabel;
    private JTextField bdField;
    private JLabel bDLabel;
    private JTextField isbnField;
    private JLabel isbnLabel;
    private JPanel issueBookPanel;
    private JScrollPane issueBookScrollPane;
    private JTable issueBookTable;
    private JLabel reasonLabel;
    private JScrollPane reasonScrollPane;
    private JTextArea reasonTextArea;
    private JButton rejectButton;
    private JButton returnedButton;
    private JTextField studentField;
    private JLabel studentLabel;

    public IssueBookPanel(){
        instanceComponents();
        initComponents();
    }
    public void instanceComponents(){
        issueBookPanel = new JPanel();
        reasonLabel = new JLabel();
        isbnLabel = new JLabel();
        rDLabel = new JLabel();
        bDLabel = new JLabel();
        studentLabel = new JLabel();
        statusField = new JTextField();
        rDField = new JTextField();
        isbnField = new JTextField();
        bdField = new JTextField();
        studentField = new JTextField();
        statusLabel = new JLabel();
        reasonScrollPane = new JScrollPane();
        reasonTextArea = new JTextArea();
        returnedButton = new JButton();
        rejectButton = new JButton();
        acceptButton1 = new JButton();
        headerLabel = new JLabel();
        issueBookScrollPane = new JScrollPane();
        issueBookTable = new JTable();
    }
    private void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1540, 720));
        setMinimumSize(new Dimension(1540, 720));
        setPreferredSize(new Dimension(1540, 720));
        setSize(1540, 720);
        setLayout(null);

        issueBookPanel.setBackground(new Color(204, 204, 255));
        issueBookPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        issueBookPanel.setLayout(null);

        reasonLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        reasonLabel.setText("Reason");
        issueBookPanel.add(reasonLabel);
        reasonLabel.setBounds(20, 250, 80, 20);

        isbnLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        isbnLabel.setText("ISBN");
        issueBookPanel.add(isbnLabel);
        isbnLabel.setBounds(20, 40, 70, 20);

        rDLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        rDLabel.setText("Return Date");
        issueBookPanel.add(rDLabel);
        rDLabel.setBounds(20, 170, 80, 20);

        bDLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        bDLabel.setText("Borrow Date");
        issueBookPanel.add(bDLabel);
        bDLabel.setBounds(20, 130, 80, 20);

        studentLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        studentLabel.setText("Student");
        issueBookPanel.add(studentLabel);
        studentLabel.setBounds(20, 80, 80, 20);

        issueBookPanel.add(statusField);
        statusField.setBounds(120, 210, 160, 20);
        issueBookPanel.add(rDField);
        rDField.setBounds(120, 80, 160, 20);
        issueBookPanel.add(isbnField);
        isbnField.setBounds(120, 40, 160, 20);
        issueBookPanel.add(bdField);
        bdField.setBounds(120, 130, 160, 20);
        issueBookPanel.add(studentField);
        studentField.setBounds(120, 170, 160, 20);

        statusLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        statusLabel.setText("Status");
        issueBookPanel.add(statusLabel);
        statusLabel.setBounds(20, 210, 80, 20);

        reasonTextArea.setColumns(20);
        reasonTextArea.setRows(5);
        reasonScrollPane.setViewportView(reasonTextArea);

        issueBookPanel.add(reasonScrollPane);
        reasonScrollPane.setBounds(20, 280, 260, 130);

        returnedButton.setText("RETURNED");
        issueBookPanel.add(returnedButton);
        returnedButton.setBounds(20, 560, 260, 40);

        rejectButton.setText("REJECT");
        issueBookPanel.add(rejectButton);
        rejectButton.setBounds(20, 510, 260, 40);

        acceptButton1.setText("ACCEPT");
        issueBookPanel.add(acceptButton1);
        acceptButton1.setBounds(20, 460, 260, 40);

        add(issueBookPanel);
        issueBookPanel.setBounds(30, 80, 310, 620);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("ISSUE BOOK MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 250, 25);


        issueBookScrollPane.setViewportView(issueBookTable);
        if (issueBookTable.getColumnModel().getColumnCount() > 0) {
            issueBookTable.getColumnModel().getColumn(0).setMinWidth(50);
            issueBookTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            issueBookTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(issueBookScrollPane);
        issueBookScrollPane.setBounds(380, 80, 1130, 620);
    }

    public JTable getIssueBookTable() {
        return issueBookTable;
    }

    //Getters
    public String getIsbnField() {
        return isbnField.getText();
    }
    public String getrDField() {
        return rDField.getText();
    }
    public String getBdField() {
        return bdField.getText();
    }
    public String getStudentField() {
        return studentField.getText();
    }
    public String getStatusField() {
        return statusField.getText();
    }
    public String getReasonTextArea() {
        return reasonTextArea.getText();
    }

    //Setters
    public void setIsbnField(String s) {
        this.isbnField.setText(s);
    }
    public void setrDField(String s) {
        this.rDField.setText(s);
    }
    public void setBdField(String s) {
        this.bdField.setText(s);
    }
    public void setStudentField(String s) {
        this.studentField.setText(s);
    }
    public void setStatusField(String s) {
        this.statusField.setText(s);
    }
    public void setReasonTextArea(String s) {
        this.reasonTextArea.setText(s);
    }

    public void setRejectButtonListener(ActionListener actionListener){
        rejectButton.addActionListener(actionListener);
    }
    public void setAcceptButtonListener(ActionListener actionListener){
        acceptButton1.addActionListener(actionListener);
    }
    public void setReturnedButtonListener(ActionListener actionListener){
        returnedButton.addActionListener(actionListener);
    }
}
