package client.librarian.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageLanguagePanel extends JPanel {
    private JTextField languageTextField;
    private JButton createCreateButton;
    private JButton deleteDeleteButton;
    private JLabel headerLabel;
    private JLabel languageLabel;
    private JScrollPane languageScrollPane;
    private JTable languageTable;
    private JButton languageUpdateButton;
    private JPanel manageHeader;
    private JPanel managePanel;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;

    public ManageLanguagePanel(){
        instanceComponents();
        initComponents();
    }
    public void instanceComponents(){
        managePanel = new JPanel();
        manageHeader = new JPanel();
        statusLabel = new JLabel();
        languageTextField = new JTextField();
        createCreateButton = new JButton();
        languageUpdateButton = new JButton();
        deleteDeleteButton = new JButton();
        languageLabel = new JLabel();
        statusComboBox = new JComboBox<>();
        headerLabel = new JLabel();
        languageScrollPane = new JScrollPane();
        languageTable = new JTable();
    }
    private void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1540, 720));
        setMinimumSize(new Dimension(1540, 720));
        setPreferredSize(new Dimension(1540, 720));
        setSize(1540, 720);
        setLayout(null);

        managePanel.setBackground(new Color(255, 255, 255));
        managePanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        managePanel.setLayout(null);

        manageHeader.setBackground(new Color(204, 204, 255));
        manageHeader.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        manageHeader.setLayout(null);
        managePanel.add(manageHeader);
        manageHeader.setBounds(0, 0, 420, 40);

        statusLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        statusLabel.setText("STATUS");
        managePanel.add(statusLabel);
        statusLabel.setBounds(50, 210, 90, 30);

        languageTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        languageTextField.setHorizontalAlignment(JTextField.LEFT);
        languageTextField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        managePanel.add(languageTextField);
        languageTextField.setBounds(50, 140, 320, 30);

        createCreateButton.setText("CREATE");
        managePanel.add(createCreateButton);
        createCreateButton.setBounds(40, 553, 340, 40);

        languageUpdateButton.setText("UPDATE");
        managePanel.add(languageUpdateButton);
        languageUpdateButton.setBounds(40, 430, 340, 40);

        deleteDeleteButton.setText("DELETE");
        managePanel.add(deleteDeleteButton);
        deleteDeleteButton.setBounds(40, 490, 340, 40);

        languageLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        languageLabel.setText("Language");
        managePanel.add(languageLabel);
        languageLabel.setBounds(50, 100, 90, 30);

        //Status Combo Box
        managePanel.add(statusComboBox);
        statusComboBox.setBounds(160, 210, 210, 30);

        add(managePanel);
        managePanel.setBounds(30, 80, 420, 610);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("LANGUAGE MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 240, 25);


        //Language Table
        languageTable.getTableHeader().setReorderingAllowed(false);
        languageScrollPane.setViewportView(languageTable);
        if (languageTable.getColumnModel().getColumnCount() > 0) {
            languageTable.getColumnModel().getColumn(0).setMinWidth(50);
            languageTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            languageTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }
        add(languageScrollPane);
        languageScrollPane.setBounds(530, 80, 970, 610);
    }

    public JTable getLanguageTable() {
        return languageTable;
    }

    public String getLanguageTextField() {
        return languageTextField.getText();
    }

    public void setLanguageTextField(String s) {
        this.languageTextField.setText(s);
    }

    public JComboBox<String> getStatusComboBox() {
        return statusComboBox;
    }

    public void setCreateCreateButton(ActionListener actionListener){
        createCreateButton.addActionListener(actionListener);
    }
    public void setLanguageUpdateButton(ActionListener actionListener){
        languageUpdateButton.addActionListener(actionListener);
    }
    public void setLanguageDeleteButton(ActionListener actionListener){
        deleteDeleteButton.addActionListener(actionListener);
    }
}
