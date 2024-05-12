package main.java.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnection implements Runnable{

    protected Socket socket;
    protected ObjectInputStream objectInputStream;

    public ClientConnection(Socket socket) throws IOException {
        this.socket = socket;
        objectInputStream = new ObjectInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        try {
            while (true){
                String response = (String) objectInputStream.readObject();
                System.out.println("Server response -> " + response);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
