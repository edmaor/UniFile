package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class XmlRW {
    private Document document;

    public XmlRW() {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            this.document = builder.newDocument();
            this.document.setXmlVersion("1.0");
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public Document getDocument() {
        return document;
    }
    public void setDocument(Document document) {
        this.document = document;
    }
    public Element createRoot(String name){
        Element element = document.createElement(name);
        document.appendChild(element);
        return element;
    }
    public Element createChild(String name){
        Element element = document.createElement(name);
        document.getDocumentElement().appendChild(element);
        return element;
    }
    public Element createChild(String name, String attribute, String value ){
        Element element = document.createElement(name);
        element.setAttribute(attribute, value);
        document.getDocumentElement().appendChild(element);
        return element;
    }
    public void createElement(Element child, String field, String value ){
        Element element = document.createElement(field);
        Text text = document.createTextNode(value);
        element.appendChild(text);
        child.appendChild(element);
    }
    public void createElement(Element child,String[] ... values ){
        for (String[] value: values) {
            Element element = document.createElement(value[0]);
            Text text = document.createTextNode(value[1]);
            element.appendChild(text);
            child.appendChild(element);
        }
    }
    public Transformer createTransformer(int indentSize) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xalan}indent-amount", String.valueOf(indentSize));
            return transformer;
        } catch (TransformerConfigurationException tce) {
            throw new RuntimeException(tce);
        }
    }
    public void exportToXml(String outputFile, int indentSize){
        try {
            FileWriter fw = new FileWriter(outputFile);
            Source source = new DOMSource(document);
            Result xmlFile = new StreamResult(fw);
            Transformer transformer = createTransformer(indentSize);
            transformer.transform(source, xmlFile);
        } catch (IOException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    public void exportToXml(String outputFile, int indentSize, ArrayList<?> objects) throws IllegalAccessException {
        int i = 0;
        createRoot(objects.get(i).getClass().getSimpleName() + 's');
        for (Object o: objects){
            Element child = createChild(o.getClass().getSimpleName(),"id", String.valueOf(i));
            for (Field f : o.getClass().getDeclaredFields()){
                f.setAccessible(true);
                createElement(child, (String)f.getName(), String.valueOf(f.get(o)));
            }
            i++;
        }
        try {
            FileWriter fw = new FileWriter("src/xml/employees.xml");
            Source source = new DOMSource(document);
            Result xmlFile = new StreamResult(fw);
            Transformer transformer = createTransformer(indentSize);
            transformer.transform(source, xmlFile);
        } catch (IOException |TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
