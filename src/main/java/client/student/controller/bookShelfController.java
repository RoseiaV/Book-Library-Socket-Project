package main.java.client.student.controller;

import main.java.client.socketConnector;
import main.java.client.student.model.bookShelfModel;
import main.java.client.student.view.bookShelfPanel;

public class bookShelfController {
    private bookShelfModel bookShelfModel;
    private bookShelfPanel bookShelfPanel;
    private socketConnector socketConnector;

    public bookShelfController(socketConnector socketConnector, bookShelfPanel bookShelfPanel, bookShelfModel bookShelfModel){
        this.socketConnector = socketConnector;
        this.bookShelfModel = bookShelfModel;
        this.bookShelfPanel = bookShelfPanel;
    }
}
