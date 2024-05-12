package main.java.server.controller;

import main.java.server.model.ClientHandler;
import main.java.server.model.serverModel;
import main.java.server.view.ServerMainGUI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class serverController {
    private ServerMainGUI view;
    private serverModel model;

    protected List<ClientHandler> clientHandlers = new ArrayList<>();
    protected ExecutorService pool = Executors.newFixedThreadPool(15);

    public serverController(ServerMainGUI view, serverModel model){
        this.view = view;
        this.model = model;

        view.setStartServiceButton(e -> {
            System.out.println("Start the Server");
            startServer();
        });
        view.setStopServiceButton( e -> {
            System.out.println("Stop the server");
            stopServer();
        });
    }

    public void startServer(){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(10000);
            System.out.println("Server: Waiting for client connections...");
            while (true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client -> { " + clientSocket + " } has connected to the Server.");
                ClientHandler clientThread = new ClientHandler(clientSocket, clientHandlers);

                System.out.println("Adding Client -> { " + clientSocket + " } to the List of Clients");
                clientHandlers.add(clientThread);

//                new Thread(clientThread).start();
                System.out.println("Executing Client with Executor");
                pool.execute(clientThread);
            }
//            do {
//                Socket clientSocket = serverSocket.accept();
//                System.out.println("Server: Client connected.");
//
//                ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
//                ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
//                // Start a new thread to handle the client
//                ClientHandler clientHandler = new ClientHandler(clientSocket, objectOutputStream, objectInputStream);
//                new Thread(clientHandler).start();
//                //clientHandler.run();
////                Thread clientThread = new Thread(new ClientHandler(clientSocket));
////                clientThread.start();
//            } while (true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void stopServer() {
        //TODO
    }
}
