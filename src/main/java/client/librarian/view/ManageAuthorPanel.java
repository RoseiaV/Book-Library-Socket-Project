package client.librarian.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageAuthorPanel extends JPanel {
    private JLabel AuthorLabel1;
    private JButton authorCreateButton;
    private JButton authorDeleteButton;
    private JScrollPane authorScrollPane;
    private JTable authorTable;
    private JTextField authorTextField;
    private JButton authorUpdateButton;
    private JLabel headerLabel;
    private JPanel manageAuthorHeaderPanel;
    private JPanel manageAuthorPanel;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;

    public ManageAuthorPanel(){
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        headerLabel = new JLabel();
        manageAuthorPanel = new JPanel();
        manageAuthorHeaderPanel = new JPanel();
        statusLabel = new JLabel();
        authorTextField = new JTextField();
        authorCreateButton = new JButton();
        authorUpdateButton = new JButton();
        authorDeleteButton = new JButton();
        AuthorLabel1 = new JLabel();
        statusComboBox = new JComboBox<>();
        authorScrollPane = new JScrollPane();
        authorTable = new JTable();
    }

    private void initComponents() {
        setBackground(new Color(255,255,255));
        setMaximumSize(new Dimension(1540, 720));
        setMinimumSize(new Dimension(1540, 720));
        setPreferredSize(new Dimension(1540, 720));
        setSize(1540, 720);
        setLayout(null);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("AUTHOR MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 210, 25);

        manageAuthorPanel.setBackground(new Color(255, 255, 255));
        manageAuthorPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        manageAuthorPanel.setLayout(null);

        manageAuthorHeaderPanel.setBackground(new Color(204, 204, 255));
        manageAuthorHeaderPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        manageAuthorHeaderPanel.setLayout(null);
        manageAuthorPanel.add(manageAuthorHeaderPanel);
        manageAuthorHeaderPanel.setBounds(0, 0, 420, 40);

        statusLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        statusLabel.setText("STATUS");
        manageAuthorPanel.add(statusLabel);
        statusLabel.setBounds(50, 210, 90, 30);

        authorTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        authorTextField.setHorizontalAlignment(JTextField.LEFT);
        authorTextField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        manageAuthorPanel.add(authorTextField);
        authorTextField.setBounds(50, 140, 320, 30);

        authorCreateButton.setText("CREATE");
        manageAuthorPanel.add(authorCreateButton);
        authorCreateButton.setBounds(40, 553, 340, 40);

        authorUpdateButton.setText("UPDATE");
        manageAuthorPanel.add(authorUpdateButton);
        authorUpdateButton.setBounds(40, 430, 340, 40);

        authorDeleteButton.setText("DELETE");
        manageAuthorPanel.add(authorDeleteButton);
        authorDeleteButton.setBounds(40, 490, 340, 40);

        AuthorLabel1.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AuthorLabel1.setText("AUTHOR");
        manageAuthorPanel.add(AuthorLabel1);
        AuthorLabel1.setBounds(50, 100, 90, 30);

        manageAuthorPanel.add(statusComboBox);
        statusComboBox.setBounds(160, 210, 210, 30);

        add(manageAuthorPanel);
        manageAuthorPanel.setBounds(30, 80, 420, 610);


        //Author table
        authorTable.getTableHeader().setReorderingAllowed(false);
        authorScrollPane.setViewportView(authorTable);
        if (authorTable.getColumnModel().getColumnCount() > 0) {
            authorTable.getColumnModel().getColumn(0).setMinWidth(50);
            authorTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            authorTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(authorScrollPane);
        authorScrollPane.setBounds(530, 80, 970, 610);
    }

    public JTable getAuthorTable() {
        return authorTable;
    }

    public String getAuthorTextField() {
        return authorTextField.getText();
    }

    public void setAuthorTextField(String s) {
        this.authorTextField.setText(s);
    }

    public JComboBox<String> getStatusComboBox() {
        return statusComboBox;
    }

    public void setAuthorCreateButton(ActionListener actionListener){
        authorCreateButton.addActionListener(actionListener);
    }
    public void setAuthorUpdateButton(ActionListener actionListener){
        authorUpdateButton.addActionListener(actionListener);
    }
    public void setAuthorDeleteButton(ActionListener actionListener){
        authorDeleteButton.addActionListener(actionListener);
    }
}
