package main.java.server.model;
import main.java.common.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class serverModel {
    public static void addABook(Books books){
        try {
            Element bookLibrary;
            File file = new File("src/main/java/server/database/xml/book.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            if(file.exists()){ //The there's an XML file in the directory, then append only the books
                DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = fact.newDocumentBuilder();
                document = db.parse(file);
                document.getDocumentElement().normalize();
                bookLibrary = document.getDocumentElement();
                String sr = bookLibrary.getNodeName();
            } else { //Else create an XML file and append the books
                bookLibrary = document.createElement("bookLibrary");
                document.appendChild(bookLibrary);
            }
            //Root Element
            Element bookElement = document.createElement("book");
            bookLibrary.appendChild(bookElement);

            //Book Image Name of the Book
            Element bookImageName = document.createElement("bookImageName");
            bookImageName.appendChild(document.createTextNode(books.getFileName().trim()));
            bookElement.appendChild(bookImageName);

            //Book ISBN
            Element bookISBN = document.createElement("isbn");
            bookISBN.appendChild(document.createTextNode(books.getISBN().trim()));
            bookElement.appendChild(bookISBN);

            //Book Name
            Element title = document.createElement("bookname");
            title.appendChild(document.createTextNode(books.getBookName().trim()));
            bookElement.appendChild(title);

            //Book Author
            Element author = document.createElement("author");
            author.appendChild(document.createTextNode(books.getAuthor().trim()));
            bookElement.appendChild(author);

            //Book Category
            Element category = document.createElement("category");
            category.appendChild(document.createTextNode(books.getCategory().trim()));
            bookElement.appendChild(category);

            //Book Language
            Element language = document.createElement("language");
            language.appendChild(document.createTextNode(books.getCategory().trim()));
            bookElement.appendChild(language);

            //Book publishedDate
            Element publishDate = document.createElement("published_date");
            publishDate.appendChild(document.createTextNode(books.getLanguage().trim()));
            bookElement.appendChild(publishDate);

            //Book description
            Element description = document.createElement("description");
            description.appendChild(document.createTextNode(books.getDescription().trim()));
            bookElement.appendChild(description);

            //Book status
            Element status = document.createElement("status");
            status.appendChild(document.createTextNode(books.getStatus().toString().trim()));
            bookElement.appendChild(status);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Book has been Created");
        } catch (Exception e) {
            System.out.println("Error on " + e);
        }
    }

    public static void updateABook(Books books){
        //TODO
    }
    public static void deleteABook(Books books){
        //TODO
    }


    public static void addLanguage(Language language){
        try {
            Element languages;
            File file = new File("src/main/java/server/database/xml/language.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            if(file.exists()){ //The there's an XML file in the directory, then append only the books
                DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = fact.newDocumentBuilder();
                document = db.parse(file);
                document.getDocumentElement().normalize();
                languages = document.getDocumentElement();
                String sr = languages.getNodeName();
            } else { //Else create an XML file and append the books
                languages = document.createElement("language");
                document.appendChild(languages);
            }
            //Root Element
            Element Language = document.createElement("language");
            languages.appendChild(Language);

            //Language Name
            Element languageName = document.createElement("language_name");
            languageName.appendChild(document.createTextNode(language.getLanguage().trim()));
            Language.appendChild(languageName);

            //Language date was created
            Element dateCreated = document.createElement("date_created");
            dateCreated.appendChild(document.createTextNode(language.getDateCreated().trim()));
            Language.appendChild(dateCreated);

            //Language Date was Updated
            Element dateUpdated = document.createElement("date_updated");
            dateUpdated.appendChild(document.createTextNode(language.getDateUpdated().trim()));
            Language.appendChild(dateUpdated);

            //Language Status
            Element status = document.createElement("status");
            status.appendChild(document.createTextNode(language.getStatus().toString().trim()));
            Language.appendChild(status);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Book has been Created");
        } catch (Exception e) {
            System.out.println("Error on " + e);
        }
    }
    public static void updateLanguage(Language language){
        //TODO
    }
    public static void deleteLanguage(Language language){
        //TODO
    }

    //Parse the Language XML
    public static List<Language> readLanguageXML(){
        List<Language> languageList = new ArrayList<>();
        try {
            File xmlFile = new File("src/main/java/server/database/xml/language.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("category");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String dateCreated = element.getElementsByTagName("dateCreated").item(0).getTextContent();
                    String dateUpdated = element.getElementsByTagName("dateUpdated").item(0).getTextContent();
                    boolean status = Boolean.parseBoolean(element.getElementsByTagName("status").item(0).getTextContent());

                    Language category = new Language(name, dateCreated, dateUpdated, status);
                    languageList.add(category);
                }
                System.out.print("Number of accounts -> " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return languageList;
    }

    public static void addCategory(Category category){
        try {
            Element categories;
            File file = new File("src/main/java/server/database/xml/category.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            if(file.exists()){ //The there's an XML file in the directory, then append only the books
                DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = fact.newDocumentBuilder();
                document = db.parse(file);
                document.getDocumentElement().normalize();
                categories = document.getDocumentElement();
                String sr = categories.getNodeName();
            } else { //Else create an XML file and append the books
                categories = document.createElement("category");
                document.appendChild(categories);
            }
            //Root Element
            Element Category = document.createElement("category");
            categories.appendChild(Category);

            //Book Image Name of the Book
            Element categoryName = document.createElement("category_name");
            categoryName.appendChild(document.createTextNode(category.getCategory().trim()));
            Category.appendChild(categoryName);

            //Book ISBN
            Element dateCreated = document.createElement("date_created");
            dateCreated.appendChild(document.createTextNode(category.getDateCreated().trim()));
            Category.appendChild(dateCreated);

            //Book Name
            Element dateUpdated = document.createElement("date_updated");
            dateUpdated.appendChild(document.createTextNode(category.getDateUpdated().trim()));
            Category.appendChild(dateUpdated);

            //Book Author
            Element status = document.createElement("status");
            status.appendChild(document.createTextNode(category.getStatus().toString().trim()));
            Category.appendChild(status);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Book has been Created");
        } catch (Exception e) {
            System.out.println("Error on " + e);
        }
    }
    public static void updateCategory(Category category){
        //TODO
    }
    public static void deleteCategory(Category category){
        //TODO
    }

    public static List<Category> readCategoryXML(){
        List<Category> categoryList = new ArrayList<>();
        try {
            File xmlFile = new File("src/main/java/server/database/xml/category.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("category");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String dateCreated = element.getElementsByTagName("dateCreated").item(0).getTextContent();
                    String dateUpdated = element.getElementsByTagName("dateUpdated").item(0).getTextContent();
                    boolean status = Boolean.parseBoolean(element.getElementsByTagName("status").item(0).getTextContent());

                    Category category = new Category(name, dateCreated, dateUpdated, status);
                    categoryList.add(category);
                }
                System.out.print("Number of accounts -> " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categoryList;
    }

    public static void addRole(Role role){
        try {
            Element roles;
            File file = new File("src/main/java/server/database/xml/role.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            if(file.exists()){ //The there's an XML file in the directory, then append only the books
                DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = fact.newDocumentBuilder();
                document = db.parse(file);
                document.getDocumentElement().normalize();
                roles = document.getDocumentElement();
                String sr = roles.getNodeName();
            } else { //Else create an XML file and append the books
                roles = document.createElement("role");
                document.appendChild(roles);
            }
            //Root Element
            Element Role = document.createElement("role");
            roles.appendChild(Role);

            //Book Image Name of the Book
            Element roleName = document.createElement("role_name");
            roleName.appendChild(document.createTextNode(role.getRole().trim()));
            Role.appendChild(roleName);

            //Book ISBN
            Element dateCreated = document.createElement("date_created");
            dateCreated.appendChild(document.createTextNode(role.getDateCreated().trim()));
            Role.appendChild(dateCreated);

            //Book Name
            Element dateUpdated = document.createElement("date_updated");
            dateUpdated.appendChild(document.createTextNode(role.getDateUpdated().trim()));
            Role.appendChild(dateUpdated);

            //Book Author
            Element status = document.createElement("status");
            status.appendChild(document.createTextNode(role.getStatus().toString().trim()));
            Role.appendChild(status);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Book has been Created");
        } catch (Exception e) {
            System.out.println("Error on " + e);
        }
    }
    public static void updateRole(Role role){
        //TODO
    }
    public static void deleteRole(Role role){
        //TODO
    }

    public static void addAuthor(Author author){
        try {
            Element authors;
            File file = new File("src/main/java/server/database/xml/role.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            if(file.exists()){ //The there's an XML file in the directory, then append only the books
                DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = fact.newDocumentBuilder();
                document = db.parse(file);
                document.getDocumentElement().normalize();
                authors = document.getDocumentElement();
                String sr = authors.getNodeName();
            } else { //Else create an XML file and append the books
                authors = document.createElement("author");
                document.appendChild(authors);
            }
            //Root Element
            Element Author = document.createElement("author");
            authors.appendChild(Author);

            //Book Image Name of the Book
            Element authorName = document.createElement("author_name");
            authorName.appendChild(document.createTextNode(author.getAuthor().trim()));
            Author.appendChild(authorName);

            //Book ISBN
            Element dateCreated = document.createElement("date_created");
            dateCreated.appendChild(document.createTextNode(author.getDateCreated().trim()));
            Author.appendChild(dateCreated);

            //Book Name
            Element dateUpdated = document.createElement("date_updated");
            dateUpdated.appendChild(document.createTextNode(author.getDateUpdated().trim()));
            Author.appendChild(dateUpdated);

            //Book Author
            Element status = document.createElement("status");
            status.appendChild(document.createTextNode(author.getStatus().toString().trim()));
            Author.appendChild(status);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Book has been Created");
        } catch (Exception e) {
            System.out.println("Error on " + e);
        }
    }
    public static void updateAuthor(Author author){
        //TODO
    }
    public static void deleteAuthor(Author author){
        //TODO
    }

    public static void addBookRequestee(BooksRequestee booksRequestee){
        //TODO
    }
    public static void deleteBookRequestee(BooksRequestee booksRequestee){
        //TODO
    }

    public static void addBookBorrower(BooksBorrower booksBorrower){
        //TODO
    }
    public static void deleteBookBorrower(BooksBorrower booksBorrower){
        //TODO
    }

    public static void addBookmark(Bookmarks bookmarks){
        //TODO
    }
    public static void deleteBookmark(Bookmarks bookmarks){
        //TODO
    }

    //Method that returns a parsed List of Accounts
    public static List<Accounts> readAccounts() {
        List<Accounts> accounts = new ArrayList<>();
        try {
            File xmlFile = new File("src/main/java/server/database/xml/accounts.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("account");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String imageName = element.getElementsByTagName("imageName").item(0).getTextContent();
                    String id = element.getElementsByTagName("id").item(0).getTextContent();
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String username = element.getElementsByTagName("username").item(0).getTextContent();
                    String password = element.getElementsByTagName("password").item(0).getTextContent();
                    String course = element.getElementsByTagName("course").item(0).getTextContent();
                    String role = element.getElementsByTagName("role").item(0).getTextContent();
                    boolean status = Boolean.parseBoolean(element.getElementsByTagName("status").item(0).getTextContent());

                    Accounts account = new Accounts(imageName, id, name, username, password, course, role, status);
                    accounts.add(account);
                }
                System.out.print("Number of accounts -> " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }
}
