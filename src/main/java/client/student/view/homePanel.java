package main.java.client.student.view;

import javax.swing.*;
import java.awt.*;

public class homePanel extends JPanel {

    private JPanel headerPanel;
    private JLabel imageLabel;
    private JPanel newBooksContainer;
    private JPanel newBooksPanel;
    private JScrollPane newBooksScrollPane;
    private JLabel otherLabel1;
    private JLabel otherLabel2;
    private JLabel otherLabel3;
    private JLabel welcomingLabel;
    private JLabel whatsNewBGImage;
    private JLabel whatsNewLabel;

    public homePanel() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        headerPanel = new JPanel();
        welcomingLabel = new JLabel();
        otherLabel1 = new JLabel();
        otherLabel2 = new JLabel();
        otherLabel3 = new JLabel();
        imageLabel = new JLabel();
        whatsNewLabel = new JLabel();
        newBooksContainer = new JPanel();
        newBooksScrollPane = new JScrollPane();
        newBooksPanel = new JPanel();
        whatsNewBGImage = new JLabel();
    }

    public void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1280, 650));
        setMinimumSize(new Dimension(1280, 650));
        setPreferredSize(new Dimension(1280, 650));
        setSize(1280, 650);
        setLayout(null);

        headerPanel.setPreferredSize(new Dimension(1280, 650));
        headerPanel.setLayout(null);

        welcomingLabel.setFont(new Font("Swis721 BlkCn BT", 0, 36)); // NOI18N
        welcomingLabel.setForeground(new Color(255, 255, 255));
        //welcomingLabel.setText("WELCOME USERNAME");
        headerPanel.add(welcomingLabel);
        welcomingLabel.setBounds(30, 10, 384, 85);

        otherLabel1.setFont(new Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        otherLabel1.setForeground(new Color(255, 255, 255));
        otherLabel1.setText("words come alive and stories unfold.");
        headerPanel.add(otherLabel1);
        otherLabel1.setBounds(30, 150, 520, 30);

        otherLabel2.setFont(new Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        otherLabel2.setForeground(new Color(255, 255, 255));
        otherLabel2.setText("Step into a world of imagination, knowledge, and endless possibilities.");
        headerPanel.add(otherLabel2);
        otherLabel2.setBounds(30, 90, 520, 30);

        otherLabel3.setFont(new Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        otherLabel3.setForeground(new Color(255, 255, 255));
        otherLabel3.setText("Our Books Library is a haven for book lovers, a sanctuary where ");
        headerPanel.add(otherLabel3);
        otherLabel3.setBounds(30, 120, 520, 30);

        imageLabel.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png")); // NOI18N
        headerPanel.add(imageLabel);
        imageLabel.setBounds(0, 0, 1250, 210);
        add(headerPanel);
        headerPanel.setBounds(10, 10, 1250, 210);

        whatsNewLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        whatsNewLabel.setText("WHAT'S NEW");
        whatsNewLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 0, 0)));
        add(whatsNewLabel);
        whatsNewLabel.setBounds(10, 230, 1250, 40);

        newBooksContainer.setLayout(null);
        newBooksScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        newBooksPanel.setBackground(new Color(221, 189, 113));
        newBooksPanel.setMaximumSize(new Dimension(2000, 280));
        newBooksPanel.setMinimumSize(new Dimension(2000, 280));
        newBooksPanel.setPreferredSize(new Dimension(2000, 280));
        newBooksPanel.setRequestFocusEnabled(false);
        newBooksPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
        newBooksScrollPane.setViewportView(newBooksPanel);
        newBooksContainer.add(newBooksScrollPane);
        newBooksScrollPane.setBounds(12, 13, 1220, 310);

        whatsNewBGImage.setHorizontalAlignment(SwingConstants.CENTER);
        whatsNewBGImage.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png")); // NOI18N
        newBooksContainer.add(whatsNewBGImage);
        whatsNewBGImage.setBounds(0, 0, 1250, 340);
        add(newBooksContainer);
        newBooksContainer.setBounds(10, 280, 1250, 340);
    }

    public JPanel getNewBooksPanel() {
        return newBooksPanel;
    }

    public JLabel getWelcomingLabel() {
        return welcomingLabel;
    }
}
