package main.java.client.student.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class libraryPanel extends JPanel {

    private JPanel booksContainer;
    private JLabel booksImageBG;
    private JPanel booksPanel;
    private JScrollPane booksScrollPane;
    private JComboBox<String> categoryComboBox;
    private JButton clearButton;
    private JLabel filterBGImage;
    private JPanel filterPanel;
    private JComboBox<String> languageComboBox;
    private JLabel searchBGImage;
    private JTextField searchField;
    private JLabel searchLabel;
    private JPanel searchPanel;

    public libraryPanel() {
        instanceComponents();
        initComponents();
    }

    public void instanceComponents(){
        searchPanel = new JPanel();
        searchField = new JTextField();
        searchLabel = new JLabel();
        clearButton = new JButton();
        searchBGImage = new JLabel();
        filterPanel = new JPanel();
        languageComboBox = new JComboBox<>();
        categoryComboBox = new JComboBox<>();
        filterBGImage = new JLabel();
        booksContainer = new JPanel();
        booksScrollPane = new JScrollPane();
        booksPanel = new JPanel();
        booksImageBG = new JLabel();
    }

    public void initComponents() {
        setBackground(new Color(255, 255, 255));
        setMaximumSize(new Dimension(1280, 650));
        setMinimumSize(new Dimension(1280, 650));
        setPreferredSize(new Dimension(1280, 650));
        setSize(1280, 650);
        setLayout(null);

        searchPanel.setLayout(null);
        searchField.setFont(new Font("Verdana", 0, 18));
        searchField.setBorder(null);
        searchPanel.add(searchField);
        searchField.setBounds(160, 10, 590, 50);

        searchLabel.setFont(new Font("Swis721 BlkCn BT", 0, 24));
        searchLabel.setForeground(new Color(255, 255, 255));
        searchLabel.setHorizontalAlignment(SwingConstants.CENTER);
        searchLabel.setText("SEARCH");
        searchPanel.add(searchLabel);
        searchLabel.setBounds(50, 10, 110, 50);

        clearButton.setBackground(new Color(255, 255, 255));
        clearButton.setIcon(new ImageIcon("src/main/java/client/res/circle-x_10489539 (1).png"));
        clearButton.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, new Color(0, 0, 0)));
        searchPanel.add(clearButton);
        clearButton.setBounds(750, 10, 60, 50);

        searchBGImage.setHorizontalAlignment(SwingConstants.CENTER);
        searchBGImage.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png"));
        searchPanel.add(searchBGImage);
        searchBGImage.setBounds(0, 0, 860, 70);
        add(searchPanel);
        searchPanel.setBounds(10, 10, 860, 70);

        filterPanel.setLayout(null);

        languageComboBox.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        //languageComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterPanel.add(languageComboBox);
        languageComboBox.setBounds(20, 15, 150, 40);

        categoryComboBox.setFont(new Font("Swis721 BlkCn BT", 0, 14));
        //categoryComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterPanel.add(categoryComboBox);
        categoryComboBox.setBounds(220, 15, 150, 40);

        filterBGImage.setHorizontalAlignment(SwingConstants.CENTER);
        filterBGImage.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png"));
        filterPanel.add(filterBGImage);
        filterBGImage.setBounds(0, 0, 380, 70);
        add(filterPanel);
        filterPanel.setBounds(890, 10, 380, 70);

        booksContainer.setLayout(null);
        booksScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        booksPanel.setBackground(new Color(221, 189, 113));
        booksPanel.setMaximumSize(new Dimension(1185, 2000));
        booksPanel.setMinimumSize(new Dimension(1185, 2000));
        booksPanel.setPreferredSize(new Dimension(1185, 2000));
        booksPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 55, 30));
        booksScrollPane.setViewportView(booksPanel);

        booksContainer.add(booksScrollPane);
        booksScrollPane.setBounds(20, 20, 1210, 500);

        booksImageBG.setIcon(new ImageIcon("src/main/java/client/res/2891329_citrusmillie_the-willow-library-pixel-art-wallpaper.png"));
        booksContainer.add(booksImageBG);
        booksImageBG.setBounds(0, 0, 1260, 540);

        add(booksContainer);
        booksContainer.setBounds(10, 100, 1260, 540);
    }

    public JPanel getBooksPanel() {
        return booksPanel;
    }

    public JComboBox<String> getCategoryComboBox() {
        return categoryComboBox;
    }

    public JComboBox<String> getLanguageComboBox() {
        return languageComboBox;
    }

    public JTextField getSearchField() {
        return searchField;
    }

    public void setCategoryComboBoxListener(ActionListener actionListener){
        categoryComboBox.addActionListener(actionListener);
    }
    public void setLanguageComboBoxListener(ActionListener actionListener){
        languageComboBox.addActionListener(actionListener);
    }
    public void setClearButtonListener(ActionListener actionListener){
        clearButton.addActionListener(actionListener);
    }
}
