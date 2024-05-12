package client.librarian.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManageLibraryPanel extends JPanel {
    private JButton addBookButton;
    private JPanel addBookPanel;
    private JComboBox<String> authorComboBox;
    private JLabel authorLabel;
    private JTextField bookNameTextField;
    private JTable bookTable;
    private JLabel booknameLabel;
    private JScrollPane booksScrollPane;
    private JComboBox<String> categoryComboBox;
    private JLabel categoryLabel;
    private JButton deleteBookButton;
    private JLabel descriptionLabel;
    private JScrollPane descriptionScrollPane;
    private JTextArea descriptionTextArea;
    private JButton fileButton;
    private JLabel headerLabel;
    private JLabel isbnLabel;
    private JTextField isbnTextfield;
    private JComboBox<String> languageComboBox;
    private JLabel languageLabel;
    private JTextField searchField;
    private JLabel searchLabel;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;
    private JButton updateButton;
    private JButton diselectButton;
    private JLabel imageLabel;


    public ImagePanel imagePanel;

    public ManageLibraryPanel(){
        instanceComponents();
        initComponents();
    }
    public void instanceComponents(){
        booksScrollPane = new JScrollPane();
        bookTable = new JTable();
        headerLabel = new JLabel();
        addBookPanel = new JPanel();
        booknameLabel = new JLabel();
        bookNameTextField = new JTextField();
        languageLabel = new JLabel();
        isbnTextfield = new JTextField();
        isbnLabel = new JLabel();
        descriptionLabel = new JLabel();
        languageComboBox = new JComboBox<>();
        categoryComboBox = new JComboBox<>();
        categoryLabel = new JLabel();
        descriptionScrollPane = new JScrollPane();
        descriptionTextArea = new JTextArea();
        authorLabel = new JLabel();
        authorComboBox = new JComboBox<>();
        updateButton = new JButton();
        deleteBookButton = new JButton();
        statusLabel = new JLabel();
        statusComboBox = new JComboBox<>();
        addBookButton = new JButton();
        imagePanel = new ImagePanel();
        fileButton = new JButton();
        diselectButton = new JButton();
        searchLabel = new JLabel();
        searchField = new JTextField();
        imageLabel = new JLabel();
    }
    private void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1540, 720));
        setMinimumSize(new Dimension(1540, 720));
        setPreferredSize(new Dimension(1540, 720));
        setSize(1540, 720);
        setLayout(null);

        booksScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        bookTable.getTableHeader().setReorderingAllowed(false);
        booksScrollPane.setViewportView(bookTable);

        add(booksScrollPane);
        booksScrollPane.setBounds(490, 110, 1030, 590);

        headerLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        headerLabel.setText("LIBRARY MANAGEMENT");
        add(headerLabel);
        headerLabel.setBounds(30, 30, 210, 25);

        addBookPanel.setBackground(new Color(204, 204, 255));
        addBookPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        addBookPanel.setLayout(null);

        booknameLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        booknameLabel.setText("BOOKNAME");
        addBookPanel.add(booknameLabel);
        booknameLabel.setBounds(180, 300, 70, 16);

        bookNameTextField.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        bookNameTextField.setHorizontalAlignment(JTextField.LEFT);
        bookNameTextField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        addBookPanel.add(bookNameTextField);
        bookNameTextField.setBounds(260, 300, 150, 18);

        languageLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        languageLabel.setText("LANGUAGE");
        addBookPanel.add(languageLabel);
        languageLabel.setBounds(10, 400, 70, 16);

        isbnTextfield.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        isbnTextfield.setHorizontalAlignment(JTextField.LEFT);
        isbnTextfield.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        addBookPanel.add(isbnTextfield);
        isbnTextfield.setBounds(50, 300, 110, 18);

        isbnLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        isbnLabel.setText("ISBN");
        addBookPanel.add(isbnLabel);
        isbnLabel.setBounds(10, 300, 37, 16);

        descriptionLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        descriptionLabel.setText("DESCRIPTION");
        addBookPanel.add(descriptionLabel);
        descriptionLabel.setBounds(10, 450, 80, 16);

        //Language Combo Box
        addBookPanel.add(languageComboBox);
        languageComboBox.setBounds(90, 400, 110, 20);

        //Category Combo Box
        addBookPanel.add(categoryComboBox);
        categoryComboBox.setBounds(280, 350, 130, 20);

        categoryLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        categoryLabel.setText("CATEGORY");
        addBookPanel.add(categoryLabel);
        categoryLabel.setBounds(210, 350, 60, 16);

        descriptionScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        descriptionScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        addBookPanel.add(descriptionScrollPane);
        descriptionScrollPane.setBounds(10, 470, 400, 90);

        authorLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        authorLabel.setText("AUTHOR");
        addBookPanel.add(authorLabel);
        authorLabel.setBounds(10, 350, 60, 16);

        //Author Combo Box
        addBookPanel.add(authorComboBox);
        authorComboBox.setBounds(90, 350, 110, 20);

        updateButton.setText("UPDATE");
        addBookPanel.add(updateButton);
        updateButton.setBounds(20, 580, 100, 23);

        deleteBookButton.setText("DELETE");
        addBookPanel.add(deleteBookButton);
        deleteBookButton.setBounds(160, 580, 100, 23);

        statusLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        statusLabel.setText("STATUS");
        addBookPanel.add(statusLabel);
        statusLabel.setBounds(210, 400, 60, 16);

        //Status Combo Box
        addBookPanel.add(statusComboBox);
        statusComboBox.setBounds(280, 400, 130, 20);

        addBookButton.setText("ADD BOOK");
        addBookPanel.add(addBookButton);
        addBookButton.setBounds(300, 580, 100, 23);


        imageLabel.setBounds(0,0,260,260);
        imagePanel.add(imageLabel);
        imagePanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        imagePanel.setLayout(null);
        addBookPanel.add(imagePanel);
        imagePanel.setBounds(20, 20, 260, 260);

        fileButton.setText("FILE");
        addBookPanel.add(fileButton);
        fileButton.setBounds(310, 110, 90, 23);

        diselectButton.setText("DISELECT");
        addBookPanel.add(diselectButton);
        diselectButton.setBounds(310, 160, 90, 23);

        add(addBookPanel);
        addBookPanel.setBounds(30, 80, 420, 620);

        searchLabel.setFont(new Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchLabel.setText("SEARCH");
        add(searchLabel);
        searchLabel.setBounds(490, 80, 60, 20);
        add(searchField);
        searchField.setBounds(590, 80, 330, 22);
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }

    public static class ImagePanel extends JPanel {
        public static BufferedImage image;
        public ImagePanel(){
            this.setBackground(new Color(255,255,255));
            this.setPreferredSize(new Dimension(260, 260));
            this.setSize(260, 260);
        }

        @Override
        public void paint(Graphics graphics){
            super.paint(graphics);
            Graphics2D graphics2D = (Graphics2D) graphics;
            if (image != null) {
                graphics2D.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            }
        }

        public void updateImage(File file){
            try {
                image = ImageIO.read(file);
                repaint();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void clearImage() {
            image = null;
            repaint();

        }
    }

    public void setUpdateImage(File file){
        ImagePanel i = new ImagePanel();
        i.updateImage(file);
        imagePanel.updateImage(file);
    }


    //Getter for table
    public JTable getBookTable() {
        return bookTable;
    }

    //Getters
    public String getIsbnTextfield() {
        return isbnTextfield.getText();
    }
    public String getBookNameTextField() {
        return bookNameTextField.getText();
    }
    public JComboBox<String> getAuthorComboBox() {
        return authorComboBox;
    }
    public JComboBox<String> getCategoryComboBox() {
        return categoryComboBox;
    }
    public JComboBox<String> getLanguageComboBox() {
        return languageComboBox;
    }
    public JComboBox<String> getStatusComboBox() {
        return statusComboBox;
    }
    public String getDescriptionTextArea() {
        return descriptionTextArea.getText();
    }

    //Setters
    public void setIsbnTextfield(String isbnTextfield) {
        this.isbnTextfield.setText(isbnTextfield);
    }
    public void setBookNameTextField(String bookNameTextField) {
        this.bookNameTextField.setText(bookNameTextField);
    }
    public void setAuthorComboBox(JComboBox<String> authorComboBox) {
        this.authorComboBox = authorComboBox;
    }
    public void setCategoryComboBox(JComboBox<String> categoryComboBox) {
        this.categoryComboBox = categoryComboBox;
    }
    public void setLanguageComboBox(JComboBox<String> languageComboBox) {
        this.languageComboBox = languageComboBox;
    }
    public void setStatusComboBox(JComboBox<String> statusComboBox) {
        this.statusComboBox = statusComboBox;
    }

    public void setDescriptionTextArea(String descriptionTextArea) {
        this.descriptionTextArea.setText(descriptionTextArea);
    }

    //Button Listeners
    public void setUpdateButtonListener(ActionListener actionListener){
        updateButton.addActionListener(actionListener);
    }
    public void setDeleteBookButtonListener(ActionListener actionListener){
        deleteBookButton.addActionListener(actionListener);
    }
    public void setCreateButtonListener(ActionListener actionListener){
        addBookButton.addActionListener(actionListener);
    }
    public void setFileButtonListener(ActionListener actionListener){
        fileButton.addActionListener(actionListener);
    }
    public void setDiselectButtonListener(ActionListener actionListener){
        diselectButton.addActionListener(actionListener);
    }

}
