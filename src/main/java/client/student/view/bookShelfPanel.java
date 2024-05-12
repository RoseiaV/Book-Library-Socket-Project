package main.java.client.student.view;

import javax.swing.*;
import java.awt.*;

public class bookShelfPanel extends JPanel {

    private JPanel bookShelfPanel;
    private JPanel borrowedBookContainer;
    private JLabel borrowedBookImage;
    private JPanel borrowedBookPanel;
    private JScrollPane borrowedBookScrollPane;
    private JLabel borrowedBooksLabel;
    private JPanel requestedBookContainer;
    private JLabel requestedBookImage;
    private JLabel requestedBookLabel;
    private JPanel requestedBookPanel;
    private JScrollPane requestedBookScrollPane;
    private JScrollPane scrollPane;

    public bookShelfPanel() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents() {
        scrollPane = new JScrollPane();
        bookShelfPanel = new JPanel();
        borrowedBooksLabel = new JLabel();
        requestedBookContainer = new JPanel();
        requestedBookScrollPane = new JScrollPane();
        requestedBookPanel = new JPanel();
        requestedBookImage = new JLabel();
        requestedBookLabel = new JLabel();
        borrowedBookContainer = new JPanel();
        borrowedBookScrollPane = new JScrollPane();
        borrowedBookPanel = new JPanel();
        borrowedBookImage = new JLabel();
    }

    public void initComponents() {
        setPreferredSize(new Dimension(1280, 650));
        setSize(1280, 650);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        bookShelfPanel.setBackground(new Color(255, 255, 255));
        bookShelfPanel.setPreferredSize(new Dimension(1260, 840));
        bookShelfPanel.setLayout(null);

        borrowedBooksLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        borrowedBooksLabel.setText("BORROWED BOOKS");
        borrowedBooksLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        bookShelfPanel.add(borrowedBooksLabel);
        borrowedBooksLabel.setBounds(10, 430, 1240, 40);

        requestedBookContainer.setLayout(null);
        requestedBookScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        requestedBookPanel.setBackground(new Color(221, 189, 113));
        requestedBookPanel.setMaximumSize(new Dimension(2000, 280));
        requestedBookPanel.setMinimumSize(new Dimension(2000, 280));
        requestedBookPanel.setPreferredSize(new Dimension(2000, 280));
        requestedBookPanel.setRequestFocusEnabled(false);
        requestedBookPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
        requestedBookScrollPane.setViewportView(requestedBookPanel);
        requestedBookContainer.add(requestedBookScrollPane);
        requestedBookScrollPane.setBounds(12, 13, 1210, 320);
        requestedBookImage.setHorizontalAlignment(SwingConstants.CENTER);
        requestedBookImage.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png")); // NOI18N
        requestedBookContainer.add(requestedBookImage);
        requestedBookImage.setBounds(0, 0, 1240, 350);
        bookShelfPanel.add(requestedBookContainer);
        requestedBookContainer.setBounds(10, 60, 1240, 350);
        requestedBookLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        requestedBookLabel.setText("REQUESTED BOOKS");
        requestedBookLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        bookShelfPanel.add(requestedBookLabel);
        requestedBookLabel.setBounds(10, 10, 1240, 40);

        borrowedBookContainer.setLayout(null);
        borrowedBookScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        borrowedBookPanel.setBackground(new Color(221, 189, 113));
        borrowedBookPanel.setMaximumSize(new Dimension(2000, 280));
        borrowedBookPanel.setMinimumSize(new Dimension(2000, 280));
        borrowedBookPanel.setPreferredSize(new Dimension(2000, 280));
        borrowedBookPanel.setRequestFocusEnabled(false);
        borrowedBookPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
        borrowedBookScrollPane.setViewportView(borrowedBookPanel);
        borrowedBookContainer.add(borrowedBookScrollPane);
        borrowedBookScrollPane.setBounds(12, 13, 1210, 320);
        borrowedBookImage.setHorizontalAlignment(SwingConstants.CENTER);
        borrowedBookImage.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png")); // NOI18N
        borrowedBookContainer.add(borrowedBookImage);
        borrowedBookImage.setBounds(0, 0, 1240, 350);
        bookShelfPanel.add(borrowedBookContainer);
        borrowedBookContainer.setBounds(10, 480, 1240, 350);

        scrollPane.setViewportView(bookShelfPanel);

        add(scrollPane);
        scrollPane.setBounds(0, 0, 1280, 650);
    }

    public JPanel getBorrowedBookPanel() {
        return borrowedBookPanel;
    }

    public JPanel getRequestedBookPanel() {
        return requestedBookPanel;
    }
}
