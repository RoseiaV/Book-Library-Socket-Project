package client.librarian.view;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ManageRolePanel extends JPanel {
    private JLabel headerLabel;
    private JPanel manageHeader;
    private JPanel managePanel;
    private JButton roleCreateButton;
    private JButton roleDeleteButton;
    private JLabel roleLabel;
    private JScrollPane roleScrollPane;
    private JTable roleTable;
    private JTextField roleTextField;
    private JButton roleUpdateButton;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;

    public ManageRolePanel(){
        instanceComponents();
        initComponents();
    }
    public void instanceComponents(){
        managePanel = new JPanel();
        manageHeader = new JPanel();
        statusLabel = new JLabel();
        roleTextField = new JTextField();
        roleCreateButton = new JButton();
        roleUpdateButton = new JButton();
        roleDeleteButton = new JButton();
        roleLabel = new JLabel();
        statusComboBox = new JComboBox<>();
        headerLabel = new JLabel();
        roleScrollPane = new JScrollPane();
        roleTable = new JTable();
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

        roleTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        roleTextField.setHorizontalAlignment(JTextField.LEFT);
        roleTextField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        managePanel.add(roleTextField);
        roleTextField.setBounds(50, 140, 320, 30);

        roleCreateButton.setText("CREATE");
        managePanel.add(roleCreateButton);
        roleCreateButton.setBounds(40, 553, 340, 40);

        roleUpdateButton.setText("UPDATE");
        managePanel.add(roleUpdateButton);
        roleUpdateButton.setBounds(40, 430, 340, 40);

        roleDeleteButton.setText("DELETE");
        managePanel.add(roleDeleteButton);
        roleDeleteButton.setBounds(40, 490, 340, 40);

        roleLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        roleLabel.setText("Role");
        managePanel.add(roleLabel);
        roleLabel.setBounds(50, 100, 90, 30);

        //Status Combo Box
        managePanel.add(statusComboBox);
        statusComboBox.setBounds(160, 210, 210, 30);

        add(managePanel);
        managePanel.setBounds(30, 80, 420, 610);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("ROLE MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 240, 25);

        //Role Table
        roleTable.getTableHeader().setReorderingAllowed(false);
        roleScrollPane.setViewportView(roleTable);
        if (roleTable.getColumnModel().getColumnCount() > 0) {
            roleTable.getColumnModel().getColumn(0).setMinWidth(50);
            roleTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            roleTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(roleScrollPane);
        roleScrollPane.setBounds(530, 80, 970, 610);
    }

    public JTable getRoleTable() {
        return roleTable;
    }

    public String getRoleTextField() {
        return roleTextField.getText();
    }

    public void setRoleTextField(String s) {
        this.roleTextField.setText(s);
    }

    public JComboBox<String> getStatusComboBox() {
        return statusComboBox;
    }

    public void setRoleCreateButtonListener(ActionListener actionListener){
        roleCreateButton.addActionListener(actionListener);
    }
    public void setRoleUpdateButtonListener(ActionListener actionListener){
        roleUpdateButton.addActionListener(actionListener);
    }
    public void setRoleDeleteButtonListener(ActionListener actionListener){
        roleDeleteButton.addActionListener(actionListener);
    }

}
