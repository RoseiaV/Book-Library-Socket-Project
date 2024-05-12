package main.java.server.model;

import main.java.common.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ClientHandler implements Runnable{
    protected Socket socket;
    private static ConcurrentHashMap<String, String> loggedAccount = new ConcurrentHashMap<>();
    protected List<ClientHandler> clientHandlerList;
    protected Operation operation;
    protected String Who;
    protected ObjectOutputStream objectOutputStream;
    protected ObjectInputStream objectInputStream;

    public ClientHandler(Socket socket, List<ClientHandler> clientHandlerList) throws IOException {
        System.out.println("Socket");
        this.socket = socket;
        this.clientHandlerList = clientHandlerList;
        objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectInputStream = new ObjectInputStream(socket.getInputStream());
    }

    @Override
    public void run(){
        System.out.println("Public void run()");
        try {
            System.out.println("Running");
            operation = (Operation) objectInputStream.readObject();
//            Object object = (Object) objectInputStream.readObject();
//            while ((operation = (Operation) objectInputStream.readObject()) != null){
                System.out.println("While true");
                switch (operation.getUser()){
                    case "admin" :
                        System.out.println("Executing the admin side Operation");
                        //adminOperation(object, operation);
                        break;
                    case "client" :
                        System.out.println("Executing the client side Operation");

                        //clientOperation(objectOutputStream, objectInputStream, object, operation);
                        clientOperation(operation);
                        break;
                }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void adminOperation(Object object, Operation operation){
        System.out.println("Admin Operation is being used");
        switch(object.getClass().getSimpleName()){
            case "Books" :
                System.out.println("Admin have used the Book Constructor");
                Books books = (Books) object;
                BookManagement(books, operation.getMainOperation());
                break;
            case "Accounts" :
                System.out.println("Admin have used the Accounts Constructor");
                Accounts accounts = (Accounts) object;
                AccountManagement(accounts, operation.getMainOperation());
                break;
            case "Language" :
                System.out.println("Admin have used the Language Constructor");
                break;
            case "Category" :
                System.out.println("Admin have used the Category Constructor");
                break;
            case "Role" :
                System.out.println("Admin have used the Role Constructor");
                break;
        }
    }

    public void clientOperation(Operation operation){
        System.out.println("Client Operation is being used");
        switch(operation.getMainOperation()){
            case "login" :
                try {
                    System.out.println("Client is trying to logIn");
                    System.out.println("Who is currently online? -> " + loggedAccount);
                    List<Accounts> accountsList = serverModel.readAccounts(); //Receive the Object
                    Accounts account = (Accounts) objectInputStream.readObject();
                    System.out.println("Account info -> " + account.getUsername() + " , " + account.getPassword());
                    //Iterate the List of Accounts parsed in the serverModel.Class
                    for (Accounts accounts : accountsList){
                        //Check if the Account Exist
                        if (accounts.getUsername().equals(account.getUsername()) && accounts.getPassword().equals(account.getPassword())){
                            if (loggedAccount.containsValue(account.getUsername())){ //Check if the Account is Logged already in used
                                System.out.println("Putting " + account.getUsername() + account.getPassword() + " to the Concurrent hashmap");
                                loggedAccount.put(accounts.getId(),account.getUsername());
                                System.out.println("Concurrent Hashmap -> " + loggedAccount);

                                System.out.println("Sending response to the client");
                                objectOutputStream.writeObject("valid"); //Notify the Client that the account is valid
                            } else {
                                System.out.println("Account is Currently in used");
                                objectOutputStream.writeObject("accountIsUsed");
                            }
                        } else {
                            System.out.println("Account does not Exist");
                            objectOutputStream.writeObject("accountNotExist");
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "getCategory" :
                System.out.println("Client is trying to get the Category");
                List<Category> categoryList = serverModel.readCategoryXML();
                try {
                    objectOutputStream.writeObject(categoryList);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "getLanguage" :
                System.out.println("Client is trying to get the Language");
                List<Language> languageList = serverModel.readLanguageXML();
                try {
                    objectOutputStream.writeObject(languageList);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "getLibrary" :
                System.out.println("Client is trying to get the Library Filter");
                List<Category> categories = serverModel.readCategoryXML();
                List<Language> languages = serverModel.readLanguageXML();
                try {
                    //Send the List of Categories and Languages to the Client
                    objectOutputStream.writeObject(categories);
                    objectOutputStream.writeObject(languages);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    //Librarian BookManagement Method for managing Books on the Library
    public static void BookManagement(Books books, String subOperation){
        switch(subOperation){
            case "create" :
                System.out.println("Create a Book");
                serverModel.addABook(books);
                break;
            case "update" :
                System.out.println("Update a Book");
                break;
            case "delete" :
                System.out.println("Delete a book");
                break;
            default: System.out.println("System Error");
        }
    }
    public static void LanguageManagement(Language language, String subOperation){
        switch (subOperation){
            case "create" :
                System.out.println("Create a Book");
                break;
            case "update" :
                System.out.println("Update a Book");
                break;
            case "delete" :
                System.out.println("Delete a book");
                break;
            default: System.out.println("System Error");
        }
    }
    public static void Role(Accounts accounts, String subOperation){
        switch (subOperation){
            case "create" :
                System.out.println("Create a Book");
                break;
            case "update" :
                System.out.println("Update a Book");
                break;
            case "delete" :
                System.out.println("Delete a book");
                break;
            default: System.out.println("System Error");
        }
    }
    public static void Category(Category category, String subOperation){
        switch (subOperation){
            case "create" :
                System.out.println("Create a Book");
                break;
            case "update" :
                System.out.println("Update a Book");
                break;
            case "delete" :
                System.out.println("Delete a book");
                break;
            default: System.out.println("System Error");
        }
    }
    public static void AccountManagement(Accounts accounts, String subOperation){
        switch (subOperation){
            case "create" :
                System.out.println("Create a Book");
                break;
            case "update" :
                System.out.println("Update a Book");
                break;
            case "delete" :
                System.out.println("Delete a book");
                break;
            default: System.out.println("System Error");
        }
    }


}
