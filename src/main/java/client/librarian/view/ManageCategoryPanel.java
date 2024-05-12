package client.librarian.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class ManageCategoryPanel extends JPanel {
    private JButton categoryCreateButton;
    private JButton categoryDeleteButton;
    private JLabel categoryLabel;
    private JScrollPane categoryScrollPane;
    private JTable categoryTable;
    private JTextField categoryTextField;
    private JButton categoryUpdateButton;
    private JLabel headerLabel;
    private JPanel manageHeader;
    private JPanel managePanel;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;

    public ManageCategoryPanel(){
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        managePanel = new JPanel();
        manageHeader = new JPanel();
        statusLabel = new JLabel();
        categoryTextField = new JTextField();
        categoryCreateButton = new JButton();
        categoryUpdateButton = new JButton();
        categoryDeleteButton = new JButton();
        categoryLabel = new JLabel();
        statusComboBox = new JComboBox<>();
        headerLabel = new JLabel();
        categoryScrollPane = new JScrollPane();
        categoryTable = new JTable();
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

        categoryTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        categoryTextField.setHorizontalAlignment(JTextField.LEFT);
        categoryTextField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        managePanel.add(categoryTextField);
        categoryTextField.setBounds(50, 140, 320, 30);

        categoryCreateButton.setText("CREATE");
        managePanel.add(categoryCreateButton);
        categoryCreateButton.setBounds(40, 553, 340, 40);

        categoryUpdateButton.setText("UPDATE");
        managePanel.add(categoryUpdateButton);
        categoryUpdateButton.setBounds(40, 430, 340, 40);

        categoryDeleteButton.setText("DELETE");
        managePanel.add(categoryDeleteButton);
        categoryDeleteButton.setBounds(40, 490, 340, 40);

        categoryLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        categoryLabel.setText("Category");
        managePanel.add(categoryLabel);
        categoryLabel.setBounds(50, 100, 90, 30);

        //Status Combo Box
        managePanel.add(statusComboBox);
        statusComboBox.setBounds(160, 210, 210, 30);

        add(managePanel);
        managePanel.setBounds(30, 80, 420, 610);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("CATEGORY MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 240, 25);

        //Category table
        categoryTable.getTableHeader().setReorderingAllowed(false);
        categoryScrollPane.setViewportView(categoryTable);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(0).setMinWidth(50);
            categoryTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            categoryTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(categoryScrollPane);
        categoryScrollPane.setBounds(530, 80, 970, 610);
    }

    public JTable getCategoryTable() {
        return categoryTable;
    }

    public String getCategoryTextField() {
        return categoryTextField.getText();
    }

    public void setCategoryTextField(String s) {
        this.categoryTextField.setText(s);
    }

    public JComboBox<String> getStatusComboBox() {
        return statusComboBox;
    }

    public void setCategoryCreateButtonListener(ActionListener actionListener){
        categoryCreateButton.addActionListener(actionListener);
    }
    public void setCategoryUpdateButtonListener(ActionListener actionListener){
        categoryUpdateButton.addActionListener(actionListener);
    }
    public void setCategoryDeleteButtonListener(ActionListener actionListener){
       categoryDeleteButton.addActionListener(actionListener);
    }
}
