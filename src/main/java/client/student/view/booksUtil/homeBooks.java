package client.student.view.booksUtil;

import javax.swing.*;
import java.awt.*;

public class homeBooks extends JPanel {

    private JLabel authorLabel;
    private JLabel booknameLabel;
    private JLabel categoryLabel;
    private JPanel customPanel;
    private JButton viewButton;
    private JLabel imagePanel;

    public homeBooks() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        customPanel = new JPanel();
        imagePanel = new JLabel();
        booknameLabel = new JLabel();
        authorLabel = new JLabel();
        categoryLabel = new JLabel();
        viewButton = new JButton();
    }
    public void initComponents() {
        setBackground(new Color(166, 82, 49));
        setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        setMaximumSize(new Dimension(230, 280));
        setMinimumSize(new Dimension(230, 280));
        setPreferredSize(new Dimension(230, 280));
        setLayout(null);

        customPanel.setBackground(new Color(221, 189, 113));
        customPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        customPanel.setLayout(null);

        imagePanel.setHorizontalAlignment(SwingConstants.CENTER);
        imagePanel.setIcon(new ImageIcon("src/main/java/client/res/pixlr-image-generator-6622ff433bac573be2d680da.png"));
        customPanel.add(imagePanel);
        imagePanel.setBounds(3, 3, 195, 105);

        add(customPanel);
        customPanel.setBounds(12, 13, 200, 110);

        booknameLabel.setBackground(new Color(255, 255, 255));
        booknameLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        booknameLabel.setForeground(new Color(255, 255, 255));
        booknameLabel.setText("BOOKNAME");
        booknameLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        add(booknameLabel);
        booknameLabel.setBounds(10, 130, 200, 30);

        authorLabel.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        authorLabel.setForeground(new Color(255, 255, 255));
        authorLabel.setText("AUTHOR");
        add(authorLabel);
        authorLabel.setBounds(10, 170, 200, 15);

        categoryLabel.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        categoryLabel.setForeground(new Color(255, 255, 255));
        categoryLabel.setText("CATEGORY");
        add(categoryLabel);
        categoryLabel.setBounds(10, 200, 200, 15);

        viewButton.setBackground(new Color(255, 255, 255));
        viewButton.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        viewButton.setText("VIEW");
        viewButton.setBorder(null);
        add(viewButton);
        viewButton.setBounds(117, 235, 90, 30);
    }

    public JButton getViewButton() {
        return viewButton;
    }

    public JLabel getBooknameLabel() {
        return booknameLabel;
    }

    public JLabel getAuthorLabel() {
        return authorLabel;
    }

    public JLabel getCategoryLabel() {
        return categoryLabel;
    }

}
