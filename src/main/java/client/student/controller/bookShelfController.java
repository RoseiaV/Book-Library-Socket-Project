package main.java.client.student.controller;


import main.java.client.student.model.bookShelfModel;
import main.java.client.student.view.bookShelfPanel;

public class bookShelfController {
    private bookShelfModel bookShelfModel;
    private bookShelfPanel bookShelfPanel;

    public bookShelfController( bookShelfPanel bookShelfPanel, bookShelfModel bookShelfModel){
        this.bookShelfModel = bookShelfModel;
        this.bookShelfPanel = bookShelfPanel;
    }
}
