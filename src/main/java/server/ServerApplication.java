package main.java.server;

import main.java.server.controller.serverController;
import main.java.server.model.serverModel;
import main.java.server.view.ServerMainGUI;

import java.rmi.RemoteException;

public class ServerApplication {
    public static void main(String[] args) throws RemoteException {
        ServerMainGUI view = new ServerMainGUI();
        view.setIpAddressToStatusTextField();
        serverModel model = new serverModel();
        serverController controller = new serverController(view, model);
    }
}
