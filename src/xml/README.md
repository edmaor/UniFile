# XmlRW

### METHODS
|                                           Modifier & Type                                           | Method & Link                                                                  |
|:---------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------|
|  [Document](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Document.html)  | **getDocument()**                                                              |
|                                                void                                                 | **setDocument()**                                                              |
|                                                void                                                 | [clearDocument](#cleardocument)                                                |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | [createRoot(String rootName)](#createroot)                                     |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | [createChild(String childName)](#createchild)                                  |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | [createChild(String childName, String attribute, String value)](#createchild)  |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | [createElement(Element child, String field, Sting value)](#createelement)      |
| [Element\[\]](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) | [createElement(Element child, String[] ... valuePairs)](#createelement)        |
|                                                void                                                 | [exportToXml(String fileName, int indentSize)](#exporttoxml)                   |
|                                                void                                                 | [listToXml(String fileName, int indentSize, ArrayList<?> objects)](#listtoxml) |
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<Users> <!-- Root -->
    <User> <!-- Child -->
        <firstName>Edu</firstName> <!-- Element -->
        <lastName>Martorell</lastName> <!-- Element -->
        <height>188</height> <!-- Element -->
    </User>
</Users>
```
###### ClearDocument
Sets the Document to an empty document
> clearDocument()<br>
---
###### CreateRoot 
Creates the root of the document, it must be empty.
> [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) createRoot(String _rootName_)<br>
> * rootName -> The name of the root element.
---
###### CreateChild
Creates a child in the document, **_must have a root element defined_**.
> [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) createChild(String _rootName_)<br>
> * childName -> The name of the child element.

> [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) createChild(String childName, String attribute, String value) <br>
> * childName -> The name of the child element.
> * attribute -> The name of the attribute of the child.
> * value -> The value of the attribute of the child. 

> [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) createChild(Object _object_)<br>
> * object -> The object to transform to a child.

###### CreateElement
Creates an element in a child Element
> [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) createElement(Element child, String field, Sting value)
> * child -> the child Element to append the Element.
> * field -> name of the field
> * value -> value of the field

> [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) createElement(Element child, String[] ... valuePairs)
> * child -> the child element to append the Elements.
> * valuePairs -> pair values to append to the child.
>   * Example : { "firstName","Edu"}
---
###### ExportToXml
> exportToXml(String fileName, int indentSize)<br>
> Takes a file path and an indent size as parameters and transforms the current Document into a xml file.
> * fileName -> The path of the file to write. If it doesn't exist it will create it automatically.
> * indentSize -> The size of the indent in int.
---
###### ListToXml
> listToXml(String _fileName_, int _indentSize_, ArrayList<?> _objects_)<br>
> Takes a list of objects, a file path and an indent as parameters and transforms them into a xml file.
> * fileName -> The path of the file to write. If it doesn't exist it will create it automatically.
> * indentSize -> The size of the indent in int.
> * objects -> The list of objects to transform to xml.
---