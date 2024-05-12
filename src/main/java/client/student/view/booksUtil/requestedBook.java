
package client.student.view.booksUtil;

import javax.swing.*;
import java.awt.*;

public class requestedBook extends JPanel {
    private JLabel authorLabel;
    private JLabel booknameLabel;
    private JButton cancelButton;
    private JPanel customPanel;
    private JLabel jLabel1;
    private JLabel requestedReturnLabel;
    private JLabel returnDateLabel;
    private JButton viewButton;

    public requestedBook() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        customPanel = new JPanel();
        jLabel1 = new JLabel();
        booknameLabel = new JLabel();
        returnDateLabel = new JLabel();
        requestedReturnLabel = new JLabel();
        cancelButton = new JButton();
        viewButton = new JButton();
        authorLabel = new JLabel();
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

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("src/main/java/client/librarian/res/pixlr-image-generator-6622ff433bac573be2d680da.png"));
        customPanel.add(jLabel1);
        jLabel1.setBounds(3, 3, 195, 105);

        add(customPanel);
        customPanel.setBounds(12, 13, 200, 110);

        booknameLabel.setBackground(new Color(255, 255, 255));
        booknameLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        booknameLabel.setForeground(new Color(255, 255, 255));
        booknameLabel.setText("BOOKNAME");
        booknameLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        add(booknameLabel);
        booknameLabel.setBounds(10, 130, 200, 30);

        returnDateLabel.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        returnDateLabel.setForeground(new Color(255, 255, 255));
        returnDateLabel.setText("RETURN DATE");
        add(returnDateLabel);
        returnDateLabel.setBounds(130, 200, 80, 15);

        requestedReturnLabel.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        requestedReturnLabel.setForeground(new Color(255, 255, 255));
        requestedReturnLabel.setText("REQUESTED RETURN :");
        add(requestedReturnLabel);
        requestedReturnLabel.setBounds(10, 200, 120, 15);

        cancelButton.setBackground(new Color(255, 255, 255));
        cancelButton.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(null);
        add(cancelButton);
        cancelButton.setBounds(10, 235, 90, 30);

        viewButton.setBackground(new Color(255, 255, 255));
        viewButton.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        viewButton.setText("VIEW");
        viewButton.setBorder(null);
        add(viewButton);
        viewButton.setBounds(117, 235, 90, 30);

        authorLabel.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        authorLabel.setForeground(new Color(255, 255, 255));
        authorLabel.setText("AUTHOR");
        add(authorLabel);
        authorLabel.setBounds(10, 170, 200, 20);
    }

    public JLabel getBooknameLabel() {
        return booknameLabel;
    }

    public JLabel getAuthorLabel() {
        return authorLabel;
    }

    public JLabel getReturnDateLabel() {
        return returnDateLabel;
    }
}
