//package client;
//
////import client.librarian.controller.*;
////import client.librarian.model.*;
//import client.librarian.view.*;
////import client.student.controller.*;
////import client.student.model.applicationModel;
////import client.student.model.dataAccessClass;
//import client.student.view.*;
//import common.Accounts;
////import shared.ClientInterface;
//
//import javax.swing.*;
//import java.awt.*;
//import java.rmi.AccessException;
//import java.rmi.NotBoundException;
//import java.rmi.RemoteException;
//import java.rmi.UnknownHostException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//import java.util.List;
//import common.*;
//
//public class ReadMeApplication {
//    public static void main(String[] args) {
//        ReadMeApplication readMeApplication = new ReadMeApplication();
//        readMeApplication.logInAuthenticate();
//    }
//
//    //Method to log in an account and gain access to the
//    public void logInAuthenticate(){
//        logInForm logInForm = new logInForm();
//        logInForm.setVisible(true);
//
//        logInForm.setLogInButtonListener(e -> {
//
//            String username = logInForm.getStudentField();
//            String pass = logInForm.getPasswordField();
//            String ip = logInForm.getServerField();
//
//            Accounts accounts = new Accounts(null,  username, pass);
//
//            if (logInForm.getStudentField().isEmpty() || logInForm.getPasswordField().isEmpty()){
//                JOptionPane.showMessageDialog(null, "Empty Fields is not allowed!");
//            } else if (logInForm.getServerField().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Server Field is Empty, Please input the Server IP");
//            } else {
//
//                try {
//                    Registry registry = LocateRegistry.getRegistry(ip, 10000);
//                    ClientInterface client = (ClientInterface) registry.lookup("SERVER");
//
//                    if(client.logInAuthenticate(accounts)){
//                        List<Accounts> accountsList = client.getAccountsData(); //Get the account list from the server
//
//                        //Iterate and locate the account from the account list
//                        for (Accounts acc : accountsList){
//
//                            //Check if that account is equals to the credentials that the user have entered
//                            if (acc.getUsername().equals(accounts.getUsername()) && acc.getPassword().equals(accounts.getPassword())){
//
//                                //Check if that account is an Librarian
//                                if (acc.getRole().equals("Librarian")){
//
//                                    JOptionPane.showMessageDialog(null, "Welcome Librarian " + accounts.getUsername());
//                                    logInForm.dispose();
//                                    librarianApplication(client, accounts);
//
//                                } else { //Logged in as a Student
//
//                                    JOptionPane.showMessageDialog(null, "Welcome " + accounts.getUsername() + ". Have a nice day.");
//                                    logInForm.dispose();
//                                    studentApplication(client, acc);
//                                }
//
//                            } else {
//                                System.out.println("No such account exist");
//                            }
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Incorrect Password or Username");
//                    }
//
//                    logInForm.setServerField("");
//                    logInForm.setStudentField("");
//                    logInForm.setPasswordField("");
//                } catch (UnknownHostException unknownHostException){
//                    JOptionPane.showMessageDialog(null, "Server is Down");
//                } catch (AccessException ex) {
//                    JOptionPane.showMessageDialog(null, "Access Denied");
//                    throw new RuntimeException(ex);
//                } catch (NotBoundException ex) {
//                    JOptionPane.showMessageDialog(null, "Failed to connect to server");
//                    throw new RuntimeException(ex);
//                } catch (RemoteException ex) {
//                    JOptionPane.showMessageDialog(null, "Connection Error");
//                    throw new RuntimeException(ex);
//                }
//            }
//        });
//    }
//
//
//
//    public static void librarianApplication(ClientInterface clientInterface, Accounts accounts){
//        try {
//        AdminFrame mainView = new AdminFrame();
//
//        ManageLibraryPanel libraryPanel = new ManageLibraryPanel();
//        ManageLibraryModel libraryModel = new ManageLibraryModel(clientInterface);
//        ManageLibraryController manageLibraryController = new ManageLibraryController(libraryPanel, libraryModel);
//
//        ManageAuthorPanel authorPanel = new ManageAuthorPanel();
//        ManageAuthorModel authorModel = new ManageAuthorModel(clientInterface);
//        ManageAuthorController authorController = new ManageAuthorController(authorPanel, authorModel);
//
//        ManageCategoryPanel categoryPanel = new ManageCategoryPanel();
//        ManageCategoryModel categoryModel = new ManageCategoryModel(clientInterface);
//        ManageCategoryController categoryController = new ManageCategoryController(categoryPanel, categoryModel);
//
//        ManageLanguagePanel languagePanel = new ManageLanguagePanel();
//        ManageLanguageModel languageModel = new ManageLanguageModel(clientInterface);
//        ManageLanguageController languageController = new ManageLanguageController(languagePanel, languageModel);
//
//        ManageAccountPanel accountPanel = new ManageAccountPanel();
//        ManageAccountModel accountModel = new ManageAccountModel(clientInterface);
//        ManageAccountController accountController = new ManageAccountController(accountPanel, accountModel);
//
//        ManageRolePanel rolePanel = new ManageRolePanel();
//        ManageRoleModel roleModel = new ManageRoleModel(clientInterface);
//        ManageRoleController roleController = new ManageRoleController(rolePanel, roleModel);
//
//        IssueBookPanel issueBookPanel = new IssueBookPanel();
//        IssueBookModel issueBookModel = new IssueBookModel(clientInterface);
//        IssueBookController issueBookController = new IssueBookController(issueBookPanel, issueBookModel);
//
//        AdminFrameModel mainModel = new AdminFrameModel(clientInterface);
//        AdminFrameController mainController = new AdminFrameController(
//                mainView, libraryPanel, authorPanel, categoryPanel, languagePanel, accountPanel, rolePanel, issueBookPanel,
//                mainModel, libraryModel, authorModel, categoryModel, languageModel, accountModel, roleModel, issueBookModel);
//
//        //CallBack
//        AdminCallBack adminCallBack = new AdminCallBack(issueBookPanel, issueBookModel);
//        clientInterface.registerAdminCallBack(adminCallBack);
//
//        mainView.setVisible(true);
//        //Store the username & password on the labels temporarly
//        mainView.setUserNameLabel(accounts.getUsername());
//        mainView.setUserPassWordLabel(accounts.getPassword());
//
//        } catch (RemoteException e) {
//            JOptionPane.showMessageDialog(null, "System Error!");
//        }
//    }
//
//    public static void studentApplication(ClientInterface clientInterface, Accounts accounts){
//        try {
//            dataAccessClass model = new dataAccessClass(clientInterface);
//
//            applicationModel applicationModel = new applicationModel();
//            application application = new application();
//            application.setUserMailLabel(accounts.getUsername()); //Sets the user Email from the Main Frame
//            application.setUserIdLabel(accounts.getId()); //Sets the user ID from the Main Frame
//            application.setVisible(true); // Show the MainFrame
//            homePanel homePanel = new homePanel();
//            libraryPanel libraryPanel = new libraryPanel();
//            bookShelfPanel bookShelfPanel = new bookShelfPanel();
//            transcriptPanel transcriptPanel = new transcriptPanel();
//            viewBook viewBook = new viewBook();
//
//            //homePanel.getWelcomingLabel().setText("WELCOME " + accounts.getUsername()); //Sets the welcoming message on the homepage
//
//
//            homeController homeController = new homeController(application, homePanel,viewBook, model);
//            applicationController applicationController = new applicationController(application, homePanel, libraryPanel, bookShelfPanel, transcriptPanel, model, applicationModel);
//            libraryController libraryController = new libraryController(application, libraryPanel, viewBook, model);
//            viewBookController viewBookController = new viewBookController(application,libraryPanel, viewBook, model);
//            bookShelfController bookShelfController = new bookShelfController(application, bookShelfPanel, model);
//            transcriptController transcriptController = new transcriptController(application,viewBook, transcriptPanel, model);
//            CallbackImplementation callbackImplementation = new CallbackImplementation(transcriptController, application, homePanel, libraryPanel, transcriptPanel, viewBook, model);
//            clientInterface.registerCallBack(callbackImplementation); //Register the Callback
//        } catch (RemoteException e) {
//            JOptionPane.showMessageDialog(null, "System Error!");
//        }
//    }
//}
