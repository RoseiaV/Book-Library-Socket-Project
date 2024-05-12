package main.java.server.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class ServerMainGUI extends JFrame{

    private JPanel bodyPanel;
    private JScrollPane connectClientsScrollPane;
    private JPanel connectedClientHeader;
    private JLabel connectedClientLabel;
    private JPanel connectedClientPanel;
    private JTable connectedClientTable;
    private JLabel headerLabel;
    private JPanel headerpanel;
    private JButton logOutButton;
    private JLabel serverManagementLabel;
    private JButton startServiceButton;
    private JPanel statusHeaderpanel;
    private JLabel statusLabel;
    public static JTextField statusTextField;
    private JPanel statuspanel;
    private JButton stopServiceButton;

    //Log In
    private JPanel leftPanel;
    private JButton logInButton;
    private JLabel passwordLabel;
    private JTextField passwordTextField;
    private JPanel rightPanel;
    private JLabel userNameLabel;
    private JTextField userNameTextField;

    public ServerMainGUI(){
        initComponents();
    }
    private void initComponents() {

        headerpanel = new JPanel();
        logOutButton = new JButton();
        serverManagementLabel = new JLabel();
        bodyPanel = new JPanel();
        headerLabel = new JLabel();
        connectedClientPanel = new JPanel();
        connectedClientHeader = new JPanel();
        connectedClientLabel = new JLabel();
        connectClientsScrollPane = new JScrollPane();
        connectedClientTable = new JTable();
        stopServiceButton = new JButton();
        startServiceButton = new JButton();
        statuspanel = new JPanel();
        statusHeaderpanel = new JPanel();
        statusLabel = new JLabel();
        statusTextField = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setMinimumSize(new Dimension(1280, 720));
        setSize(new Dimension(1280, 720));
        getContentPane().setLayout(null);

        headerpanel.setBackground(new Color(102, 58, 224));
        headerpanel.setLayout(null);

        logOutButton.setText("LOG OUT");
        logOutButton.setBorder(null);
        logOutButton.setBackground(new Color(204, 204, 255));
        logOutButton.setBorderPainted(false);
        logOutButton.setFocusPainted(false);
        headerpanel.add(logOutButton);
        logOutButton.setBounds(1145, 24, 110, 23);

        serverManagementLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        serverManagementLabel.setForeground(new Color(255, 255, 255));
        serverManagementLabel.setText("SERVER MANAGEMENT");
        headerpanel.add(serverManagementLabel);
        serverManagementLabel.setBounds(20, 20, 200, 25);

        getContentPane().add(headerpanel);
        headerpanel.setBounds(0, 0, 1280, 70);

        bodyPanel.setBackground(new Color(255, 255, 255));
        bodyPanel.setLayout(null);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("SERVER DASHBOARD");
        bodyPanel.add(headerLabel);
        headerLabel.setBounds(30, 30, 230, 25);

        connectedClientPanel.setBackground(new Color(255, 255, 255));
        connectedClientPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        connectedClientPanel.setLayout(null);

        connectedClientHeader.setBackground(new Color(204, 204, 255));
        connectedClientHeader.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        connectedClientHeader.setLayout(null);

        connectedClientLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        connectedClientLabel.setHorizontalAlignment(SwingConstants.LEFT);
        connectedClientLabel.setText("CONNECTED CLIENTS");
        connectedClientHeader.add(connectedClientLabel);
        connectedClientLabel.setBounds(10, 10, 120, 16);

        connectedClientPanel.add(connectedClientHeader);
        connectedClientHeader.setBounds(0, 0, 680, 40);

        connectedClientTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "#", "CLIENT", "IP ADDRESS"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        connectedClientTable.getTableHeader().setReorderingAllowed(false);
        connectClientsScrollPane.setViewportView(connectedClientTable);
        if (connectedClientTable.getColumnModel().getColumnCount() > 0) {
            connectedClientTable.getColumnModel().getColumn(0).setMinWidth(50);
            connectedClientTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            connectedClientTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        connectedClientPanel.add(connectClientsScrollPane);
        connectClientsScrollPane.setBounds(10, 50, 660, 400);

        bodyPanel.add(connectedClientPanel);
        connectedClientPanel.setBounds(30, 70, 680, 460);

        stopServiceButton.setText("STOP SERVICE");
        stopServiceButton.setBorder(null);
        stopServiceButton.setBackground(new Color(204, 204, 255));
        stopServiceButton.setBorderPainted(false);
        stopServiceButton.setFocusPainted(false);
        bodyPanel.add(stopServiceButton);
        stopServiceButton.setBounds(1080, 440, 140, 60);

        startServiceButton.setText("START SERVICE");
        startServiceButton.setBorder(null);
        startServiceButton.setBackground(new Color(204, 204, 255));
        startServiceButton.setBorderPainted(false);
        startServiceButton.setFocusPainted(false);
        bodyPanel.add(startServiceButton);
        startServiceButton.setBounds(790, 440, 140, 60);

        statuspanel.setBackground(new Color(255, 255, 255));
        statuspanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        statuspanel.setLayout(null);

        statusHeaderpanel.setBackground(new Color(204, 204, 255));
        statusHeaderpanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        statusHeaderpanel.setLayout(null);

        statusLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        statusLabel.setText("IP ADDRESS");
        statusHeaderpanel.add(statusLabel);
        statusLabel.setBounds(10, 10, 50, 16);

        statuspanel.add(statusHeaderpanel);
        statusHeaderpanel.setBounds(0, 0, 510, 40);

        statusTextField.setEditable(false);
        statusTextField.setBackground(new Color(255, 255, 255));
        statusTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        statusTextField.setHorizontalAlignment(JTextField.CENTER);
        statusTextField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        statuspanel.add(statusTextField);
        statusTextField.setBounds(60, 60, 400, 90);

        bodyPanel.add(statuspanel);
        statuspanel.setBounds(740, 70, 510, 180);

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 90, 1280, 560);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void logInForm() {
        leftPanel = new JPanel();
        passwordLabel = new JLabel();
        passwordTextField = new JTextField();
        userNameLabel = new JLabel();
        userNameTextField = new JTextField();
        logInButton = new JButton();
        rightPanel = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setMinimumSize(new Dimension(720, 480));
        setSize(new Dimension(720, 480));
        getContentPane().setLayout(null);

        leftPanel.setBackground(new Color(255, 255, 255));
        leftPanel.setLayout(null);

        passwordLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        passwordLabel.setText("PASSWORD");
        leftPanel.add(passwordLabel);
        passwordLabel.setBounds(20, 220, 90, 30);

        passwordTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        leftPanel.add(passwordTextField);
        passwordTextField.setBounds(130, 220, 310, 30);

        userNameLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        userNameLabel.setText("USERNAME");
        leftPanel.add(userNameLabel);
        userNameLabel.setBounds(20, 150, 90, 30);

        userNameTextField.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        leftPanel.add(userNameTextField);
        userNameTextField.setBounds(130, 150, 310, 30);

        logInButton.setText("LOG IN");
        leftPanel.add(logInButton);
        logInButton.setBounds(220, 320, 130, 30);

        getContentPane().add(leftPanel);
        leftPanel.setBounds(0, 0, 500, 480);

        rightPanel.setBackground(new Color(204, 204, 255));

        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 220, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(rightPanel);
        rightPanel.setBounds(500, 0, 220, 480);
    }

    //Main Frame Actions
    public void setStartServiceButton(ActionListener actionListener){
        startServiceButton.addActionListener(actionListener);
    }
    public void setStopServiceButton(ActionListener actionListener){
        stopServiceButton.addActionListener(actionListener);
    }
    public void setLogOutButton(ActionListener actionListener){
        logOutButton.addActionListener(actionListener);
    }

    //Log In Frame Action
    public void setLogInButton(ActionListener actionListener){
        logInButton.addActionListener(actionListener);
    }

    public JTextField getStatusTextField() {
        return statusTextField;
    }
    public void setIpAddressToStatusTextField() {
        try {
            String ipAddress = InetAddress.getLocalHost().getHostAddress();

            statusTextField.setText(ipAddress);
        } catch (Exception e ) {
            e.printStackTrace();
            statusTextField.setText("Unknown IP Address");
        }
    }
}
