/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tasktwo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    //task1 for reading file and print out the field values 
    // public static void PrintingValues (){
    //     String fileName = "C:/Users/Mavhungu Marcia/taskTwo/app/src/main/resources/data.xml";
        
    //     try {
    //         File file = new File(fileName);
    //         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    //         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    //         Document doc = dBuilder.parse(file);

    //         doc.getDocumentElement().normalize();
    //         NodeList recordList = doc.getElementsByTagName("record");

    //         for (int i = 0; i < recordList.getLength(); i++) {
    //             Element recordElement = (Element) recordList.item(i);
    //             String name = recordElement.getElementsByTagName("name").item(0).getTextContent();
    //             String postalZip = recordElement.getElementsByTagName("postalZip").item(0).getTextContent();
    //             String region = recordElement.getElementsByTagName("region").item(0).getTextContent();
    //             String country = recordElement.getElementsByTagName("country").item(0).getTextContent();
    //             String address = recordElement.getElementsByTagName("address").item(0).getTextContent();
    //             String list = recordElement.getElementsByTagName("list").item(0).getTextContent();

    //             System.out.println("Name: " + name);
    //             System.out.println("Postal Zip: " + postalZip);
    //             System.out.println("Region: " + region);
    //             System.out.println("Country: " + country);
    //             System.out.println("Address: " + address);
    //             System.out.println("List: " + list);
    //             System.out.println("-----");
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
    // public static void UserSelectedfield(){
    //     try {
    //         // Load XML file
    //         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    //         DocumentBuilder builder = factory.newDocumentBuilder();
    //         Document doc = builder.parse("C:/Users/Mavhungu Marcia/taskTwo/app/src/main/resources/data.xml"); // Replace with the path to your XML file

    //         // Get user input for fields to display
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.println("Enter comma-separated field names to display: ");
    //         if (scanner.hasNextLine()) {
    //             String input = scanner.nextLine();
    //             String[] fields = input.split(",");

    //             // Loop through the record element
    //             NodeList recordList = doc.getElementsByTagName("record");
    //             for (int i = 0; i < recordList.getLength(); i++) {
    //                 Element recordElement = (Element) recordList.item(i);

    //                 // Loop through the selected fields and display their values
    //                 for (String field : fields) {
    //                     field = field.trim();
    //                     NodeList fieldList = recordElement.getElementsByTagName(field);
    //                     if (fieldList.getLength() > 0) {
    //                         Element fieldElement = (Element) fieldList.item(0);
    //                         System.out.println(field + ": " + fieldElement.getTextContent());
    //                     } else {
    //                         System.out.println(field + ": Not found");
    //                     }
    //                 }
    //             }
    //         } else {
    //             System.out.println("No input provided. Exiting...");
    //         }

    //         scanner.close();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // public static void JasonFormat() {
    //     try {
    //         // Load XML file
    //         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    //         DocumentBuilder builder = factory.newDocumentBuilder();
    //         Document doc = builder.parse("C:/Users/Mavhungu Marcia/taskTwo/app/src/main/resources/data.xml"); // Replace with the path to your XML file

    //         // Get user input for fields to display
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.println("Enter comma-separated field names to display: ");
    //         if (scanner.hasNextLine()) {
    //             String input = scanner.nextLine();
    //             String[] fields = input.split(",");

    //             JSONArray recordsArray = new JSONArray();
    //             // Loop through the record element
    //             NodeList recordList = doc.getElementsByTagName("record");
    //             for (int i = 0; i < recordList.getLength(); i++) {
    //                 Element recordElement = (Element) recordList.item(i);
    //                 JSONObject recordObject = new JSONObject();

    //                 // Loop through the selected fields and add them to the recordObject
    //                 for (String field : fields) {
    //                     field = field.trim();
    //                     NodeList fieldList = recordElement.getElementsByTagName(field);
    //                     if (fieldList.getLength() > 0) {
    //                         Element fieldElement = (Element) fieldList.item(0);
    //                         String fieldValue = fieldElement.getTextContent();
    //                         recordObject.put(field, fieldValue);
    //                     } else {
    //                         recordObject.put(field, "Not found");
    //                     }
    //                 }

    //                 recordsArray.put(recordObject);
    //             }

    //             JSONObject outputObject = new JSONObject();
    //             outputObject.put("records", recordsArray);

    //             System.out.println(outputObject.toString(4)); // Output JSON with 4-space indentation
    //         } else {
    //             System.out.println("No input provided. Exiting...");
    //         }

    //         scanner.close();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // public static void Validation(){
    //     try {
    //         // Load XML file
    //         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    //         DocumentBuilder builder = factory.newDocumentBuilder();
    //         Document doc = builder.parse("C:/Users/Mavhungu Marcia/taskTwo/app/src/main/resources/data.xml"); // Replace with the path to your XML file

    //         // Get user input for fields to display
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.println("Enter comma-separated field names to display: ");
    //         if (scanner.hasNextLine()) {
    //             String input = scanner.nextLine();
    //             String[] fields = input.split(",");

    //             // Create an array of JSON objects
    //             JSONArray jsonRecords = new JSONArray();

    //             // Loop through the record elements
    //             NodeList recordList = doc.getElementsByTagName("record");
    //             for (int i = 0; i < recordList.getLength(); i++) {
    //                 Element recordElement = (Element) recordList.item(i);
    //                 JSONObject jsonRecord = new JSONObject();

    //                 // Loop through the selected fields and add them to the JSON object
    //                 for (String field : fields) {
    //                     field = field.trim();
    //                     NodeList fieldList = recordElement.getElementsByTagName(field);
    //                     if (fieldList.getLength() > 0) {
    //                         Element fieldElement = (Element) fieldList.item(0);
    //                         String fieldValue = fieldElement.getTextContent();
    //                         jsonRecord.put(field, fieldValue);
    //                     } else {
    //                         System.out.println("Field '" + field + "' not found in the XML file.");
    //                         jsonRecord.put(field, ""); // Add empty value if field not found
    //                     }
    //                 }

    //                 // Add the JSON object to the array
    //                 jsonRecords.put(jsonRecord);
    //             }

    //             // Output the JSON array
    //             System.out.println(jsonRecords.toString());
    //         }

    //     } catch (Exception e) {
    //         System.out.println("An error occurred: " + e.getMessage());
    //     }
    // }
    
//     public static void SwitchToSAXParser(){
//         try {
//             // Get user input for fields to display
//             Scanner scanner = new Scanner(System.in);
//             System.out.println("Enter comma-separated field names to display: ");
//             if (scanner.hasNextLine()) {
//                 String input = scanner.nextLine();
//                 String[] fields = input.split(",");

//                 // Create an array of JSON objects
//                 JSONArray jsonRecords = new JSONArray();

//                 // Create a SAX handler to parse the XML file
//                 SAXParserFactory factory = SAXParserFactory.newInstance();
//                 SAXParser parser = factory.newSAXParser();
//                 parser.parse("example.xml", new DefaultHandler() {
//                     private JSONObject jsonRecord;
//                     private StringBuilder content;

//                     @Override
//                     public void startElement(String uri, String localName, String qName, Attributes attributes)
//                             throws SAXException {
//                         content = new StringBuilder();
//                     }

//                     @Override
//                     public void characters(char[] ch, int start, int length) throws SAXException {
//                         content.append(new String(ch, start, length));
//                     }

//                     @Override
//                     public void endElement(String uri, String localName, String qName) throws SAXException {
//                         String fieldValue = content.toString().trim();
//                         if (!fieldValue.isEmpty()) {
//                             if (qName.equals("record")) {
//                                 // Add the JSON object to the array
//                                 jsonRecords.put(jsonRecord);
//                                 jsonRecord = new JSONObject();
//                             } else if (containsField(fields, qName)) {
//                                 // Add the field and its value to the JSON object
//                                 jsonRecord.put(qName, fieldValue);
//                             }
//                         }
//                     }

//                     private boolean containsField(String[] fields, String fieldName) {
//                         for (String field : fields) {
//                             if (field.trim().equals(fieldName)) {
//                                 return true;
//                             }
//                         }
//                         return false;
//                     }
//                 });

//                 // Output the JSON array
//                 System.out.println(jsonRecords.toString());
//             }
//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
    





//     public static void main(String[] args) {
//         System.out.println(new App().getGreeting());
//         //App.PrintingValues();    // calling printing values method (task2 , 1)
//         //App.UserSelectedfield(); // calling user selected field method (task2 , 2)
//         //App.JasonFormat();       // calling jason format method (task2 , 3)
//         //App.Validation();        // calling validation method (task2 , 4)
//         App.SwitchToSAXParser(); // calling switch to sax parser method (task2 , 5)
//     }    
