package main.java.client.student.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class viewBook extends JPanel {
    private JLabel bookISBN;
    private JLabel authorLabel;
    private JLabel authorName;
    private JLabel bookCategory;
    private JLabel bookDescriptionLabel;
    private JLabel bookDescrption;
    private JLabel bookImage;
    private JPanel bookImageContainer;
    private JLabel bookLanguage;
    private JLabel bookPublishedDate;
    private JLabel bookStatus;
    private JLabel bookTitle;
    private JLabel categoryLabel;
    private JLabel datePublishedLabel;
    private JComboBox<Integer> dayComboBox;
    private JLabel dayLabel;
    private JLabel footerImageBackground;
    private JPanel footerPanel;
    private JButton goBackButton;
    private JLabel headerImageBackground;
    private JPanel headerPanel;
    private JScrollPane reasonScrollPane;
    private JTextArea reasonTextPane;
    private JLabel languageLabel;
    private JComboBox<Integer> monthComboBox;
    private JLabel monthLabel;
    private JLabel noteLabel;
    private JLabel noteLabel1;
    private JLabel reasonLabel;
    private JPanel requestPanel;
    private JLabel requestThisBookLabel;
    private JButton sendRequestButton;
    private JLabel statusLabel;
    private JComboBox<Integer> yearComboBox;
    private JLabel yearlabel;
    private JToggleButton bookmarkButton;

    public viewBook() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        bookISBN = new JLabel();
        bookDescrption = new JLabel();
        requestPanel = new JPanel();
        requestThisBookLabel = new JLabel();
        sendRequestButton = new JButton();
        yearComboBox = new JComboBox<>();
        yearlabel = new JLabel();
        reasonLabel = new JLabel();
        monthLabel = new JLabel();
        dayComboBox = new JComboBox<>();
        monthComboBox = new JComboBox<>();
        noteLabel1 = new JLabel();
        noteLabel = new JLabel();
        dayLabel = new JLabel();
        reasonScrollPane = new JScrollPane();
        reasonTextPane = new JTextArea();
        bookImageContainer = new JPanel();
        bookImage = new JLabel();
        headerPanel = new JPanel();
        goBackButton = new JButton();
        bookTitle = new JLabel();
        authorName = new JLabel();
        authorLabel = new JLabel();
        headerImageBackground = new JLabel();
        footerPanel = new JPanel();
        footerImageBackground = new JLabel();
        bookPublishedDate = new JLabel();
        categoryLabel = new JLabel();
        bookCategory = new JLabel();
        languageLabel = new JLabel();
        bookLanguage = new JLabel();
        datePublishedLabel = new JLabel();
        bookStatus = new JLabel();
        bookDescriptionLabel = new JLabel();
        statusLabel = new JLabel();
        bookmarkButton = new JToggleButton();
    }
    public void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1280, 650));
        setMinimumSize(new Dimension(1280, 650));
        setPreferredSize(new Dimension(1280, 650));
        setSize(1280, 650);
        setLayout(null);

        bookDescrption.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        bookDescrption.setHorizontalAlignment(SwingConstants.LEFT);
        bookDescrption.setText("A guide to computer networks, protocols, and communication technologies.");
        bookDescrption.setVerticalAlignment(SwingConstants.TOP);
        add(bookDescrption);
        bookDescrption.setBounds(520, 430, 400, 90);

        requestPanel.setBackground(new Color(166, 82, 49));
        requestPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        requestPanel.setLayout(null);

        requestThisBookLabel.setFont(new Font("Swis721 BlkCn BT", 0, 24));
        requestThisBookLabel.setForeground(new Color(255, 255, 255));
        requestThisBookLabel.setHorizontalAlignment(SwingConstants.CENTER);
        requestThisBookLabel.setText("REQUEST THIS BOOK");
        requestThisBookLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        requestPanel.add(requestThisBookLabel);
        requestThisBookLabel.setBounds(20, 20, 230, 50);

        sendRequestButton.setBackground(new Color(255, 255, 255));
        sendRequestButton.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        sendRequestButton.setIcon(new ImageIcon("src/main/java/client/res/email_7438088.png"));
        sendRequestButton.setText("SEND REQUEST");
        sendRequestButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        requestPanel.add(sendRequestButton);
        sendRequestButton.setBounds(40, 400, 210, 40);

        yearComboBox.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        //yearComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        requestPanel.add(yearComboBox);
        yearComboBox.setBounds(150, 350, 100, 30);

        yearlabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        yearlabel.setForeground(new Color(255, 255, 255));
        yearlabel.setText("YEAR");
        yearlabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        requestPanel.add(yearlabel);
        yearlabel.setBounds(30, 350, 110, 30);

        reasonLabel.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        reasonLabel.setForeground(new Color(255, 255, 255));
        reasonLabel.setText("REASON");
        reasonLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        requestPanel.add(reasonLabel);
        reasonLabel.setBounds(20, 120, 240, 30);

        monthLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        monthLabel.setForeground(new Color(255, 255, 255));
        monthLabel.setText("MONTH");
        monthLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        requestPanel.add(monthLabel);
        monthLabel.setBounds(30, 310, 110, 30);

        dayComboBox.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        //dayComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        requestPanel.add(dayComboBox);
        dayComboBox.setBounds(150, 270, 100, 30);

        monthComboBox.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        //monthComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        requestPanel.add(monthComboBox);
        monthComboBox.setBounds(150, 310, 100, 30);

        noteLabel1.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        noteLabel1.setForeground(new Color(255, 255, 255));
        noteLabel1.setText("A DATE TODAY OR ONWARDS.");
        requestPanel.add(noteLabel1);
        noteLabel1.setBounds(60, 100, 200, 15);

        noteLabel.setFont(new Font("Swis721 BlkCn BT", 0, 12));
        noteLabel.setForeground(new Color(255, 255, 255));
        noteLabel.setText("NOTE : YOUR REQUEST DATE SHOULD BE EITHER ");
        requestPanel.add(noteLabel);
        noteLabel.setBounds(20, 80, 250, 15);

        dayLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        dayLabel.setForeground(new Color(255, 255, 255));
        dayLabel.setText("DAY");
        dayLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        requestPanel.add(dayLabel);
        dayLabel.setBounds(30, 270, 110, 30);

        reasonTextPane.setColumns(20);
        reasonTextPane.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        reasonTextPane.setRows(5);
        reasonScrollPane.setViewportView(reasonTextPane);

        requestPanel.add(reasonScrollPane);
        reasonScrollPane.setBounds(20, 160, 240, 96);

        add(requestPanel);
        requestPanel.setBounds(960, 120, 280, 460);

        bookImageContainer.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        bookImageContainer.setLayout(null);
        bookImage.setHorizontalAlignment(SwingConstants.CENTER);
        bookImageContainer.add(bookImage);
        bookImage.setBounds(3, 3, 315, 455);
        add(bookImageContainer);
        bookImageContainer.setBounds(40, 120, 320, 460);

        headerPanel.setLayout(null);

        goBackButton.setBackground(new Color(255, 255, 255));
        goBackButton.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        goBackButton.setIcon(new ImageIcon("src/main/java/client/res/undo_8482632.png"));
        goBackButton.setText("GO BACK");
        goBackButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        headerPanel.add(goBackButton);
        goBackButton.setBounds(30, 10, 140, 40);

        bookTitle.setFont(new Font("Swis721 BlkCn BT", 0, 36));
        bookTitle.setForeground(new Color(255, 255, 255));
        //bookTitle.setText("Networking Essentials");
        bookTitle.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        headerPanel.add(bookTitle);
        bookTitle.setBounds(380, 110, 530, 80);

        authorName.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        authorName.setForeground(new Color(255, 255, 255));
        //authorName.setText("RALPH ALOVEN LIQUIGAN");
        headerPanel.add(authorName);
        authorName.setBounds(500, 210, 260, 30);

        authorLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        authorLabel.setForeground(new Color(255, 255, 255));
        authorLabel.setText("AUTHOR     :");
        headerPanel.add(authorLabel);
        authorLabel.setBounds(380, 210, 110, 30);

        bookmarkButton.setBackground(new Color(255,255,255));
        bookmarkButton.setIcon(new ImageIcon("src/main/java/client/res/bookmark_disable.png"));
        bookmarkButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        bookmarkButton.setSelectedIcon(new ImageIcon("src/main/java/client/res/bookmark_enable.png"));
        headerPanel.add(bookmarkButton);
        bookmarkButton.setBounds(1200, 10, 40, 40);

        headerImageBackground.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png"));
        headerImageBackground.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        headerPanel.add(headerImageBackground);
        headerImageBackground.setBounds(0, 0, 1250, 250);

        add(headerPanel);
        headerPanel.setBounds(12, 13, 1250, 250);

        footerPanel.setLayout(null);

        footerImageBackground.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png"));
        footerImageBackground.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        footerPanel.add(footerImageBackground);
        footerImageBackground.setBounds(0, 0, 1240, 40);

        add(footerPanel);
        footerPanel.setBounds(20, 590, 1240, 40);

        bookPublishedDate.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        //bookPublishedDate.setText("DATE_PUBLISHED");
        add(bookPublishedDate);
        bookPublishedDate.setBounds(550, 370, 150, 40);

        categoryLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        categoryLabel.setText("CATEGORY  :");
        add(categoryLabel);
        categoryLabel.setBounds(390, 270, 100, 40);

        bookCategory.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        //bookCategory.setText("BOOK_CATEGORY");
        add(bookCategory);
        bookCategory.setBounds(510, 270, 200, 40);

        languageLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        languageLabel.setText(" LANGUAGE :");
        add(languageLabel);
        languageLabel.setBounds(390, 320, 100, 40);

        bookLanguage.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        //bookLanguage.setText("BOOK_LANGUAGE");
        add(bookLanguage);
        bookLanguage.setBounds(510, 320, 150, 40);

        datePublishedLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        datePublishedLabel.setText(" DATE PUBLISHED :");
        add(datePublishedLabel);
        datePublishedLabel.setBounds(390, 370, 160, 40);

        bookStatus.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        bookStatus.setText("BOOK_STATUS");
        add(bookStatus);
        bookStatus.setBounds(510, 530, 130, 40);

        bookDescriptionLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        bookDescriptionLabel.setText(" DESCRIPTION :");
        add(bookDescriptionLabel);
        bookDescriptionLabel.setBounds(390, 420, 130, 40);

        statusLabel.setFont(new Font("Swis721 BlkCn BT", 0, 18));
        statusLabel.setText("STATUS      : ");
        add(statusLabel);
        statusLabel.setBounds(390, 530, 100, 40);
    }

    public JLabel getBookISBN() {
        return bookISBN;
    }

    public JLabel getBookTitle() {
        return bookTitle;
    }

    public JLabel getAuthorName() {
        return authorName;
    }

    public JLabel getBookCategory() {
        return bookCategory;
    }

    public JLabel getBookLanguage() {
        return bookLanguage;
    }

    public JLabel getBookPublishedDate() {
        return bookPublishedDate;
    }

    public JLabel getBookDescrption() {
        return bookDescrption;
    }

    public JLabel getBookStatus() {
        return bookStatus;
    }

    public JTextArea getReasonTextPane() {
        return reasonTextPane;
    }

    //Combo Boxes
    public JComboBox<Integer> getDayComboBox() {
        return dayComboBox;
    }

    public JComboBox<Integer> getMonthComboBox() {
        return monthComboBox;
    }

    public JComboBox<Integer> getYearComboBox() {
        return yearComboBox;
    }

    public JLabel getBookImage() {
        return bookImage;
    }

    public JButton getSendRequestButton() {
        return sendRequestButton;
    }

    public JToggleButton getBookmarkButton() {
        return bookmarkButton;
    }

    //Sets the Request
    public void setSendRequestButtonListener(ActionListener actionListener){
        sendRequestButton.addActionListener(actionListener);
    }
    public void setGoBackButtonListener(ActionListener actionListener){
        goBackButton.addActionListener(actionListener);
    }
    public void setBookmarkButtonListener(ItemListener itemListener){
        bookmarkButton.addItemListener(itemListener);
    }

    public void setMonthComboBoxItemListener(ItemListener itemListener){
        monthComboBox.addItemListener(itemListener);
    }
    public void setYearComboBoxItemListener(ItemListener itemListener){
        yearComboBox.addItemListener(itemListener);
    }
}
