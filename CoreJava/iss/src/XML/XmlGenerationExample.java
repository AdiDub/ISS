package XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlGenerationExample {
    public static void main(String[] args) {
        try {
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Create a new XML document
            Document document = builder.newDocument();

            // Create the root element
            Element rootElement = document.createElement("employees");
            document.appendChild(rootElement);

            // Create employee elements
            for (int i = 1; i <= 3; i++) {
                Element employeeElement = document.createElement("employee");
                rootElement.appendChild(employeeElement);

                // Create name element and set text content
                Element nameElement = document.createElement("name");
                nameElement.setTextContent("Employee " + i);
                employeeElement.appendChild(nameElement);

                // Create age element and set text content
                Element ageElement = document.createElement("age");
                ageElement.setTextContent(String.valueOf(25 + i));
                employeeElement.appendChild(ageElement);
            }

            // Print the XML document
            System.out.println(documentToString(document));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String documentToString(Document document) throws Exception {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(writer));
        return writer.getBuffer().toString();
    }
}
