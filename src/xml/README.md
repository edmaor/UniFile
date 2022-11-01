# XmlRW

### METHODS
|                                           Modifier & Type                                           | Method & Description                                                           |
|:---------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------|
|  [Document](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Document.html)  | **getDocument()**                                                              |
|                                                void                                                 | **setDocument()**                                                              |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | **createRoot(String rootName)**                                                |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | **createChild(String childName)**                                              |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | **createChild(String childName, String attribute, String value)**              |
|   [Element](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html)   | **createElement(Element child, String field, Sting value)**                    |
| [Element\[\]](https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/org/w3c/dom/Element.html) | **createElement(Element child, String[] ... valuePairs)**                      |
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
###### CreateRoot
> 
###### CreateChild
###### CreateElement
###### ExportToXml
> exportToXml(String fileName, int indentSize)
> Takes a file path and an indent size as parameters and transforms the current Document into a xml file.
> > > fileName -> The path of the file to write. If it doesn't exist it will create it automatically.
> > indentSize -> The size of the indent in int.
###### ListToXml
> listToXml(String _fileName_, int _indentSize_, ArrayList<?> _objects_)
> Takes a list of objects, a file path and an indent as parameters and transforms them into a xml file.
> > fileName -> The path of the file to write. If it doesn't exist it will create it automatically.
> > indentSize -> The size of the indent in int.
> > objects -> The list of objects to transform to xml.